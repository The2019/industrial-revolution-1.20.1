package net.the2019.industrialrevolution.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.the2019.industrialrevolution.item.ModItems;

public class ModRegistries {
    public static void registerModStuff(){
        registerFuels();
    }

    private static void registerFuels(){
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.COMPRESSED_COAL, 2400);
    }
}
