package com.smashcreeper.mc102.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.smashcreeper.mc102.ModInit;

import net.minecraft.entity.passive.PigEntity;

@Mixin(PigEntity.class) 
public class PigEntityMixin {
    @Inject(at = @At("TAIL"), method = "init()V")
	private void init(CallbackInfo info) {
		ModInit.LOGGER.info("Pigger gaming");
	}
}
