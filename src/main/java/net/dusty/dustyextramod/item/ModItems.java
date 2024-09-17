package net.dusty.dustyextramod.item;

import net.dusty.dustyextramod.DustyMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DustyMod.MOD_ID);

    public static final RegistryObject<Item> PURE_DIAMOND = ITEMS.register("pure_diamond",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PURITY_DUST = ITEMS.register("purity_dust",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
