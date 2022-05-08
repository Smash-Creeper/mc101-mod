package net.mcsmp.mod.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.mcsmp.mod.registry.blocks.dimensional_property_fuser;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.mcsmp.mod.mcsmp.MOD_ID;

public class ModBlocks {

  //  public static Block DYED_CHEST_BLOCK;
 //   public static BlockItem DYED_CHEST_BLOCK_ITEM;
//    public static BlockEntityType<DyedChestEntity> DYED_CHEST_BLOCK_ENTITY;

    public static final Identifier DYED_CHEST = new Identifier(MOD_ID, "dyed_chest");

    //public static ScreenHandlerType<DyedChestScreenHandler> DYED_CHEST_SCREEN_HANDLER = null;


    public static final Block EMPTYNESS_BLOCK = new Block(FabricBlockSettings.of(Material.LEAVES,MapColor.PINK).breakByHand(true).breakByTool(FabricToolTags.SWORDS,5).strength(300.0f,0.0f));
    public static final Block LIGHTNESS_BLOCK = new Block(FabricBlockSettings.of(Material.LEAVES,MapColor.PINK).breakByHand(true).breakByTool(FabricToolTags.SWORDS,5).strength(300.0f,0.0f)/*.lightLevel(15)*/);
    public static final Block DIMENSIONAL_HARNESS = new Block(FabricBlockSettings.of(Material.METAL,MapColor.LIGHT_BLUE_GRAY).breakByTool(FabricToolTags.PICKAXES,2).strength(10.0f,0.0f));
//    public static final Block PURE_VERISIMILITUDE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL,MapColor.IRON_GRAY).breakByTool(FabricToolTags.PICKAXES,4).strength(40.0f,21.0f));
    public static final Block VERISIMILITUDE_SENTINEL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL,MapColor.IRON_GRAY).breakByTool(FabricToolTags.PICKAXES,3).requiresTool().strength(120.0f,21.0f));
    public static final Block VERISIMILITUDE_SENTINEL_GLASS = new Block(FabricBlockSettings.of(Material.GLASS,MapColor.IRON_GRAY).breakByTool(FabricToolTags.PICKAXES,3).requiresTool().strength(15.0f,10.0f));
    public static final Block NETHERITE_RENFORCED_GLASS = new Block(FabricBlockSettings.of(Material.GLASS,MapColor.DARK_DULL_PINK).breakByTool(FabricToolTags.PICKAXES,3).requiresTool().strength(15.0f,10.0f));
    public static final Block MANIFESTED_VERISIMILITUDE = new Block(FabricBlockSettings.of(Material.METAL,MapColor.WHITE).breakByTool(FabricToolTags.PICKAXES,3).requiresTool().strength(50.0f,1.0f));
    public static final Block DIMENSIONAL_PROPERTY_FUSER = new dimensional_property_fuser(FabricBlockSettings.of(Material.METAL,MapColor.WHITE).breakByTool(FabricToolTags.PICKAXES,3).requiresTool().strength(10.0f,1.0f));


    public static void registerBlocks()
    {

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"emptyness_block"), EMPTYNESS_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"lightness_block"), LIGHTNESS_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"dimensional_harness"), DIMENSIONAL_HARNESS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"verisimilitude_sentinel_block"), VERISIMILITUDE_SENTINEL_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"verisimilitude_sentinel_glass"), VERISIMILITUDE_SENTINEL_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"netherite_renforced_glass"), NETHERITE_RENFORCED_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"manifested_verisimilitude"), MANIFESTED_VERISIMILITUDE);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"dimensional_property_fuser"), DIMENSIONAL_PROPERTY_FUSER);
    }

}
