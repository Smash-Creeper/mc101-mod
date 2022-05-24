package net.smashcreeper.mcsmp.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.smashcreeper.mcsmp.ModInit;

public class ModBlocks {

    public static final Block MANIFESTED_VERISIMILITUDE_BLOCK = registerBlock("manifested_verisimilitude", new Block(FabricBlockSettings.of(Material.METAL, MapColor.WHITE_GRAY).strength(6.0f).requiresTool()), ModInit.SMP);
    public static final Block netherite_renforced_glass = registerBlock("netherite_renforced_glass", new Block(FabricBlockSettings.of(Material.GLASS, MapColor.PALE_PURPLE).strength(10.0f).requiresTool()), ModInit.SMP);
    public static final Block verisimilitude_sentinel_block = registerBlock("verisimilitude_sentinel_block", new Block(FabricBlockSettings.of(Material.METAL, MapColor.PALE_PURPLE).strength(10.0f).requiresTool()), ModInit.SMP);
    public static final Block verisimilitude_sentinel_glass = registerBlock("verisimilitude_sentinel_glass", new Block(FabricBlockSettings.of(Material.GLASS, MapColor.LIGHT_BLUE_GRAY).strength(10.0f).requiresTool()), ModInit.SMP);
    public static final Block dimensional_property_fuser = registerBlock("dimensional_property_fuser", new DimensionalPropertyFuserBlock(FabricBlockSettings.of(Material.METAL, MapColor.PALE_PURPLE).strength(10.0f).requiresTool()), ModInit.SMP);
    public static final Block steel_block = registerBlock("steel_block", new Block(FabricBlockSettings.of(Material.METAL, MapColor.GRAY).strength(5.0f).requiresTool()), ModInit.SMP);
    public static final Block black_sprayed_steel_block = registerBlock("black_sprayed_steel_block", new Block(FabricBlockSettings.of(Material.METAL, MapColor.BLACK).strength(5.0f).requiresTool()), ModInit.SMP);
    public static final Block blue_sprayed_steel_block = registerBlock("blue_sprayed_steel_block", new Block(FabricBlockSettings.of(Material.METAL, MapColor.BLUE).strength(5.0f).requiresTool()), ModInit.SMP);
    public static final Block brown_sprayed_steel_block = registerBlock("brown_sprayed_steel_block", new Block(FabricBlockSettings.of(Material.METAL, MapColor.BROWN).strength(5.0f).requiresTool()), ModInit.SMP);
    public static final Block cyan_sprayed_steel_block = registerBlock("cyan_sprayed_steel_block", new Block(FabricBlockSettings.of(Material.METAL, MapColor.CYAN).strength(5.0f).requiresTool()), ModInit.SMP);
    public static final Block gray_sprayed_steel_block = registerBlock("gray_sprayed_steel_block", new Block(FabricBlockSettings.of(Material.METAL, MapColor.GRAY).strength(5.0f).requiresTool()), ModInit.SMP);
    public static final Block green_sprayed_steel_block = registerBlock("green_sprayed_steel_block", new Block(FabricBlockSettings.of(Material.METAL, MapColor.GREEN).strength(5.0f).requiresTool()), ModInit.SMP);
    public static final Block light_blue_sprayed_steel_block = registerBlock("light_blue_sprayed_steel_block", new Block(FabricBlockSettings.of(Material.METAL, MapColor.LIGHT_BLUE).strength(5.0f).requiresTool()), ModInit.SMP);
    public static final Block light_gray_sprayed_steel_block = registerBlock("light_gray_sprayed_steel_block", new Block(FabricBlockSettings.of(Material.METAL, MapColor.LIGHT_GRAY).strength(5.0f).requiresTool()), ModInit.SMP);
    public static final Block lime_sprayed_steel_block = registerBlock("lime_sprayed_steel_block", new Block(FabricBlockSettings.of(Material.METAL, MapColor.LIME).strength(5.0f).requiresTool()), ModInit.SMP);
    public static final Block magenta_sprayed_steel_block = registerBlock("magenta_sprayed_steel_block", new Block(FabricBlockSettings.of(Material.METAL, MapColor.MAGENTA).strength(5.0f).requiresTool()), ModInit.SMP);
    public static final Block orange_sprayed_steel_block = registerBlock("orange_sprayed_steel_block", new Block(FabricBlockSettings.of(Material.METAL, MapColor.ORANGE).strength(5.0f).requiresTool()), ModInit.SMP);
    public static final Block pink_sprayed_steel_block = registerBlock("pink_sprayed_steel_block", new Block(FabricBlockSettings.of(Material.METAL, MapColor.PINK).strength(5.0f).requiresTool()), ModInit.SMP);
    public static final Block red_sprayed_steel_block = registerBlock("red_sprayed_steel_block", new Block(FabricBlockSettings.of(Material.METAL, MapColor.RED).strength(5.0f).requiresTool()), ModInit.SMP);
    public static final Block white_sprayed_steel_block = registerBlock("white_sprayed_steel_block", new Block(FabricBlockSettings.of(Material.METAL, MapColor.WHITE).strength(5.0f).requiresTool()), ModInit.SMP);
    public static final Block yellow_sprayed_steel_block = registerBlock("yellow_sprayed_steel_block", new Block(FabricBlockSettings.of(Material.METAL, MapColor.YELLOW).strength(5.0f).requiresTool()), ModInit.SMP);
    public static final Block purple_sprayed_steel_block = registerBlock("purple_sprayed_steel_block", new Block(FabricBlockSettings.of(Material.METAL, MapColor.PURPLE).strength(5.0f).requiresTool()), ModInit.SMP);
    
    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(ModInit.MOD_ID,name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(ModInit.MOD_ID,name), new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerBlocks(){

    }

}
