package net.the2019.industrialrevolution.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.the2019.industrialrevolution.block.ModBlocks;
import net.the2019.industrialrevolution.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NECRONIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_NECRONIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_NECRONIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_NECRONIUM_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_BRICKS);
        BlockStateModelGenerator.BlockTexturePool industrialMetalBlockTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.INDUSTRIAL_METAL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_INDUSTRIAL_METAL_BLOCK);

        industrialMetalBlockTexturePool.stairs(ModBlocks.INDUSTRIAL_METAL_BLOCK_STAIRS);
        industrialMetalBlockTexturePool.slab(ModBlocks.INDUSTRIAL_METAL_BLOCK_SLAB);




    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.RAW_NECRONIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.NECRONIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.COMPRESSED_COAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.INDUSTRIAL_METAL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SALMON_FILET, Models.GENERATED);
        itemModelGenerator.register(ModItems.INDUSTRIAL_METAL_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_KNIFE, Models.HANDHELD);

    }
}
