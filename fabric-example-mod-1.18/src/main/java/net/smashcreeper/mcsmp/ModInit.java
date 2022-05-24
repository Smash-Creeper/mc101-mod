package net.smashcreeper.mcsmp;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.smashcreeper.mcsmp.blocks.ModBlocks;
import net.smashcreeper.mcsmp.blocks.entities.ModBlockEntities;
import net.smashcreeper.mcsmp.items.ModItems;
import net.smashcreeper.mcsmp.recipe.ModRecipes;
import net.smashcreeper.mcsmp.screens.ModScreenHandlers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModInit implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "mcsmp";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final ItemGroup SMP = FabricItemGroupBuilder.build(new Identifier(MOD_ID,"smp"),() -> new ItemStack(Items.PORKCHOP));

	@Override
	public void onInitialize() {
		LOGGER.info("Hola mi amigo.");
		ModItems.registerItems();
		ModBlocks.registerBlocks();
		ModBlockEntities.registerAllBlockEntities();
		ModRecipes.registerRecipes();
		ModScreenHandlers.registerAllScreenHandlers();
	}
}
