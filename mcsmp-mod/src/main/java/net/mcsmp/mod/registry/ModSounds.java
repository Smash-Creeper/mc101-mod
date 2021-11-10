package net.mcsmp.mod.registry;

import net.mcsmp.mod.mcsmp;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {

    public static final Identifier SENTRY_STANDOFF = new Identifier(mcsmp.MOD_ID, "sentry_standoff");
    public static SoundEvent SENTRY_STANDOFF_EVENT = Registry.register(Registry.SOUND_EVENT, SENTRY_STANDOFF, new SoundEvent(SENTRY_STANDOFF));
    public static final Identifier BOBBY_DORITO = new Identifier(mcsmp.MOD_ID, "bobby_dorito");
    public static SoundEvent BOBBY_DORITO_EVENT = Registry.register(Registry.SOUND_EVENT, BOBBY_DORITO, new SoundEvent(BOBBY_DORITO));
    public static final Identifier BEETHOVEN_VIRUS = new Identifier(mcsmp.MOD_ID, "beethoven_virus");
    public static SoundEvent BEETHOVEN_VIRUS_EVENT = Registry.register(Registry.SOUND_EVENT, BEETHOVEN_VIRUS, new SoundEvent(BEETHOVEN_VIRUS));
    public static final Identifier ZAVODILA = new Identifier(mcsmp.MOD_ID, "zavodila");
    public static SoundEvent ZAVODILA_EVENT = Registry.register(Registry.SOUND_EVENT, ZAVODILA, new SoundEvent(ZAVODILA));
    public static final Identifier CRAB_RAVE = new Identifier(mcsmp.MOD_ID, "crab_rave");
    public static SoundEvent CRAB_RAVE_EVENT = Registry.register(Registry.SOUND_EVENT, CRAB_RAVE, new SoundEvent(CRAB_RAVE));
    public static final Identifier MANIACS_REVENGE = new Identifier(mcsmp.MOD_ID, "maniacs_revenge");
    public static SoundEvent MANIACS_REVENGE_EVENT = Registry.register(Registry.SOUND_EVENT, MANIACS_REVENGE, new SoundEvent(MANIACS_REVENGE));
    public static final Identifier FORSAKEN = new Identifier(mcsmp.MOD_ID, "forsaken");
    public static SoundEvent FORSAKEN_EVENT = Registry.register(Registry.SOUND_EVENT, FORSAKEN, new SoundEvent(FORSAKEN));
    public static final Identifier SMART_RACE = new Identifier(mcsmp.MOD_ID, "smart_race");
    public static SoundEvent SMART_RACE_EVENT = Registry.register(Registry.SOUND_EVENT, SMART_RACE, new SoundEvent(SMART_RACE));
    public static final Identifier THE_SHACK = new Identifier(mcsmp.MOD_ID, "the_shack");
    public static SoundEvent THE_SHACK_EVENT = Registry.register(Registry.SOUND_EVENT, THE_SHACK, new SoundEvent(THE_SHACK));

    public static void registerSounds() {
//        Registry.register(Registry.SOUND_EVENT, ModSounds.SENTRY_STANDOFF, SENTRY_STANDOFF_EVENT);
    }
}