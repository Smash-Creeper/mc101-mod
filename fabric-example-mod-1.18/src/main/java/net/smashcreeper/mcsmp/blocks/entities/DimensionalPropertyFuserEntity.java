package net.smashcreeper.mcsmp.blocks.entities;

import java.util.Optional;

import org.jetbrains.annotations.Nullable;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.smashcreeper.mcsmp.blocks.ModBlocks;
import net.smashcreeper.mcsmp.items.ModItems;
import net.smashcreeper.mcsmp.recipe.DimensionalPropertyFuserRecipe;
import net.smashcreeper.mcsmp.screens.DimensionalPropertyFuserScreenHandler;
import net.smashcreeper.mcsmp.util.ImplementedInventory;

public class DimensionalPropertyFuserEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory{
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(4,ItemStack.EMPTY);

    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 69;
    private int charge = 0;
    private int maxCharge = 0;

    public DimensionalPropertyFuserEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.dimensional_property_fuser, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            public int get(int index) {
                switch (index) {
                    case 0: return DimensionalPropertyFuserEntity.this.progress;
                    case 1: return DimensionalPropertyFuserEntity.this.maxProgress;
                    case 2: return DimensionalPropertyFuserEntity.this.charge;
                    case 3: return DimensionalPropertyFuserEntity.this.maxCharge;
                    default: return 0;
                }
            }

            public void set(int index, int value) {
                switch(index) {
                    case 0: DimensionalPropertyFuserEntity.this.progress = value; break;
                    case 1: DimensionalPropertyFuserEntity.this.maxProgress = value; break;
                    case 2: DimensionalPropertyFuserEntity.this.charge = value; break;
                    case 3: DimensionalPropertyFuserEntity.this.maxCharge = value; break;
                }
            }

            public int size() {
                return 4;
            }
        };
        //TODO Auto-generated constructor stub
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        // TODO Auto-generated method stub
        return inventory;
    }

    @Override
    public Text getDisplayName() {
        // TODO Auto-generated method stub
        return new LiteralText("Dimensional Property Fuser ") ;
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new DimensionalPropertyFuserScreenHandler(syncId, inv, this, this.propertyDelegate);
    }
    
    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("progress", progress);
        nbt.putInt("charge", charge);
        nbt.putInt("maxCharge", maxCharge);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inventory);
        super.readNbt(nbt);
        progress = nbt.getInt("progress");
        charge = nbt.getInt("charge");
        maxCharge = nbt.getInt("maxCharge");
    }

    private void consumeFuel() {
        if(!getStack(0).isEmpty()) {
            this.charge = FuelRegistry.INSTANCE.get(this.removeStack(0, 1).getItem());
            this.maxCharge = this.charge;
        }
    }

    public static void tick(World world, BlockPos pos, BlockState state, DimensionalPropertyFuserEntity entity) {
        if(entity.getStack(0).isOf(ModItems.MANIFESTED_VERISIMILITUDE_SHARD)) {
            entity.charge++;
            entity.removeStack(0,1);
        }

        if(hasRecipe(entity)) {
            if(hasFuelInFuelSlot(entity) && !isConsumingFuel(entity)) {
                entity.consumeFuel();
            }
            if(isConsumingFuel(entity)) {
                entity.progress++;
            //    entity.charge--;
                if(entity.progress > entity.maxProgress) {
                    craftItem(entity);
                }
            }
        } else {
            entity.resetProgress();
        }
    }

    private static boolean hasFuelInFuelSlot(DimensionalPropertyFuserEntity entity) {
        return !entity.getStack(0).isEmpty();
    }

    private static boolean isConsumingFuel(DimensionalPropertyFuserEntity entity) {
        return entity.charge > 0;
    }

    private static boolean hasRecipe(DimensionalPropertyFuserEntity entity) {
        World world = entity.world;
        SimpleInventory inventory = new SimpleInventory(entity.inventory.size());
        for (int i = 0; i < entity.inventory.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<DimensionalPropertyFuserRecipe> match = world.getRecipeManager()
                .getFirstMatch(DimensionalPropertyFuserRecipe.Type.INSTANCE, inventory, world);

        return match.isPresent() && canInsertAmountIntoOutputSlot(inventory)
                && canInsertItemIntoOutputSlot(inventory, match.get().getOutput());
    }

    private static void craftItem(DimensionalPropertyFuserEntity entity) {
        World world = entity.world;
        SimpleInventory inventory = new SimpleInventory(entity.inventory.size());
        for (int i = 0; i < entity.inventory.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<DimensionalPropertyFuserRecipe> match = world.getRecipeManager()
                .getFirstMatch(DimensionalPropertyFuserRecipe.Type.INSTANCE, inventory, world);

        if(match.isPresent()) {
            entity.removeStack(1,1);
        //    entity.removeStack(2,1);

            entity.setStack(2, new ItemStack(match.get().getOutput().getItem(),
                    entity.getStack(2).getCount() + 1));
            
            int curcost = 0;
            ///Im trying to figure out how to impliment this into the json but cant figure it out RN ToT
            if(entity.getStack(2).isOf(Items.DIAMOND)) {
                curcost = 10;
            }

            entity.charge-=curcost;

            entity.resetProgress();
        }
    }

    private void resetProgress() {
        this.progress = 0;
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleInventory inventory, ItemStack output) {
        return inventory.getStack(2).getItem() == output.getItem() || inventory.getStack(2).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleInventory inventory) {
        return inventory.getStack(2).getMaxCount() > inventory.getStack(2).getCount();
    }
}