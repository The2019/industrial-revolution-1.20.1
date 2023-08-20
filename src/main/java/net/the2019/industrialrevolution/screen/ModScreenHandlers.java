package net.the2019.industrialrevolution.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.the2019.industrialrevolution.IndustrialRevolution;

public class ModScreenHandlers {

    public static final ScreenHandlerType<IndustrialSmelterScreenHandler> INDUSTRIAL_SMELTER_SCREEN_HANDLER = Registry.register(Registries.SCREEN_HANDLER, new Identifier(IndustrialRevolution.MOD_ID, "industrial_smelter_screen_handler"), new ExtendedScreenHandlerType<>(IndustrialSmelterScreenHandler::new));

    public static void registerScreenHandler(){
        IndustrialRevolution.LOGGER.info("Registering Mod Screens for " + IndustrialRevolution.MOD_ID);
    }
}
