package net.mcsmp.mod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.mcsmp.mod.registry.ModBlocks;
import net.minecraft.client.render.RenderLayer;


public class mcsmpclient implements ClientModInitializer{

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.NETHERITE_RENFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VERISIMILITUDE_SENTINEL_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DIMENSIONAL_HARNESS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VERISIMILITUDE_SENTINEL_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MANIFESTED_VERISIMILITUDE, RenderLayer.getTranslucent());
        
    }
    
}
