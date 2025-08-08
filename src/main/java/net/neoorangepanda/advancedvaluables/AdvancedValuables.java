package net.neoorangepanda.advancedvaluables;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import net.neoorangepanda.advancedvaluables.AV_BlockEntity.AV_FusionGemStation.FusionGemStationBlockEntityRenderer;
import net.neoorangepanda.advancedvaluables.AV_CMT.AdvancedValuables_CreativeModeTabs;
import net.neoorangepanda.advancedvaluables.AV_Registries.*;
import net.neoorangepanda.advancedvaluables.AV_Screens.AV_FusionGemStation.FusionGemStationScreen;
import net.neoorangepanda.advancedvaluables.AV_Screens.AV_GemGrinder.GemGrinderScreen;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(AdvancedValuables.MOD_ID)
public class AdvancedValuables
{
    public static final String MOD_ID = "advancedvaluables";
    private static final Logger LOGGER = LogUtils.getLogger();

    public AdvancedValuables(IEventBus modEventBus, ModContainer modContainer)
    {
        NeoForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);
        modContainer.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);

        // -- Registries -- //
        AdvancedValuables_CreativeModeTabs.register(modEventBus);
        AdvancedValuables_ItemClass.register(modEventBus);
        AdvancedValuables_BlockClass.register(modEventBus);
        AdvancedValuables_GlobalLootModifier.register(modEventBus);
        AdvancedValuables_Enchantments.register(modEventBus);
        AdvancedValuables_Entities.register(modEventBus);
        AdvancedValuables_Recipes.register(modEventBus);
        AdvancedValuables_MenuTypes.register(modEventBus);

        modContainer.registerConfig(ModConfig.Type.COMMON, AdvancedValuables_Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS)
        {
            event.accept(AdvancedValuables_ItemClass.HAMMER_WIREFRAME);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            ItemBlockRenderTypes.setRenderLayer(AdvancedValuables_BlockClass.RED_SAPPHIRE_DOOR.get(), RenderType.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_DOOR.get(), RenderType.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_DOOR.get(), RenderType.CUTOUT);

            ItemBlockRenderTypes.setRenderLayer(AdvancedValuables_BlockClass.RED_GARNET_DOOR.get(), RenderType.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(AdvancedValuables_BlockClass.BLUE_GARNET_DOOR.get(), RenderType.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(AdvancedValuables_BlockClass.PINK_GARNET_DOOR.get(), RenderType.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(AdvancedValuables_BlockClass.YELLOW_GARNET_DOOR.get(), RenderType.CUTOUT);

            ItemBlockRenderTypes.setRenderLayer(AdvancedValuables_BlockClass.FUSION_DOOR.get(), RenderType.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(AdvancedValuables_BlockClass.RUBY_DOOR.get(), RenderType.CUTOUT);

            ItemBlockRenderTypes.setRenderLayer(AdvancedValuables_BlockClass.RED_SAPPHIRE_TRAPDOOR.get(), RenderType.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_TRAPDOOR.get(), RenderType.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_TRAPDOOR.get(), RenderType.CUTOUT);

            ItemBlockRenderTypes.setRenderLayer(AdvancedValuables_BlockClass.RED_GARNET_TRAPDOOR.get(), RenderType.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(AdvancedValuables_BlockClass.BLUE_GARNET_TRAPDOOR.get(), RenderType.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(AdvancedValuables_BlockClass.PINK_GARNET_TRAPDOOR.get(), RenderType.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(AdvancedValuables_BlockClass.YELLOW_GARNET_TRAPDOOR.get(), RenderType.CUTOUT);

            ItemBlockRenderTypes.setRenderLayer(AdvancedValuables_BlockClass.FUSION_TRAPDOOR.get(), RenderType.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(AdvancedValuables_BlockClass.RUBY_TRAPDOOR.get(), RenderType.CUTOUT);
        }

        @SubscribeEvent
        public static void registerScreens(RegisterMenuScreensEvent event)
        {
            event.register(AdvancedValuables_MenuTypes.GEM_GRINDER_MENU.get(), GemGrinderScreen::new);
            event.register(AdvancedValuables_MenuTypes.FUSION_GEM_STATION_MENU.get(), FusionGemStationScreen::new);
        }

        @SubscribeEvent
        public static void registerBlockEntityRenderer(EntityRenderersEvent.RegisterRenderers event)
        {
            event.registerBlockEntityRenderer(AdvancedValuables_Entities.FUSION_GEM_STATION_BE.get(), FusionGemStationBlockEntityRenderer::new);
        }
    }
}
