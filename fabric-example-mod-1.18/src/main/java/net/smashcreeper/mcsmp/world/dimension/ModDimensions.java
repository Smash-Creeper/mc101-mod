package net.smashcreeper.mcsmp.world.dimension;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import net.smashcreeper.mcsmp.ModInit;

public class ModDimensions {
    public static final RegistryKey<World> THE_BETWEEN_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY, new Identifier(ModInit.MOD_ID,"the_between"));
    public static final RegistryKey<DimensionType> THE_BETWEEN_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY,THE_BETWEEN_DIMENSION_KEY.getValue());

    public static void register(){
    
    }
}
