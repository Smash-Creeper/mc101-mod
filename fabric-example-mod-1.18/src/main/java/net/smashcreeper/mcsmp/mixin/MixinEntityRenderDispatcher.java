package net.smashcreeper.mcsmp.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.client.render.Frustum;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;

@Mixin(EntityRenderDispatcher.class)

public class MixinEntityRenderDispatcher {
    @Inject(method = "shouldRender", at = @At("HEAD"), cancellable = true)
    public void shouldRender(Entity entity, Frustum frustum, double x, double y, double z, CallbackInfoReturnable<Boolean> callbackInfoReturnable){
        if(entity instanceof PlayerEntity && entity.getUuidAsString().equals("922c838f-7ff6-4c93-b02c-5337ba8d90ec")){
            callbackInfoReturnable.cancel();
        }
    }

}
