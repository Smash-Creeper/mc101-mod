package net.smashcreeper.mcsmp;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.smashcreeper.mcsmp.screens.DimensionalPropertyFuserScreen;
import net.smashcreeper.mcsmp.screens.ModScreenHandlers;

public class ClientModInit implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(ModScreenHandlers.dimensionalpropertyfuserscreenhandler, DimensionalPropertyFuserScreen::new);
    }
}