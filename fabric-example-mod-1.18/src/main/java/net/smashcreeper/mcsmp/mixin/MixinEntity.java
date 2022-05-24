package net.smashcreeper.mcsmp.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import net.smashcreeper.mcsmp.items.ModItems;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

///Code Barrowed from doctor4t

@Mixin(LivingEntity.class)
public abstract class MixinEntity extends Entity {
    public MixinEntity(EntityType<?> type, World world) {
        super(type, world);
    }

    @Inject(method = "dropEquipment", at = @At(value = "TAIL"))
    private void ratsmischief$dropRatMask(DamageSource source, int lootingMultiplier, boolean allowDrops, CallbackInfo ci) {
        if (source.getAttacker() instanceof PlayerEntity && getUuidAsString().equals("cce500d1-7a68-4126-af3f-b968aa3c0ee2")) {
            dropStack(new ItemStack(Items.PORKCHOP));
        }
        if (source.getAttacker() instanceof PlayerEntity && getUuidAsString().equals("43dcb8f3-daf1-45ff-8fca-c286a49116ec")) {
            dropStack(new ItemStack(ModItems.SENTRY_STANDOFF_DISC));
        }
        if (source.getAttacker() instanceof PlayerEntity && getUuidAsString().equals("1146920f-7280-4728-94d8-024a37829eea")) {
            dropStack(new ItemStack(ModItems.HEALTH_INSPECTOR_DISC));
        }
    }
}