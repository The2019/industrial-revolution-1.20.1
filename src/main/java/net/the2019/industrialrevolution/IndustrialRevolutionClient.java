package net.the2019.industrialrevolution;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.the2019.industrialrevolution.screen.IndustrialCrusherScreen;
import net.the2019.industrialrevolution.screen.IndustrialSmelterScreen;
import net.the2019.industrialrevolution.screen.ModScreenHandlers;

public class IndustrialRevolutionClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.INDUSTRIAL_SMELTER_SCREEN_HANDLER, IndustrialSmelterScreen::new);
        HandledScreens.register(ModScreenHandlers.INDUSTRIAL_CRUSHER_SCREEN_HANDLER, IndustrialCrusherScreen::new);
    }
}
