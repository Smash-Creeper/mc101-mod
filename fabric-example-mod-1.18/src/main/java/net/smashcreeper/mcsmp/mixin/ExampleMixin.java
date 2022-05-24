package net.smashcreeper.mcsmp.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import net.smashcreeper.mcsmp.ModInit;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		ModInit.LOGGER.info("Hola Amigo i am a Mixin and we be Mixin deez nuts in your mouth jajaja");
	}
}
