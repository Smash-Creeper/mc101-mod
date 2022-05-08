package net.mcsmp.mod.registry;

import net.mcsmp.mod.mcsmp;
import net.mcsmp.mod.registry.items.other.verisimilitude_reader_Item;
import net.mcsmp.mod.registry.items.saringe.SaringeItem;
import net.mcsmp.mod.registry.items.tools.customclasses.SmpDisc;
import net.mcsmp.mod.registry.items.weapons.BoneSword;
import net.mcsmp.mod.registry.items.weapons.KasssmBat;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import static net.mcsmp.mod.mcsmp.SMP_GROUP;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class ModItems {

    ///Normal Items///
    public static final Item BONE_SWORD = new SwordItem(BoneSword.INSTANCE,9,1f,new Item.Settings().group(mcsmp.SMP_GROUP));
    public static final Item KASSSM_BAT = new SwordItem(KasssmBat.INSTANCE,10,0.5f,new Item.Settings().group(mcsmp.SMP_GROUP));
    public static final Item POPTART = new Item(new Item.Settings().group(mcsmp.SMP_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(6.4f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED,20*5,1),0.9f).build()));
    public static final Item RAISIN_COOKIE = new Item(new Item.Settings().group(mcsmp.SMP_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(3f).statusEffect(new StatusEffectInstance(StatusEffects.POISON,20*5,1),0.05f).build()));
    public static final Item KETAMINE = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(1).saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED,20*10,100),100.0f).snack().meat().build()));
    public static final Item SENTRY_STANDOFF_DISC = new SmpDisc(21,ModSounds.SENTRY_STANDOFF_EVENT,new Item.Settings().rarity(Rarity.RARE).maxCount(1).group(mcsmp.SMP_GROUP));
    public static final Item MANIACS_REVENGE_DISC = new SmpDisc(21,ModSounds.MANIACS_REVENGE_EVENT,new Item.Settings().rarity(Rarity.RARE).maxCount(1).group(mcsmp.SMP_GROUP));
    public static final Item BOBBY_DORITO_DISC = new SmpDisc(21,ModSounds.BOBBY_DORITO_EVENT,new Item.Settings().rarity(Rarity.RARE).maxCount(2).group(mcsmp.SMP_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(2f).snack().build()));
    public static final Item ZAVODILA_DISC = new SmpDisc(2,ModSounds.ZAVODILA_EVENT,new Item.Settings().rarity(Rarity.RARE).maxCount(1));
    public static final Item BEETHOVEN_VIRUS_DISC = new SmpDisc(21,ModSounds.BEETHOVEN_VIRUS_EVENT,new Item.Settings().rarity(Rarity.RARE).maxCount(1));
    public static final Item CRAB_RAVE_DISC = new SmpDisc(21,ModSounds.CRAB_RAVE_EVENT,new Item.Settings().rarity(Rarity.RARE).maxCount(1).group(mcsmp.SMP_GROUP));
    public static final Item FORSAKEN_DISC = new SmpDisc(21,ModSounds.FORSAKEN_EVENT,new Item.Settings().rarity(Rarity.RARE).maxCount(1).group(mcsmp.SMP_GROUP));
    public static final Item SMART_RACE_DISC = new SmpDisc(21,ModSounds.SMART_RACE_EVENT,new Item.Settings().rarity(Rarity.RARE).maxCount(1).group(mcsmp.SMP_GROUP));
    public static final Item THE_SHACK_DISC = new SmpDisc(21,ModSounds.THE_SHACK_EVENT,new Item.Settings().rarity(Rarity.RARE).maxCount(1).group(mcsmp.SMP_GROUP));
    public static final Item EMPTY_SARINGE = new Item(new Item.Settings().group(mcsmp.SMP_GROUP));
    public static final Item KETAMINE_SARINGE = new SaringeItem(new Item.Settings().food(new FoodComponent.Builder().statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20*10, 100),100.0f).build())); //new Item(new Item.Settings().group(mcsmp.SMP_GROUP));
    public static final Item PLAYER_ESSANCE = new Item(new Item.Settings().maxCount(69).rarity(Rarity.UNCOMMON));
    public static final Item SEASON5_PLAYER_ESSANCE = new Item(new Item.Settings().maxCount(69).rarity(Rarity.RARE));
    public static final Item SEASON4_PLAYER_ESSANCE = new Item(new Item.Settings().maxCount(69).rarity(Rarity.EPIC));
    public static final Item MANIFESTED_VERISIMILITUDE_SHARD = new Item(new Item.Settings().group(mcsmp.SMP_GROUP).maxCount(69).rarity(Rarity.EPIC));
