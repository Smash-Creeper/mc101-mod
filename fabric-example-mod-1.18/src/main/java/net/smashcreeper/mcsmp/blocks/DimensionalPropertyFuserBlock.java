package net.smashcreeper.mcsmp.blocks;

import java.util.stream.Stream;

import org.jetbrains.annotations.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.smashcreeper.mcsmp.blocks.entities.DimensionalPropertyFuserEntity;
import net.smashcreeper.mcsmp.blocks.entities.ModBlockEntities;

public class DimensionalPropertyFuserBlock extends BlockWithEntity implements BlockEntityProvider{

//    public static final DirectionProperty FACING = Properties

    public DimensionalPropertyFuserBlock(Settings settings) {
        super(settings);
        //TODO Auto-generated constructor stub
    }

    private static final VoxelShape SHAPE = Stream.of(
        Block.createCuboidShape(0, 0, 0, 16, 2, 16),
        Block.createCuboidShape(0, 6, 0, 16, 8, 16),
        Block.createCuboidShape(0, 2, 0, 2, 6, 2),
        Block.createCuboidShape(0, 2, 14, 2, 6, 16),
        Block.createCuboidShape(14, 2, 14, 16, 6, 16),
        Block.createCuboidShape(14, 2, 0, 16, 6, 2),
        Block.createCuboidShape(0.5, 2, 2, 1.5, 6, 14),
        Block.createCuboidShape(14.5, 2, 2, 15.5, 6, 14),
        Block.createCuboidShape(2, 2, 0.5, 14, 6, 1.5),
        Block.createCuboidShape(2, 2, 14.5, 14, 6, 15.5),
        Block.createCuboidShape(13.5, 13, 0.5, 15.5, 14, 2.5),
        Block.createCuboidShape(13.25, 11, 0.25, 15.75, 13, 2.75),
        Block.createCuboidShape(13, 8, 0, 16, 11, 3),
        Block.createCuboidShape(0, 14, 0, 16, 16, 16),
        Block.createCuboidShape(0.25, 11, 13.25, 2.75, 13, 15.75),
        Block.createCuboidShape(0, 8, 0, 3, 11, 3),
        Block.createCuboidShape(0.5, 13, 13.5, 2.5, 14, 15.5),
        Block.createCuboidShape(13, 8, 13, 16, 11, 16),
        Block.createCuboidShape(13.25, 11, 13.25, 15.75, 13, 15.75),
        Block.createCuboidShape(13.5, 13, 13.5, 15.5, 14, 15.5),
        Block.createCuboidShape(0.5, 13, 0.5, 2.5, 14, 2.5),
        Block.createCuboidShape(0.25, 11, 0.25, 2.75, 13, 2.75),
        Block.createCuboidShape(0, 8, 13, 3, 11, 16)
        ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();   

        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            return SHAPE;
        }

// Block Entity

    @Override
    public BlockRenderType getRenderType(BlockState state){
        return BlockRenderType.MODEL;
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.getBlock() != newState.getBlock()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof DimensionalPropertyFuserEntity) {
                ItemScatterer.spawn(world, pos, (DimensionalPropertyFuserEntity)blockEntity);
                world.updateComparators(pos,this);
            }
            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos,
    PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            NamedScreenHandlerFactory screenHandlerFactory = state.createScreenHandlerFactory(world, pos);

            if (screenHandlerFactory != null) {
                player.openHandledScreen(screenHandlerFactory);
            }
        }

        return ActionResult.SUCCESS;
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        // TODO Auto-generated method stub
        return new DimensionalPropertyFuserEntity(pos, state);
    }
    
    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return checkType(type, ModBlockEntities.dimensional_property_fuser, DimensionalPropertyFuserEntity::tick);
    }
}
