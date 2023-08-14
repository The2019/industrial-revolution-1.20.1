package net.the2019.industrialrevolution.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.the2019.industrialrevolution.IndustrialRevolution;

public class ModBlocks {

    public static final Block NECRONIUM_ORE = registerBlock("necronium_ore", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));


    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(IndustrialRevolution.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(IndustrialRevolution.MOD_ID, name), block);
    }

    public static void registerModBlocks(){
        IndustrialRevolution.LOGGER.info("Registering  Mod Items for " + IndustrialRevolution.MOD_ID);
    }

}
