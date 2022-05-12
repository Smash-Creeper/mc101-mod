package net.smashcreeper.mcsmp.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import net.smashcreeper.mcsmp.MC102Mod;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class SmpMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		MC102Mod.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
