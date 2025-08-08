package net.neoorangepanda.advancedvaluables.AV_Libraries.Events;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.level.BlockEvent;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoorangepanda.advancedvaluables.AV_Libraries.AV_SpecialItems.HammerItem;
import net.neoorangepanda.advancedvaluables.AV_Registries.AdvancedValuables_ItemClass;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;
import net.neoorangepanda.advancedvaluables.AdvancedValuables_Config;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@EventBusSubscriber(modid = AdvancedValuables.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class AdvancedValuables_Events
{
    // -- Help taken from Kaupenjoe. See https://youtu.be/-EuJTKoLzlM?si=wl433_BoUGwaIJzc -- //

    private static final Set<BlockPos> HARVESTED_BLOCKS = new HashSet<>();

    @SubscribeEvent
    public static void onHammerUsage(BlockEvent.BreakEvent event)
    {
        Player player = event.getPlayer();
        ItemStack mainHandItem = player.getMainHandItem();

        if (mainHandItem.getItem() instanceof HammerItem hammer && player instanceof ServerPlayer serverPlayer)
        {
            BlockPos initialBlockPos = event.getPos();
            if (HARVESTED_BLOCKS.contains(initialBlockPos))
            {
                return;
            }

            for (BlockPos pos : HammerItem.getBlocksToBeDestroyed(1, initialBlockPos, serverPlayer))
            {
                if (pos == initialBlockPos || !hammer.isCorrectToolForDrops(mainHandItem, event.getLevel().getBlockState(pos)))
                {
                    continue;
                }

                HARVESTED_BLOCKS.add(pos);
                serverPlayer.gameMode.destroyBlock(pos);
                HARVESTED_BLOCKS.remove(pos);
            }
        }
    }

    @SubscribeEvent
    public static void addVillagerTrade(VillagerTradesEvent event)
    {
        if (event.getType() == VillagerProfession.FARMER)
        {
            if (AdvancedValuables_Config.VILLAGER_TRADE.isTrue())
            {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

                trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                        new ItemCost(AdvancedValuables_ItemClass.RED_SAPPHIRE.get(), 5),
                        new ItemStack(AdvancedValuables_ItemClass.RED_SAPPHIRE_APPLE.get(), 5), 10, 5, 0.05f
                ));
            }
        }
    }
}
