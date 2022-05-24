package net.smashcreeper.mcsmp.screens.slot;

import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.Slot;
import net.smashcreeper.mcsmp.items.ModItems;

public class ModVerisimilitudeSlot extends Slot {
    public ModVerisimilitudeSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        if(stack.isOf(ModItems.MANIFESTED_VERISIMILITUDE_SHARD)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int getMaxItemCount(ItemStack stack) {
        return ModVerisimilitudeSlot.isBucket(stack) ? 1 : super.getMaxItemCount(stack);
    }

    public static boolean isBucket(ItemStack stack) {
        return stack.isOf(Items.BUCKET);
    }
}
