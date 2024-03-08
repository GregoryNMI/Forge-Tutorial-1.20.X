package net.greg.dsgreatswords.datagen;

import net.greg.dsgreatswords.DarkSoulsGreatSwords;
import net.greg.dsgreatswords.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DarkSoulsGreatSwords.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GL_SWORD.get()))
                    .title(Component.translatable("creativetab.ds_greatswords"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.OBSIDIAN_SWORD.get());
                        pOutput.accept(ModItems.GL_SWORD.get());
                        pOutput.accept(ModItems.ARTORIAS_SWORD.get());
                        pOutput.accept(ModItems.CURSED_SWORD.get());
                        pOutput.accept(ModItems.ABYSS_SWORD.get());
                        pOutput.accept(ModItems.STONE_SWORD.get());
                        pOutput.accept(ModItems.CRYSTAL_SWORD.get());
                        pOutput.accept(ModItems.CLAYMORE.get());
                        pOutput.accept(ModItems.FLAMBERGE.get());
                        pOutput.accept(ModItems.SERPENT_SWORD.get());
                        pOutput.accept(ModItems.BASTARD_SWORD.get());
                        pOutput.accept(ModItems.MOONLIGHT.get());
                        pOutput.accept(ModItems.BLACK_KNIGHT_SWORD.get());



                    })
                    .build());




        public static void register(IEventBus eventBus) { CREATIVE_MODE_TABS.register(eventBus);}
}