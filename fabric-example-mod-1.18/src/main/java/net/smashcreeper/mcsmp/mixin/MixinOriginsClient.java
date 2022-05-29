package net.smashcreeper.mcsmp.mixin;

import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import io.github.apace100.origins.Origins;
import io.github.apace100.origins.OriginsClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.render.Frustum;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;

@Mixin(OriginsClient.class)

public class MixinOriginsClient {
    @Inject(method = "onInitializeClient", at = @At("TAIL"), cancellable = true)
    public void onInitializeClient(){
    //    useTertiaryActivePowerKeybind = new KeyBinding("key.origins.tertiary_active", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_G, "category." + Origins.MODID);
    }

}
