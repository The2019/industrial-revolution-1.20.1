package net.the2019.industrialrevolution.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.the2019.industrialrevolution.IndustrialRevolution;
import net.the2019.industrialrevolution.block.ModBlocks;

public class ModBlockEntities {

    public static final BlockEntityType<IndustrialSmelterBlockEntity> INDUSTRIAL_SMELTER_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(IndustrialRevolution.MOD_ID, "industrial_smelter_block_entity"), FabricBlockEntityTypeBuilder.create(IndustrialSmelterBlockEntity::new, ModBlocks.INDUSTRIAL_SMELTER).build(null));
    public static final BlockEntityType<IndustrialCrusherBlockEntity> INDUSTRIAL_CRUSHER_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(IndustrialRevolution.MOD_ID, "industrial_crusher_block_entity"), FabricBlockEntityTypeBuilder.create(IndustrialCrusherBlockEntity::new, ModBlocks.INDUSTRIAL_CRUSHER).build(null));

    public static void registerBlockEntities(){
        IndustrialRevolution.LOGGER.info("Registering Block entites for " + IndustrialRevolution.MOD_ID);
    }
}
