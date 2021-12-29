package net.mcsmp.mod.registry;

import java.util.function.Supplier;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

public enum ModArmorMaterial implements ArmorMaterial {
	VERISIMILITUDE("verisimilitude", 33, new int[]{13, 19, 26, 12}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F, -0.1F, () -> {
		return Ingredient.ofItems(ModItems.MANIFESTED_VERISIMILITUDE_SHARD);
	}),
	NETHERITE_VERISIMILITUDE("netherite_verisimilitude", 37, new int[]{23, 29, 36, 22}, 40, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.2F, () -> {
		return Ingredient.ofItems(ModItems.VERISIMILITUDE_SENTINEL_BLOCK);
	});

	private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
	private final String name;
	private final int durabilityMultiplier;
	private final int[] protectionAmounts;
	private final int enchantability;
	private final SoundEvent equipSound;
	private final float toughness;
	private final float knockbackResistance;
	private final Lazy<Ingredient> repairIngredientSupplier;

	private ModArmorMaterial(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.protectionAmounts = protectionAmounts;
		this.enchantability = enchantability;
		this.equipSound = equipSound;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.repairIngredientSupplier = new Lazy(repairIngredientSupplier);
	}

	public int getDurability(EquipmentSlot slot) {
		return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
	}

	public int getProtectionAmount(EquipmentSlot slot) {
		return this.protectionAmounts[slot.getEntitySlotId()];
	}

	public int getEnchantability() {
		return this.enchantability;
	}

	public SoundEvent getEquipSound() {
		return this.equipSound;
	}

	public Ingredient getRepairIngredient() {
		return (Ingredient)this.repairIngredientSupplier.get();
	}

	public String getName() {
		return this.name;
	}

	public float getToughness() {
		return this.toughness;
	}

	public float getKnockbackResistance() {
		return this.knockbackResistance;
	}
}
