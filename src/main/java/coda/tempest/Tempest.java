package coda.tempest;

import coda.tempest.init.TempestItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Tempest.MOD_ID)
public class Tempest {
    public static final String MOD_ID = "tempest";

    public Tempest() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::registerClient);

        TempestItems.ITEMS.register(bus);
    }

    private void registerClient(FMLClientSetupEvent event) {
    }
}
