package coda.tempest.init;

import coda.tempest.Tempest;
import coda.tempest.item.TempestriumArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TempestItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Tempest.MOD_ID);

    public static final RegistryObject<Item> TEMPESTRIUM_HELMET = ITEMS.register("tempestrium_helmet", () -> new TempestriumArmorItem(EquipmentSlotType.HEAD));
}
