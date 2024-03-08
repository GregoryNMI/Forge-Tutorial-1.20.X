package net.greg.dsgreatswords;

import com.mojang.logging.LogUtils;
import net.greg.dsgreatswords.datagen.ModCreativeModTabs;
import net.greg.dsgreatswords.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DarkSoulsGreatSwords.MOD_ID)
public class DarkSoulsGreatSwords
{

    public static final String MOD_ID = "dsgreatswords";

    private static final Logger LOGGER = LogUtils.getLogger();


    public DarkSoulsGreatSwords()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);

        ModCreativeModTabs.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event){
        if(event.getTabKey() == CreativeModeTabs.COMBAT) {

            event.accept(ModItems.OBSIDIAN_SWORD);
            event.accept(ModItems.GL_SWORD);
            event.accept(ModItems.ARTORIAS_SWORD);
            event.accept(ModItems.CURSED_SWORD);
            event.accept(ModItems.ABYSS_SWORD);
            event.accept(ModItems.STONE_SWORD);
            event.accept(ModItems.CRYSTAL_SWORD);
            event.accept(ModItems.CLAYMORE);
            event.accept(ModItems.FLAMBERGE);
            event.accept(ModItems.SERPENT_SWORD);
            event.accept(ModItems.BASTARD_SWORD);
            event.accept(ModItems.MOONLIGHT);
            event.accept(ModItems.BLACK_KNIGHT_SWORD);

        }

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
