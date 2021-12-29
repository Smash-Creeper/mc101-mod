package net.mcsmp.mod.registry.items.other;

import java.util.Objects;

//import net.fabricmc.loader.impl.discovery.DomainObject.Mod;
import net.mcsmp.mod.registry.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

public class verisimilitude_reader_Item extends Item{

    public verisimilitude_reader_Item(Settings settings) {
        super(settings);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public ActionResult useOnBlock(ItemUsageContext context){

        if(context.getWorld().isClient()){
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = Objects.requireNonNull(context.getPlayer());
            boolean foundBlock = false;

            for(int i = 0; i <= positionClicked.getY(); i += 0){
                Block blockOn = context.getWorld().getBlockState(positionClicked).getBlock();

                if(hasVEnergy(blockOn)){
                    outputBlockVEnergy(blockOn, positionClicked, player);
                    foundBlock = true;
                    break;
                }else if(!hasVEnergy(blockOn)){
                    foundBlock = false;
                    break;
                }

            }

            if(!foundBlock){
                Block blockOn = context.getWorld().getBlockState(positionClicked).getBlock();
                player.sendMessage(new LiteralText("The " + blockOn.asItem().getName().getString() + " at the coordinates (" +
                positionClicked.getX() +", " + positionClicked.getY() +", " + positionClicked.getZ() + ") Has a Verisimilitude Energy Level of §1" + outputBlockVEnergyValues(blockOn)), false);
            }

        }

        context.getStack().damage(1, context.getPlayer(), (player) -> player.sendToolBreakStatus(player.getActiveHand()));
        
        return super.useOnBlock(context);
    }

    private boolean hasVEnergy(Block block){
        if(block == ModBlocks.MANIFESTED_VERISIMILITUDE || block == ModBlocks.VERISIMILITUDE_SENTINEL_BLOCK || 
        block == ModBlocks.VERISIMILITUDE_SENTINEL_GLASS || block == ModBlocks.DIMENSIONAL_HARNESS || block == ModBlocks.NETHERITE_RENFORCED_GLASS || 
        block == Blocks.NETHERITE_BLOCK){
          return true;
        }else{
            return false;
        }
        
    }

    private void outputBlockVEnergy(Block block, BlockPos pos, PlayerEntity player){
        if(hasVEnergy(block)){
            player.sendMessage(new LiteralText("The " + block.asItem().getName().getString() + " at the coordinates (" +
            pos.getX() +", " + pos.getY() +", " + pos.getZ() + ") Has a Verisimilitude Energy Level of §b" + outputBlockVEnergyValues(block)), false);
        }else{
            player.sendMessage(new LiteralText("The " + block.asItem().getName().getString() + " at the coordinates (" +
            pos.getX() +", " + pos.getY() +", " + pos.getZ() + ") Has a Verisimilitude Energy Level of §k" + outputBlockVEnergyValues(block)), false);
        }
    }

    private int outputBlockVEnergyValues(Block block){
        ///STFU im not yandere dev i just barely program in this language ;-;
        int energy = 0;
        if(hasVEnergy(block) == true){
            if(block == ModBlocks.MANIFESTED_VERISIMILITUDE){
                energy = 80;
            }else if(block == ModBlocks.VERISIMILITUDE_SENTINEL_BLOCK){
                energy = 102;
            }else if(block == ModBlocks.VERISIMILITUDE_SENTINEL_GLASS){
                energy = 69;
            }else if(block == ModBlocks.DIMENSIONAL_HARNESS){
                energy = 101;
            }else if(block == Blocks.NETHERITE_BLOCK){
                energy = 22;
            }else if(block == ModBlocks.NETHERITE_RENFORCED_GLASS){
                energy = 3;
            }else{
                energy = 1;
            }
        }else{
            energy = 0;
        }
        return energy;
    }

}
