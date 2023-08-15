package net.the2019.industrialrevolution.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.the2019.industrialrevolution.block.ModBlocks;
import net.the2019.industrialrevolution.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.INDUSTRIAL_METAL_BLOCK_STAIRS, 4)
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .input('S', ModBlocks.INDUSTRIAL_METAL_BLOCK)
                .criterion(hasItem(ModBlocks.INDUSTRIAL_METAL_BLOCK), conditionsFromItem(ModBlocks.INDUSTRIAL_METAL_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.INDUSTRIAL_METAL_BLOCK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.INDUSTRIAL_METAL_KNIFE, 1)
                .pattern("  M")
                .pattern(" M ")
                .pattern("S  ")
                .input('M', ModBlocks.INDUSTRIAL_METAL_BLOCK)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.INDUSTRIAL_METAL_BLOCK), conditionsFromItem(ModBlocks.INDUSTRIAL_METAL_BLOCK))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.INDUSTRIAL_METAL_KNIFE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DIAMOND_KNIFE, 1)
                .pattern("  M")
                .pattern(" M ")
                .pattern("S  ")
                .input('M', Items.DIAMOND)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DIAMOND_KNIFE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRON_KNIFE, 1)
                .pattern("  M")
                .pattern(" M ")
                .pattern("S  ")
                .input('M', Items.IRON_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_KNIFE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STONE_KNIFE, 1)
                .pattern("  M")
                .pattern(" M ")
                .pattern("S  ")
                .input('M', Items.STONE)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_KNIFE)));



        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.NECRONIUM_INGOT, RecipeCategory.MISC, ModBlocks.NECRONIUM_ORE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.INDUSTRIAL_METAL_INGOT, RecipeCategory.MISC, ModBlocks.INDUSTRIAL_METAL_BLOCK);

        offerSmelting(exporter, List.of(ModItems.RAW_NECRONIUM, ModBlocks.NECRONIUM_ORE, ModBlocks.NETHER_NECRONIUM_ORE, ModBlocks.END_STONE_NECRONIUM_ORE, ModBlocks.DEEPSLATE_NECRONIUM_ORE), RecipeCategory.MISC, ModItems.NECRONIUM_INGOT, 0.25f, 200, "necronium_ingot");
        offerBlasting(exporter, List.of(ModItems.RAW_NECRONIUM, ModBlocks.NECRONIUM_ORE, ModBlocks.NETHER_NECRONIUM_ORE, ModBlocks.END_STONE_NECRONIUM_ORE, ModBlocks.DEEPSLATE_NECRONIUM_ORE), RecipeCategory.MISC, ModItems.NECRONIUM_INGOT, 0.25f, 200, "necronium_ingot");

        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.INDUSTRIAL_METAL_BLOCK_SLAB, ModBlocks.INDUSTRIAL_METAL_BLOCK);

    }
}