package net.smashcreeper.mcsmp.blocks.entities;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.smashcreeper.mcsmp.ModInit;
import net.smashcreeper.mcsmp.blocks.ModBlocks;

public class ModBlockEntities {
    public static BlockEntityType<DimensionalPropertyFuserEntity> dimensional_property_fuser;

    public static void registerAllBlockEntities(){
        dimensional_property_fuser = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(ModInit.MOD_ID,"dimensional_property_fuser"), FabricBlockEntityTypeBuilder.create(DimensionalPropertyFuserEntity::new, ModBlocks.dimensional_property_fuser).build(null));
    }
}
