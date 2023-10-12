package net.the2019.industrialrevolution;

import net.fabricmc.api.ModInitializer;
import net.the2019.industrialrevolution.block.ModBlocks;
import net.the2019.industrialrevolution.block.entity.ModBlockEntities;
import net.the2019.industrialrevolution.item.ModItemGroup;
import net.the2019.industrialrevolution.item.ModItems;
import net.the2019.industrialrevolution.recipe.ModRecipes;
import net.the2019.industrialrevolution.screen.ModScreenHandlers;
import net.the2019.industrialrevolution.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IndustrialRevolution implements ModInitializer {
	public static final String MOD_ID = "industrialrevolution";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroup.registerItemGroup();
		ModItems.registerModItems();

		ModBlocks.registerModBlocks();
		ModBlockEntities.registerBlockEntities();

		ModRegistries.registerModStuff();
		ModScreenHandlers.registerScreenHandler();

		ModRecipes.registerRecipes();
	}
}
