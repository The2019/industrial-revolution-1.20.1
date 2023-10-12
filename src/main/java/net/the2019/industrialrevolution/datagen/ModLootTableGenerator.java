package net.the2019.industrialrevolution.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.the2019.industrialrevolution.block.ModBlocks;
import net.the2019.industrialrevolution.item.ModItems;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.NECRONIUM_ORE, oreDrops(ModBlocks.NECRONIUM_ORE, ModItems.RAW_NECRONIUM));
        addDrop(ModBlocks.NETHER_NECRONIUM_ORE, oreDrops(ModBlocks.NETHER_NECRONIUM_ORE, ModItems.RAW_NECRONIUM));
        addDrop(ModBlocks.END_STONE_NECRONIUM_ORE, oreDrops(ModBlocks.END_STONE_NECRONIUM_ORE, ModItems.RAW_NECRONIUM));
        addDrop(ModBlocks.DEEPSLATE_NECRONIUM_ORE, oreDrops(ModBlocks.DEEPSLATE_NECRONIUM_ORE, ModItems.RAW_NECRONIUM));

        addDrop(ModBlocks.MOSSY_BRICKS);
        addDrop(ModBlocks.INDUSTRIAL_METAL_BLOCK);
        addDrop(ModBlocks.MOSSY_INDUSTRIAL_METAL_BLOCK);

        addDrop(ModBlocks.INDUSTRIAL_METAL_BLOCK_STAIRS);
        addDrop(ModBlocks.INDUSTRIAL_METAL_BLOCK_SLAB, slabDrops(ModBlocks.INDUSTRIAL_METAL_BLOCK_SLAB));

    }
}
