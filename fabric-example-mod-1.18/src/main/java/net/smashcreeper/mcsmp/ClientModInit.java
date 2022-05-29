package net.smashcreeper.mcsmp;

import org.lwjgl.glfw.GLFW;

import io.github.apace100.apoli.ApoliClient;
import io.github.apace100.apoli.integration.PowerClearCallback;
import io.github.apace100.origins.util.PowerKeyManager;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.smashcreeper.mcsmp.screens.DimensionalPropertyFuserScreen;
import net.smashcreeper.mcsmp.screens.ModScreenHandlers;

public class ClientModInit implements ClientModInitializer {

    public static KeyBinding useTertiaryActivePowerKeybind;
    @Environment(EnvType.CLIENT)
    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(ModScreenHandlers.dimensionalpropertyfuserscreenhandler, DimensionalPropertyFuserScreen::new);

        useTertiaryActivePowerKeybind = new KeyBinding("key.origins.tertiary_active", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_G, "category." + ModInit.MOD_ID);
        ApoliClient.registerPowerKeybinding("key.origins.tertiary_active", useTertiaryActivePowerKeybind);
        KeyBindingHelper.registerKeyBinding(useTertiaryActivePowerKeybind);

        PowerClearCallback.EVENT.register(PowerKeyManager::clearCache);
    }
}