package net.mcsmp.mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.mcsmp.mod.registry.ModBlockEntities;
//import net.mcsmp.mod.registry.ClientModParticles;
import net.mcsmp.mod.registry.ModBlocks;
import net.mcsmp.mod.registry.ModItems;
//import net.mcsmp.mod.registry.ModParticles;
import net.mcsmp.mod.registry.ModSounds;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class mcsmp implements ModInitializer{
    public static final String MOD_ID = "mcsmp";

    public static final ItemGroup SMP_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID,"mcsmp"), () -> new ItemStack(Items.PORKCHOP));
    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModSounds.registerSounds();
        ModBlocks.registerBlocks();
//        ModBlockEntities.registerBlockEntities();
     //   ModParticles.registerParticles();
     //   ClientModParticles.ClientregisterParticles();
    }
        
}
