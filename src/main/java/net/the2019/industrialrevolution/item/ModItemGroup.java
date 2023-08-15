package net.the2019.industrialrevolution.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.the2019.industrialrevolution.IndustrialRevolution;
import net.the2019.industrialrevolution.block.ModBlocks;

public class ModItemGroup {

    public static ItemGroup INDUSTRIALREVOLUTION = Registry.register(Registries.ITEM_GROUP, new Identifier(IndustrialRevolution.MOD_ID, "industrialrevolution"),FabricItemGroup.builder()
            .displayName(Text.literal("Industrial Revolution")).icon(() -> new ItemStack(ModItems.RAW_NECRONIUM)).entries((displayContext, entries) -> {

                entries.add(ModItems.RAW_NECRONIUM);
                entries.add(ModItems.NECRONIUM_INGOT);
                entries.add(ModItems.COMPRESSED_COAL);
                entries.add(ModItems.INDUSTRIAL_METAL_INGOT);
                entries.add(ModItems.SALMON_FILET);
                entries.add(ModItems.INDUSTRIAL_METAL_KNIFE);
                entries.add(ModItems.DIAMOND_KNIFE);
                entries.add(ModItems.IRON_KNIFE);
                entries.add(ModItems.STONE_KNIFE);

                entries.add(ModBlocks.NECRONIUM_ORE);
                entries.add(ModBlocks.NETHER_NECRONIUM_ORE);
                entries.add(ModBlocks.END_STONE_NECRONIUM_ORE);
                entries.add(ModBlocks.DEEPSLATE_NECRONIUM_ORE);
                entries.add(ModBlocks.MOSSY_BRICKS);
                entries.add(ModBlocks.INDUSTRIAL_METAL_BLOCK);
                entries.add(ModBlocks.MOSSY_INDUSTRIAL_METAL_BLOCK);
                entries.add(ModBlocks.INDUSTRIAL_METAL_BLOCK_STAIRS);
                entries.add(ModBlocks.INDUSTRIAL_METAL_BLOCK_SLAB);


            }).build());


    public static void registerItemGroup(){
        IndustrialRevolution.LOGGER.info("Registering  Mod Item Group for " + IndustrialRevolution.MOD_ID);
    }
}
