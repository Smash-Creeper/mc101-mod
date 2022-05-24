package net.smashcreeper.mcsmp.recipe;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.smashcreeper.mcsmp.ModInit;

public class ModRecipes {
    public static void registerRecipes(){
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(ModInit.MOD_ID,DimensionalPropertyFuserRecipe.Serializer.ID), DimensionalPropertyFuserRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(ModInit.MOD_ID,DimensionalPropertyFuserRecipe.Type.ID), DimensionalPropertyFuserRecipe.Type.INSTANCE);
    }
}
