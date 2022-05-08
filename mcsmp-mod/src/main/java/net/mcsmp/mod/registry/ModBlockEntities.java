package net.mcsmp.mod.registry;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.mcsmp.mod.mcsmp.MOD_ID;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.mcsmp.mod.registry.blocks.entity.dimensional_property_fuser_entity;

public class ModBlockEntities {
    public static BlockEntityType<dimensional_property_fuser_entity> DIMENSIONAL_PROPERTY_FUSER_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "mcsmp:dimensional_property_fuser", 
    FabricBlockEntityTypeBuilder.create(dimensional_property_fuser_entity::new, ModBlocks.DIMENSIONAL_PROPERTY_FUSER).build(null));
}
