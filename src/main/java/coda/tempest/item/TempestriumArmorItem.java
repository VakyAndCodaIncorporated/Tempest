package coda.tempest.item;

import coda.tempest.Tempest;
import coda.tempest.client.model.TempestArmorModel;
import net.minecraft.client.particle.RainParticle;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

public class TempestriumArmorItem extends ArmorItem {
    public static final IArmorMaterial MATERIAL = new TempestArmorMaterial(Tempest.MOD_ID + ":tempestrium",  15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, () -> Ingredient.of(Items.IRON_INGOT));

    public TempestriumArmorItem(EquipmentSlotType slot) {
        super(MATERIAL, slot, new Item.Properties().tab(ItemGroup.TAB_COMBAT));
    }

    @Override
    public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
        /*NonNullList<ItemStack> armor = player.inventory.armor;
        for (int i = player.inventory.armor.size(); i < 4; i++) {
            player.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 1, i));
        }*/
        double d0 = random.nextGaussian() * 0.056D;
        double d1 = random.nextGaussian() * 0.034D;
        double d2 = random.nextGaussian() * 0.025D;
        for (int i = 0; i < 4; i++) {
            world.addParticle(ParticleTypes.RAIN, player.getRandomX(1.5D), player.getRandomY() + 0.75D, player.getRandomZ(1.5D), d0, d1, d2);
            world.addParticle(ParticleTypes.RAIN, player.getRandomX(1.5D), player.getRandomY() + 0.75D, player.getRandomZ(1.5D), d0, d1, d2);
        }

        world.setRainLevel(1.0F);
    }

    @SuppressWarnings("unchecked")
    @Nullable
    @Override
    @OnlyIn(Dist.CLIENT)
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
        return (A) TempestArmorModel.INSTANCE;
    }
}
