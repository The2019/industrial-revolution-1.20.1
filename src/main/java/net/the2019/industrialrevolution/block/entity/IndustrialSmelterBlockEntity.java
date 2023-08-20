package net.the2019.industrialrevolution.block.entity;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.the2019.industrialrevolution.block.ModBlocks;
import net.the2019.industrialrevolution.item.ModItems;
import net.the2019.industrialrevolution.screen.IndustrialSmelterScreenHandler;
import org.jetbrains.annotations.Nullable;

public class IndustrialSmelterBlockEntity extends BlockEntity implements ExtendedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(4, ItemStack.EMPTY);

    private static final int INPUT_SLOT_1 = 0;
    private static final int INPUT_SLOT_2 = 1;
    private static final int OUTPUT_SLOT = 2;
    private static final int ENERGY_SLOT = 3;

    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 72;

    public IndustrialSmelterBlockEntity( BlockPos pos, BlockState state) {
        super(ModBlockEntities.INDUSTRIAL_SMELTER_BLOCK_ENTITY, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            @Override
            public int get(int index) {
                return switch (index){
                    case 0 -> IndustrialSmelterBlockEntity.this.progress;
                    case 1 -> IndustrialSmelterBlockEntity.this.maxProgress;
                    default ->  0;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index){
                    case 0: IndustrialSmelterBlockEntity.this.progress = value;
                    case 1: IndustrialSmelterBlockEntity.this.maxProgress = value;
                }
            }

            @Override
            public int size() {
                return 2;
            }
        };
    }

    @Override
    public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buf) {
        buf.writeBlockPos(this.pos);
    }

    @Override
    public Text getDisplayName() {
        return Text.literal("Industrial Smelter");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new IndustrialSmelterScreenHandler(syncId, playerInventory, this, propertyDelegate);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return this.inventory;
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("industrial_smelter.progress", progress);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inventory);
        progress = nbt.getInt("industrial_smelter.progress");
        super.readNbt(nbt);
    }

    public void tick(World world, BlockPos pos, BlockState state) {
         if(canInsertIntoOutputSlot() && hasRecipe()){
            increaseCraftingProgress();
            markDirty(world, pos, state);
            
            if(hasCraftFinished()){
                craftItem();
                resetProgress();
            }
         }else {
             resetProgress();
         }
    }

    private void resetProgress() {
        progress = 0;
    }

    private void craftItem() {
        this.removeStack(INPUT_SLOT_1, 1);
        this.removeStack(INPUT_SLOT_2, 1);
        this.setStack(OUTPUT_SLOT, new ItemStack(ModItems.INDUSTRIAL_METAL_INGOT, this.getStack(OUTPUT_SLOT).getCount() + 1));
    }

    private boolean hasCraftFinished() {
        return this.progress >= this.maxProgress;
    }

    private void increaseCraftingProgress() {
        this.progress++;
    }

    private boolean hasRecipe() {
        return this.getStack(INPUT_SLOT_1).getItem() == Items.IRON_INGOT && this.getStack(INPUT_SLOT_2).getItem() == Items.IRON_INGOT;
    }

    private boolean canInsertIntoOutputSlot() {
        return this.getStack(OUTPUT_SLOT).isEmpty() || this.getStack(OUTPUT_SLOT).getCount() < this.getStack(OUTPUT_SLOT).getMaxCount();
    }
}
