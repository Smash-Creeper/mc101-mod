package net.smashcreeper.mcsmp.screens;


import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.smashcreeper.mcsmp.ModInit;

public class ModScreenHandlers {
    public static ScreenHandlerType<DimensionalPropertyFuserScreenHandler> dimensionalpropertyfuserscreenhandler;

    public static void registerAllScreenHandlers(){
        dimensionalpropertyfuserscreenhandler = ScreenHandlerRegistry.registerSimple(new Identifier(ModInit.MOD_ID,"dimensional_property_fuser"), DimensionalPropertyFuserScreenHandler::new);
    }

}
