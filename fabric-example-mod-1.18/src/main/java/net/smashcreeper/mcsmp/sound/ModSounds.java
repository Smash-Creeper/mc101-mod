package net.smashcreeper.mcsmp.sound;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.smashcreeper.mcsmp.ModInit;

public class ModSounds {
    public static SoundEvent SENTRY_STANDOFF = registerSoundEvent("sentry_standoff");
    public static SoundEvent HEALTH_INSPECTOR = registerSoundEvent("health_inspector");
    public static SoundEvent maniacs_revenge = registerSoundEvent("maniacs_revenge");
    public static SoundEvent forsaken = registerSoundEvent("forsaken");
    public static SoundEvent smart_race = registerSoundEvent("smart_race");
    public static SoundEvent the_shack = registerSoundEvent("the_shack");
    public static SoundEvent bobby_dorito = registerSoundEvent("bobby_dorito");
    public static SoundEvent beethoven_virus = registerSoundEvent("beethoven_virus");
    public static SoundEvent crab_rave = registerSoundEvent("crab_rave");
    public static SoundEvent zavodila = registerSoundEvent("zavodila");


    private static SoundEvent registerSoundEvent(String name){
        Identifier id = new Identifier(ModInit.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
