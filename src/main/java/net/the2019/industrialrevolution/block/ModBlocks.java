package net.the2019.industrialrevolution.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.the2019.industrialrevolution.IndustrialRevolution;
import net.the2019.industrialrevolution.block.custom.IndustrialSmelterBlock;

public class ModBlocks {

    //Ores
    public static final Block NECRONIUM_ORE = registerBlock("necronium_ore", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block NETHER_NECRONIUM_ORE = registerBlock("nether_necronium_ore", new Block(FabricBlockSettings.copyOf(Blocks.NETHERRACK)));
    public static final Block END_STONE_NECRONIUM_ORE = registerBlock("end_stone_necronium_ore", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block DEEPSLATE_NECRONIUM_ORE = registerBlock("deepslate_necronium_ore", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE)));

    //Full Blocks
    public static final Block MOSSY_BRICKS = registerBlock("mossy_bricks", new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block INDUSTRIAL_METAL_BLOCK = registerBlock("industrial_metal_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block MOSSY_INDUSTRIAL_METAL_BLOCK = registerBlock("mossy_industrial_metal_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    //Not Full BLocks
    public static final Block INDUSTRIAL_METAL_BLOCK_STAIRS = registerBlock("industrial_metal_block_stairs", new StairsBlock(ModBlocks.INDUSTRIAL_METAL_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block INDUSTRIAL_METAL_BLOCK_SLAB = registerBlock("industrial_metal_block_slab", new SlabBlock( FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    //Machines
    public static final Block INDUSTRIAL_SMELTER = registerBlock("industrial_smelter", new IndustrialSmelterBlock( FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));



    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(IndustrialRevolution.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(IndustrialRevolution.MOD_ID, name), block);
    }

    public static void registerModBlocks(){
        IndustrialRevolution.LOGGER.info("Registering Mod Blocks for " + IndustrialRevolution.MOD_ID);
    }

}
