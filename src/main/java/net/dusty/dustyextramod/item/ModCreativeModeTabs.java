package net.dusty.dustyextramod.item;

import net.dusty.dustyextramod.DustyMod;
import net.dusty.dustyextramod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DustyMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("dusty_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PURE_DIAMOND.get()))
                    .title(Component.translatable("creativetab.dusty_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.PURE_DIAMOND.get());
                        pOutput.accept(ModItems.PURITY_DUST.get());

                        pOutput.accept(ModBlocks.PURE_DIAMOND_BLOCK.get());
                        pOutput.accept(ModBlocks.PURITY_ORE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