//    public static final Item MANIFESTED_VERISIMILITUDE_RENFORCED_NETHERITE_INGOT = new Item(new Item.Settings().group(mcsmp.SMP_GROUP).maxCount(69).rarity(Rarity.EPIC));
    

    ///Special Items///
    public static final Item EAST = new Item(new Item.Settings().maxCount(0));
    public static final Item VERISIMILITUDE_READER = new verisimilitude_reader_Item(new Item.Settings().group(mcsmp.SMP_GROUP).maxCount(1).rarity(Rarity.EPIC));

    ///Tools and Swords///

    ///Armors///
    public static final Item VERISIMILITUDE_HELMET = new ArmorItem(ModArmorMaterial.VERISIMILITUDE, EquipmentSlot.HEAD, new FabricItemSettings().group(mcsmp.SMP_GROUP));
    public static final Item VERISIMILITUDE_CHESTPLATE = new ArmorItem(ModArmorMaterial.VERISIMILITUDE, EquipmentSlot.CHEST, new FabricItemSettings().group(mcsmp.SMP_GROUP));
    public static final Item VERISIMILITUDE_LEGGINGS = new ArmorItem(ModArmorMaterial.VERISIMILITUDE, EquipmentSlot.LEGS, new FabricItemSettings().group(mcsmp.SMP_GROUP));
    public static final Item VERISIMILITUDE_BOOTS = new ArmorItem(ModArmorMaterial.VERISIMILITUDE, EquipmentSlot.FEET, new FabricItemSettings().group(mcsmp.SMP_GROUP));
    public static final Item NETHERITE_VERISIMILITUDE_HELMET = new ArmorItem(ModArmorMaterial.NETHERITE_VERISIMILITUDE, EquipmentSlot.HEAD, new FabricItemSettings().group(mcsmp.SMP_GROUP));
    public static final Item NETHERITE_VERISIMILITUDE_CHESTPLATE = new ArmorItem(ModArmorMaterial.NETHERITE_VERISIMILITUDE, EquipmentSlot.CHEST, new FabricItemSettings().group(mcsmp.SMP_GROUP));
    public static final Item NETHERITE_VERISIMILITUDE_LEGGINGS = new ArmorItem(ModArmorMaterial.NETHERITE_VERISIMILITUDE, EquipmentSlot.LEGS, new FabricItemSettings().group(mcsmp.SMP_GROUP));
    public static final Item NETHERITE_VERISIMILITUDE_BOOTS = new ArmorItem(ModArmorMaterial.NETHERITE_VERISIMILITUDE, EquipmentSlot.FEET, new FabricItemSettings().group(mcsmp.SMP_GROUP));

    ///Block Items///
    public static final BlockItem EMPTYNESS_BLOCK = new BlockItem(ModBlocks.EMPTYNESS_BLOCK, new Item.Settings().group(SMP_GROUP));
    public static final BlockItem LIGHTNESS_BLOCK = new BlockItem(ModBlocks.LIGHTNESS_BLOCK, new Item.Settings().group(SMP_GROUP));
    public static final BlockItem DIMENSIONAL_HARNESS = new BlockItem(ModBlocks.DIMENSIONAL_HARNESS, new Item.Settings().group(SMP_GROUP));
    public static final BlockItem VERISIMILITUDE_SENTINEL_BLOCK = new BlockItem(ModBlocks.VERISIMILITUDE_SENTINEL_BLOCK, new Item.Settings().group(SMP_GROUP));
    public static final BlockItem VERISIMILITUDE_SENTINEL_GLASS = new BlockItem(ModBlocks.VERISIMILITUDE_SENTINEL_GLASS, new Item.Settings().group(SMP_GROUP));
    public static final BlockItem MANIFESTED_VERISIMILITUDE = new BlockItem(ModBlocks.MANIFESTED_VERISIMILITUDE, new Item.Settings().group(SMP_GROUP));
    public static final BlockItem NETHERITE_RENFORCED_GLASS = new BlockItem(ModBlocks.NETHERITE_RENFORCED_GLASS, new Item.Settings().group(SMP_GROUP));
    public static final BlockItem DIMENSIONAL_PROPERTY_FUSER = new BlockItem(ModBlocks.DIMENSIONAL_PROPERTY_FUSER, new Item.Settings().group(SMP_GROUP));

    //    public static final Item TEST_DISC = new MusicDiscItem()
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID, "bone_sword"), BONE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID, "poptart"), POPTART);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID, "raisin_cookie"), RAISIN_COOKIE);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID, "ketamine"), KETAMINE);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID, "sentry_standoff_disc"), SENTRY_STANDOFF_DISC);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID, "maniacs_revenge_disc"), MANIACS_REVENGE_DISC);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID, "smart_race_disc"), SMART_RACE_DISC);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID, "the_shack_disc"), THE_SHACK_DISC);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID, "forsaken_disc"), FORSAKEN_DISC);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID, "crab_rave_disc"), CRAB_RAVE_DISC);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID, "beethoven_virus_disc"), BEETHOVEN_VIRUS_DISC);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID, "zavodila_disc"), ZAVODILA_DISC);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID, "bobby_dorito_disc"), BOBBY_DORITO_DISC);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID, "empty_saringe"), EMPTY_SARINGE);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID, "ketamine_saringe"), KETAMINE_SARINGE);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID, "emptyness_block"), EMPTYNESS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID, "lightness_block"), LIGHTNESS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID, "dimensional_harness"), DIMENSIONAL_HARNESS);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID, "player_essance"), PLAYER_ESSANCE);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID, "season5_player_essance"), SEASON5_PLAYER_ESSANCE);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID, "season4_player_essance"), SEASON4_PLAYER_ESSANCE);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID, "east"), EAST);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID, "kasssm_bat"), KASSSM_BAT);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID,"verisimilitude_sentinel_block"), VERISIMILITUDE_SENTINEL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID,"verisimilitude_sentinel_glass"), VERISIMILITUDE_SENTINEL_GLASS);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID,"netherite_renforced_glass"), NETHERITE_RENFORCED_GLASS);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID,"manifested_verisimilitude"), MANIFESTED_VERISIMILITUDE);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID,"manifested_verisimilitude_shard"), MANIFESTED_VERISIMILITUDE_SHARD);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID,"verisimilitude_reader"), VERISIMILITUDE_READER);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID,"verisimilitude_helmet"), VERISIMILITUDE_HELMET);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID,"verisimilitude_chestplate"), VERISIMILITUDE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID,"verisimilitude_leggings"), VERISIMILITUDE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID,"verisimilitude_boots"), VERISIMILITUDE_BOOTS);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID,"netherite_verisimilitude_helmet"), NETHERITE_VERISIMILITUDE_HELMET);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID,"netherite_verisimilitude_chestplate"), NETHERITE_VERISIMILITUDE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID,"netherite_verisimilitude_leggings"), NETHERITE_VERISIMILITUDE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID,"netherite_verisimilitude_boots"), NETHERITE_VERISIMILITUDE_BOOTS);
        Registry.register(Registry.ITEM, new Identifier(mcsmp.MOD_ID,"dimensional_property_fuser"), DIMENSIONAL_PROPERTY_FUSER);
    }
}
