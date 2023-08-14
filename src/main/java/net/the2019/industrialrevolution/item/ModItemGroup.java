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

                entries.add(ModBlocks.NECRONIUM_ORE);


            }).build());


    public static void registerItemGroup(){

    }
}
