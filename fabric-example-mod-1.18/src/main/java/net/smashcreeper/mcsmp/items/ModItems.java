package net.smashcreeper.mcsmp.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.smashcreeper.mcsmp.ModInit;
import net.smashcreeper.mcsmp.sound.ModSounds;

public class ModItems {

  //public static final Item SENTRY_STANDOFF_DISC = registerItem("sentry_standoff_disc", new Item(new FabricItemSettings().group(ModInit.SMP)));
    public static final Item SENTRY_STANDOFF_DISC = registerItem("sentry_standoff_disc", new ModMusicDisc(21, ModSounds.SENTRY_STANDOFF,new FabricItemSettings().group(ModInit.SMP).maxCount(1)));
    public static final Item HEALTH_INSPECTOR_DISC = registerItem("health_inspector_disc", new ModMusicDisc(21, ModSounds.HEALTH_INSPECTOR,new FabricItemSettings().group(ModInit.SMP).maxCount(1)));
    public static final Item maniacs_revenge_disc = registerItem("maniacs_revenge_disc", new ModMusicDisc(21, ModSounds.maniacs_revenge,new FabricItemSettings().group(ModInit.SMP).maxCount(1)));
    public static final Item forsaken_disc = registerItem("forsaken_disc", new ModMusicDisc(21, ModSounds.forsaken,new FabricItemSettings().group(ModInit.SMP).maxCount(1)));
    public static final Item smart_race_disc = registerItem("smart_race_disc", new ModMusicDisc(21, ModSounds.smart_race,new FabricItemSettings().group(ModInit.SMP).maxCount(1)));
    public static final Item the_shack_disc = registerItem("the_shack_disc", new ModMusicDisc(21, ModSounds.the_shack,new FabricItemSettings().group(ModInit.SMP).maxCount(1)));
    public static final Item bobby_dorito_disc = registerItem("bobby_dorito_disc", new ModMusicDisc(21, ModSounds.bobby_dorito,new FabricItemSettings().group(ModInit.SMP).maxCount(1).food(ModFoodComponents.DORITO)));
    public static final Item beethoven_virus_disc = registerItem("beethoven_virus_disc", new ModMusicDisc(21, ModSounds.beethoven_virus,new FabricItemSettings().maxCount(1)));
    public static final Item crab_rave_disc = registerItem("crab_rave_disc", new ModMusicDisc(21, ModSounds.crab_rave,new FabricItemSettings().maxCount(1)));
    public static final Item zavodila_disc = registerItem("zavodila_disc", new ModMusicDisc(21, ModSounds.zavodila,new FabricItemSettings().maxCount(1)));
    public static final Item MANIFESTED_VERISIMILITUDE_SHARD = registerItem("manifested_verisimilitude_shard", new Item(new FabricItemSettings().group(ModInit.SMP).maxCount(64)));
    public static final Item steel_ingot = registerItem("steel_ingot", new Item(new FabricItemSettings().group(ModInit.SMP).maxCount(64)));
    public static final Item raw_steel = registerItem("raw_steel", new Item(new FabricItemSettings().group(ModInit.SMP).maxCount(64)));
    public static final Item bazil = registerItem("bazil", new Item(new FabricItemSettings().group(ModInit.SMP).maxCount(64).food(ModFoodComponents.BAZIL)));
    //public static final Item VERISIMILITUDE_READER = registerItem("verisimilitude_reader", new Item(new FabricItemSettings().group(ModInit.SMP).maxCount(1)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(ModInit.MOD_ID,name), item);
    }

    public static void registerItems(){

    }
}
