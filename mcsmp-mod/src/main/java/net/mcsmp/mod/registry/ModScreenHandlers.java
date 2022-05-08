package net.mcsmp.mod.registry;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.mcsmp.mod.mcsmp;
import net.mcsmp.mod.registry.gui.screens.dimensional_property_fuser_screenhandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static ScreenHandlerType<dimensional_property_fuser_screenhandler> DIMENSIONAL_PROPERTY_FUSER_SCREEN_HANDLER =
            ScreenHandlerRegistry.registerSimple(new Identifier(mcsmp.MOD_ID, "dimensional_property_fuser"),
            dimensional_property_fuser_screenhandler::new);
}
