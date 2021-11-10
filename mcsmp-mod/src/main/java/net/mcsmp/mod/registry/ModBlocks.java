package net.mcsmp.mod.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
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
    public static final Block LIGHTNESS_BLOCK = new Block(FabricBlockSettings.of(Material.LEAVES,MapColor.PINK).breakByHand(true).breakByTool(FabricToolTags.SWORDS,5).strength(300.0f,0.0f).lightLevel(15));
    public static final Block DIMENSIONAL_HARNESS = new Block(FabricBlockSettings.of(Material.METAL,MapColor.LIGHT_BLUE_GRAY).breakByTool(FabricToolTags.PICKAXES,2).strength(10.0f,0.0f));


    public static void registerBlocks()
    {

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"emptyness_block"), EMPTYNESS_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"lightness_block"), LIGHTNESS_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"dimensional_harness"), DIMENSIONAL_HARNESS);
    }

}
