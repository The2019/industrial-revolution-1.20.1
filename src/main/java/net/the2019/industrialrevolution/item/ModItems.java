package net.the2019.industrialrevolution.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.the2019.industrialrevolution.IndustrialRevolution;

public class ModItems {

    public static final Item RAW_NECRONIUM = registerItem("raw_necronium", new Item(new FabricItemSettings()));
    public static final Item NECRONIUM_INGOT = registerItem("necronium_ingot", new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(IndustrialRevolution.MOD_ID, name), item);
    }

    public static void registerModItems(){
        IndustrialRevolution.LOGGER.info("Registering  Mod Items for " + IndustrialRevolution.MOD_ID);
    }
}
