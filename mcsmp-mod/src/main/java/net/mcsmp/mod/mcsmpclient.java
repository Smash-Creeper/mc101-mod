package net.mcsmp.mod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.mcsmp.mod.registry.ModBlocks;
import net.mcsmp.mod.registry.ModScreenHandlers;
import net.mcsmp.mod.registry.gui.screens.dimensional_property_fuser_screen;
import net.minecraft.client.render.RenderLayer;


public class mcsmpclient implements ClientModInitializer{

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.NETHERITE_RENFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VERISIMILITUDE_SENTINEL_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DIMENSIONAL_HARNESS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VERISIMILITUDE_SENTINEL_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MANIFESTED_VERISIMILITUDE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DIMENSIONAL_PROPERTY_FUSER, RenderLayer.getTranslucent());
        ScreenRegistry.register(ModScreenHandlers.DIMENSIONAL_PROPERTY_FUSER_SCREEN_HANDLER, dimensional_property_fuser_screen::new);
    }
    
}
