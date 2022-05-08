package net.mcsmp.mod.registry.blocks.entity;

import net.mcsmp.mod.registry.ModBlockEntities;
import net.mcsmp.mod.registry.ModItems;
import net.mcsmp.mod.registry.gui.inventory.ImplementedInventory;
import net.mcsmp.mod.registry.gui.screens.dimensional_property_fuser_screenhandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class dimensional_property_fuser_entity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory{

    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(3, ItemStack.EMPTY);

    protected final PropertyDelegate propertyDelegate;
    public int charge = 0;
    public int chargemax = 76;
    public int venergy = 0;
    public int venergymax = 1280;

        public dimensional_property_fuser_entity(BlockPos pos, BlockState state) {
            super(ModBlockEntities.DIMENSIONAL_PROPERTY_FUSER_ENTITY, pos, state);
            this.propertyDelegate = new PropertyDelegate() {
            public int get(int index) {
                switch (index) {
                    case 0: return dimensional_property_fuser_entity.this.charge;
                    case 1: return dimensional_property_fuser_entity.this.chargemax;
                    case 2: return dimensional_property_fuser_entity.this.venergy;
                    case 3: return dimensional_property_fuser_entity.this.venergymax;
                    default: return 0;
                }
            }

            public void set(int index, int value) {
                switch(index) {
                    case 0: dimensional_property_fuser_entity.this.charge = value; break;
                    case 1: dimensional_property_fuser_entity.this.chargemax = value; break;
                    case 2: dimensional_property_fuser_entity.this.venergy = value; break;
                    case 3: dimensional_property_fuser_entity.this.venergymax = value; break;
                }
            }

            public int size() {
                return 4;
            }
        };
        
    }

    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        
        return new dimensional_property_fuser_screenhandler(syncId, inv, this, this.propertyDelegate);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        
        return inventory;
    }
    
    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, inventory);

        venergy = nbt.getInt("venergy");
    }
    
    @Override
    public Text getDisplayName() {
        
        return new LiteralText("Dimensional Property Fuser");
    }

    public static void tick(World world, BlockPos pos, BlockState state, dimensional_property_fuser_entity entity) {
        if(entity.charge > entity.chargemax) {
            craftItem(entity);
            entity.charge = 0;
        }else if(hasRecipe(entity) && hasNotReachedStackLimit(entity)){
            entity.charge++;
        }
        if(hasFuel(entity)){
            entity.removeStack(0, 1);
            entity.venergy += 1;
        }
    }

    @Override
    public NbtCompound writeNbt(NbtCompound nbt) {
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("venergy", venergy);
        return super.writeNbt(nbt);
    }

    private static void craftItem(dimensional_property_fuser_entity entity) {
        entity.removeStack(0, 1);
        //entity.removeStack(1, 1);

        //entity.setStack(2, new ItemStack(ModItems.MANIFESTED_VERISIMILITUDE_SHARD, entity.getStack(2).getCount() + 1));
    }

    private static boolean hasRecipe(dimensional_property_fuser_entity entity) {
        boolean hasItemInFirstSlot = entity.getStack(1).getItem() == Items.BEETROOT;
//        boolean hasItemInSecondSlot = entity.getStack(1).getItem() == Items.NETHERITE_INGOT;

        return hasItemInFirstSlot; //&& hasItemInSecondSlot;
    }
    private static boolean hasFuel(dimensional_property_fuser_entity entity) {
        boolean hasItemInFirstSlot = entity.getStack(0).getItem() == ModItems.MANIFESTED_VERISIMILITUDE_SHARD;
//        boolean hasItemInSecondSlot = entity.getStack(1).getItem() == Items.NETHERITE_INGOT;
        boolean lessthanmax = false;
        if((entity.venergy < entity.venergymax)){
            lessthanmax = true;
        }else{
            lessthanmax = false;
        }
        return hasItemInFirstSlot && lessthanmax; //&& hasItemInSecondSlot;
    }

    private static boolean hasNotReachedStackLimit(dimensional_property_fuser_entity entity) {
        return entity.getStack(2).getCount() < entity.getStack(2).getMaxCount();
    }

}
