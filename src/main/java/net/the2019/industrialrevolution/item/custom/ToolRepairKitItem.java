package net.the2019.industrialrevolution.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ToolRepairKitItem extends Item {
    public ToolRepairKitItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient) {
            if (user.getOffHandStack().getItem() instanceof ToolItem) {
                ItemStack tool = user.getOffHandStack();
                tool.setDamage(tool.getDamage() - 200);

                user.setStackInHand(hand, ItemStack.EMPTY);
            }
        }
        return super.use(world, user, hand);
    }
}