package net.mcsmp.mod.registry.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class verisimilitude_sentinel_glass extends Block{

    public verisimilitude_sentinel_glass() {
        super(Settings.of(Material.GLASS).nonOpaque());
    }
    
}
