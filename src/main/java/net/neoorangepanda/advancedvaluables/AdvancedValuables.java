package net.neoorangepanda.advancedvaluables;

import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.InputEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import net.neoforged.neoforge.client.network.ClientPacketDistributor;
import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.neoforge.event.level.block.BreakBlockEvent;
import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;
import net.neoorangepanda.advancedvaluables.AV_BlockEntity.AV_FusionGemStation.FusionGemStationBlockEntityRenderer;
import net.neoorangepanda.advancedvaluables.AV_CMT.AdvancedValuables_CreativeModeTabs;
import net.neoorangepanda.advancedvaluables.AV_ClientExtension.OnBreakParticleSpawn;
import net.neoorangepanda.advancedvaluables.AV_Items.Hammer.HammerItem;
import net.neoorangepanda.advancedvaluables.AV_Items.SparkiteStaff.SparkiteStaff;
import net.neoorangepanda.advancedvaluables.AV_Libraries.Particles.*;
import net.neoorangepanda.advancedvaluables.AV_Networking.Handlers.ExplosionTriggerHandler;
import net.neoorangepanda.advancedvaluables.AV_Networking.Payloads.ExplosionTriggerPayload;
import net.neoorangepanda.advancedvaluables.AV_Networking.Payloads.SetThunderCountPayload;
import net.neoorangepanda.advancedvaluables.AV_Registries.*;
import net.neoorangepanda.advancedvaluables.AV_Screens.AV_FusionGemStation.FusionGemStationScreen;
import net.neoorangepanda.advancedvaluables.AV_Screens.AV_GemGrinder.GemGrinderScreen;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("unused")
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
        AdvancedValuables_Particles.register(modEventBus);
        AdvancedValuables_MobEffects.register(modEventBus);
        AdvancedValuables_DataComponent.register(modEventBus);

        modContainer.registerConfig(ModConfig.Type.COMMON, AdvancedValuables_Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

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

    @EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
    public static class ClientSideEvents
    {
        @SubscribeEvent
        public static void onClickInput(InputEvent.InteractionKeyMappingTriggered event)
        {
            Minecraft instance = Minecraft.getInstance();

            if (!event.isAttack()) return;
            if (instance.player == null) return;
            if (!instance.player.isShiftKeyDown()) return;

            ItemStack held = instance.player.getItemInHand(InteractionHand.MAIN_HAND);
            if (held.is(AdvancedValuables_ItemClass.SPARKITE_STAFF.get()))
            {
                event.setCanceled(true);
                event.setSwingHand(true);
                ClientPacketDistributor.sendToServer(new ExplosionTriggerPayload());
            }
        }
    }

    @EventBusSubscriber(modid = MOD_ID)
    public static class Events
    {
        private static final double SPARKITE_BLOCK_SPAWN_CHANCE = 0.02;

        @SubscribeEvent
        public static void registerClientExtensions(RegisterClientExtensionsEvent event)
        {
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RED_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RED_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RED_RAW_SAPPHIRE_BLOCK);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RED_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RED_SAPPHIRE_DOOR);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RED_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RED_SAPPHIRE_TRAPDOOR);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RED_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RED_SAPPHIRE_BUTTON);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RED_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RED_SAPPHIRE_FENCE);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RED_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RED_SAPPHIRE_FENCE_GATE);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RED_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RED_SAPPHIRE_SLAB);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RED_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RED_SAPPHIRE_WALL);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RED_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RED_SAPPHIRE_STAIRS);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RED_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RED_SAPPHIRE_PRESSURE_PLATE);

            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.BLUE_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.BLUE_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.BLUE_RAW_SAPPHIRE_BLOCK);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.BLUE_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.BLUE_SAPPHIRE_DOOR);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.BLUE_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.BLUE_SAPPHIRE_TRAPDOOR);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.BLUE_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BUTTON);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.BLUE_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.BLUE_SAPPHIRE_FENCE_GATE);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.BLUE_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.BLUE_SAPPHIRE_SLAB);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.BLUE_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.BLUE_SAPPHIRE_WALL);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.BLUE_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.BLUE_SAPPHIRE_STAIRS);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.BLUE_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.BLUE_SAPPHIRE_PRESSURE_PLATE);

            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.GREEN_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.GREEN_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.GREEN_RAW_SAPPHIRE_BLOCK);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.GREEN_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.GREEN_SAPPHIRE_DOOR);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.GREEN_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.GREEN_SAPPHIRE_TRAPDOOR);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.GREEN_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BUTTON);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.GREEN_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.GREEN_SAPPHIRE_FENCE);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.GREEN_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.GREEN_SAPPHIRE_FENCE_GATE);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.GREEN_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.GREEN_SAPPHIRE_SLAB);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.GREEN_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.GREEN_SAPPHIRE_WALL);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.GREEN_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.GREEN_SAPPHIRE_STAIRS);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.GREEN_SAPPHIRE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.GREEN_SAPPHIRE_PRESSURE_PLATE);

            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RED_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RED_GARNET_BLOCK);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RED_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RED_RAW_GARNET_BLOCK);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RED_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RED_GARNET_DOOR);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RED_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RED_GARNET_TRAPDOOR);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RED_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RED_GARNET_BUTTON);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RED_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RED_GARNET_FENCE);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RED_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RED_GARNET_FENCE_GATE);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RED_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RED_GARNET_SLAB);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RED_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RED_GARNET_WALL);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RED_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RED_GARNET_STAIRS);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RED_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RED_GARNET_PRESSURE_PLATE);

            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.BLUE_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.BLUE_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.BLUE_RAW_GARNET_BLOCK);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.BLUE_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.BLUE_GARNET_DOOR);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.BLUE_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.BLUE_GARNET_TRAPDOOR);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.BLUE_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.BLUE_GARNET_FENCE);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.BLUE_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.BLUE_GARNET_FENCE_GATE);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.BLUE_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.BLUE_GARNET_BUTTON);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.BLUE_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.BLUE_GARNET_SLAB);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.BLUE_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.BLUE_GARNET_WALL);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.BLUE_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.BLUE_GARNET_STAIRS);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.BLUE_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.BLUE_GARNET_PRESSURE_PLATE);

            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.PINK_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.PINK_GARNET_BLOCK);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.PINK_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.PINK_RAW_GARNET_BLOCK);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.PINK_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.PINK_GARNET_DOOR);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.PINK_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.PINK_GARNET_TRAPDOOR);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.PINK_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.PINK_GARNET_FENCE);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.PINK_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.PINK_GARNET_FENCE_GATE);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.PINK_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.PINK_GARNET_BUTTON);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.PINK_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.PINK_GARNET_SLAB);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.PINK_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.PINK_GARNET_WALL);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.PINK_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.PINK_GARNET_STAIRS);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.PINK_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.PINK_GARNET_PRESSURE_PLATE);

            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.YELLOW_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.YELLOW_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.YELLOW_RAW_GARNET_BLOCK);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.YELLOW_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.YELLOW_GARNET_DOOR);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.YELLOW_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.YELLOW_GARNET_TRAPDOOR);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.YELLOW_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.YELLOW_GARNET_FENCE);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.YELLOW_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.YELLOW_GARNET_FENCE_GATE);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.YELLOW_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.YELLOW_GARNET_BUTTON);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.YELLOW_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.YELLOW_GARNET_SLAB);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.YELLOW_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.YELLOW_GARNET_WALL);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.YELLOW_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.YELLOW_GARNET_STAIRS);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.YELLOW_GARNET_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.YELLOW_GARNET_PRESSURE_PLATE);

            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.FUSION_GEM_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.FUSION_BLOCK);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.FUSION_GEM_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RAW_FUSION_BLOCK);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.FUSION_GEM_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.FUSION_DOOR);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.FUSION_GEM_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.FUSION_TRAPDOOR);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.FUSION_GEM_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.FUSION_FENCE);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.FUSION_GEM_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.FUSION_FENCE_GATE);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.FUSION_GEM_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.FUSION_BUTTON);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.FUSION_GEM_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.FUSION_SLAB);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.FUSION_GEM_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.FUSION_WALL);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.FUSION_GEM_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.FUSION_STAIRS);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.FUSION_GEM_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.FUSION_PRESSURE_PLATE);

            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RUBY_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RUBY_BLOCK);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RUBY_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RAW_RUBY_BLOCK);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RUBY_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RUBY_DOOR);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RUBY_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RUBY_TRAPDOOR);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RUBY_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RUBY_FENCE);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RUBY_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RUBY_FENCE_GATE);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RUBY_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RUBY_BUTTON);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RUBY_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RUBY_SLAB);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RUBY_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RUBY_WALL);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RUBY_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RUBY_STAIRS);
            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.RUBY_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.RUBY_PRESSURE_PLATE);

            event.registerBlock(new OnBreakParticleSpawn(AdvancedValuables_Particles.SPARKITE_BLOCK_BREAK_PARTICLES), AdvancedValuables_BlockClass.SPARKITE_BLOCK);
        }

        @SubscribeEvent
        public static void networking_register(RegisterPayloadHandlersEvent event)
        {
            PayloadRegistrar registrar = event.registrar("1");

            registrar.playToServer(SetThunderCountPayload.TYPE, SetThunderCountPayload.STREAM_CODEC, (payload, context) ->
                    context.enqueueWork(() -> {
                        Player player = context.player();
                        ItemStack stack = player.getMainHandItem();
                        if (!(stack.getItem() instanceof SparkiteStaff)) stack = player.getOffhandItem();
                        if (stack.getItem() instanceof SparkiteStaff)
                        {
                            int clamped = Mth.clamp(payload.count(), 1, 64);
                            stack.set(AdvancedValuables_DataComponent.THUNDER_COUNT.get(), clamped);
                        }
                    })
            );

            registrar.playToServer(ExplosionTriggerPayload.TYPE, ExplosionTriggerPayload.STREAM_CODEC, ExplosionTriggerHandler::handleOnServer);
        }

        @SubscribeEvent
        public static void onLightingStrike(EntityJoinLevelEvent event)
        {
            if (!(event.getEntity() instanceof LightningBolt lightningBolt)) return;
            Level level = event.getLevel();
            if (level.isClientSide()) return;
            if (level.getRandom().nextDouble() > SPARKITE_BLOCK_SPAWN_CHANCE) return;
            if (lightningBolt.getPersistentData().getBooleanOr(SparkiteStaff.FROM_STAFF_KEY, false)) return;
            BlockPos pos = lightningBolt.blockPosition();
            level.setBlockAndUpdate(pos, AdvancedValuables_BlockClass.SPARKITE_BLOCK.get().defaultBlockState());
            level.playSound(null, pos, SoundEvents.ANVIL_PLACE, SoundSource.MASTER, 1f, 1f);

            String posText = String.format("(%d, %d, %d)", pos.getX(), pos.getY(), pos.getZ());

            if (level instanceof ServerLevel serverLevel)
                for (ServerPlayer p : serverLevel.players())
                    p.sendSystemMessage(Component.literal("Sparkite Block just spawned at: " + posText));
        }

        @SubscribeEvent
        public static void onEntityTick(EntityTickEvent.Post event)
        {
            if (!(event.getEntity() instanceof ItemEntity itemEntity)) return;
            if (itemEntity.level().isClientSide()) return;

            if (itemEntity.isOnFire() && itemEntity.getItem().is(AdvancedValuables_ItemClass.FUSION_HAMMER.get()))
            {
                ItemStack itemStack = itemEntity.getItem();
                int count = itemStack.getCount();
                itemEntity.setItem(new ItemStack(AdvancedValuables_ItemClass.FUSION_GEM.get(), count));
            }
        }

        // -- Help taken from Kaupenjoe. See https://youtu.be/-EuJTKoLzlM?si=wl433_BoUGwaIJzc -- //
        private static final Set<BlockPos> HARVESTED_BLOCKS = new HashSet<>();

        @SubscribeEvent
        public static void onHammerUsage(BreakBlockEvent event)
        {
            Player player = event.getPlayer();
            ItemStack mainHandItem = player.getMainHandItem();
            if (mainHandItem.getItem() instanceof HammerItem hammer && player instanceof ServerPlayer serverPlayer)
            {
                BlockPos initialBlockPos = event.getPos();
                if (HARVESTED_BLOCKS.contains(initialBlockPos)) return;
                for (BlockPos pos : HammerItem.getBlocksToBeDestroyed(1, initialBlockPos, serverPlayer))
                {
                    if (pos == initialBlockPos || !hammer.isCorrectToolForDrops(mainHandItem, event.getLevel().getBlockState(pos))) continue;
                    HARVESTED_BLOCKS.add(pos);
                    serverPlayer.gameMode.destroyBlock(pos);
                    HARVESTED_BLOCKS.remove(pos);
                }
            }
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

        @SubscribeEvent
        public static void registerParticleFactories(RegisterParticleProvidersEvent event)
        {
            event.registerSpriteSet(AdvancedValuables_Particles.RED_SAPPHIRE_PARTICLES.get(), AdvancedValuablesParticlesTemplate.Provider::new);
            event.registerSpriteSet(AdvancedValuables_Particles.BLUE_SAPPHIRE_PARTICLES.get(), AdvancedValuablesParticlesTemplate.Provider::new);
            event.registerSpriteSet(AdvancedValuables_Particles.GREEN_SAPPHIRE_PARTICLES.get(), AdvancedValuablesParticlesTemplate.Provider::new);

            event.registerSpriteSet(AdvancedValuables_Particles.RED_GARNET_PARTICLES.get(), AdvancedValuablesParticlesTemplate.Provider::new);
            event.registerSpriteSet(AdvancedValuables_Particles.BLUE_GARNET_PARTICLES.get(), AdvancedValuablesParticlesTemplate.Provider::new);
            event.registerSpriteSet(AdvancedValuables_Particles.PINK_GARNET_PARTICLES.get(), AdvancedValuablesParticlesTemplate.Provider::new);
            event.registerSpriteSet(AdvancedValuables_Particles.YELLOW_GARNET_PARTICLES.get(), AdvancedValuablesParticlesTemplate.Provider::new);

            event.registerSpriteSet(AdvancedValuables_Particles.FUSION_GEM_PARTICLES.get(), AdvancedValuablesParticlesTemplate.Provider::new);
            event.registerSpriteSet(AdvancedValuables_Particles.RUBY_PARTICLES.get(), AdvancedValuablesParticlesTemplate.Provider::new);

            event.registerSpriteSet(AdvancedValuables_Particles.RED_SAPPHIRE_BLOCK_BREAK_PARTICLES.get(), AVBlockBreakParticleTemplate.Provider::new);
            event.registerSpriteSet(AdvancedValuables_Particles.BLUE_SAPPHIRE_BLOCK_BREAK_PARTICLES.get(), AVBlockBreakParticleTemplate.Provider::new);
            event.registerSpriteSet(AdvancedValuables_Particles.GREEN_SAPPHIRE_BLOCK_BREAK_PARTICLES.get(), AVBlockBreakParticleTemplate.Provider::new);

            event.registerSpriteSet(AdvancedValuables_Particles.RED_GARNET_BLOCK_BREAK_PARTICLES.get(), AVBlockBreakParticleTemplate.Provider::new);
            event.registerSpriteSet(AdvancedValuables_Particles.BLUE_GARNET_BLOCK_BREAK_PARTICLES.get(), AVBlockBreakParticleTemplate.Provider::new);
            event.registerSpriteSet(AdvancedValuables_Particles.PINK_GARNET_BLOCK_BREAK_PARTICLES.get(), AVBlockBreakParticleTemplate.Provider::new);
            event.registerSpriteSet(AdvancedValuables_Particles.YELLOW_GARNET_BLOCK_BREAK_PARTICLES.get(), AVBlockBreakParticleTemplate.Provider::new);

            event.registerSpriteSet(AdvancedValuables_Particles.FUSION_GEM_BLOCK_BREAK_PARTICLES.get(), AVBlockBreakParticleTemplate.Provider::new);
            event.registerSpriteSet(AdvancedValuables_Particles.RUBY_BLOCK_BREAK_PARTICLES.get(), AVBlockBreakParticleTemplate.Provider::new);
        }
    }
}
