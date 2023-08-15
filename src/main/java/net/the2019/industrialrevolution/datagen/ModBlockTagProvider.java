package net.the2019.industrialrevolution.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.the2019.industrialrevolution.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.NECRONIUM_ORE)
                .add(ModBlocks.NETHER_NECRONIUM_ORE)
                .add(ModBlocks.END_STONE_NECRONIUM_ORE)
                .add(ModBlocks.DEEPSLATE_NECRONIUM_ORE)
                .add(ModBlocks.MOSSY_BRICKS)
                .add(ModBlocks.INDUSTRIAL_METAL_BLOCK)
                .add(ModBlocks.MOSSY_INDUSTRIAL_METAL_BLOCK);


        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.NECRONIUM_ORE)
                .add(ModBlocks.END_STONE_NECRONIUM_ORE)
                .add(ModBlocks.DEEPSLATE_NECRONIUM_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.NETHER_NECRONIUM_ORE)
                .add(ModBlocks.INDUSTRIAL_METAL_BLOCK)
                .add(ModBlocks.MOSSY_INDUSTRIAL_METAL_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.MOSSY_BRICKS);

    }
}
