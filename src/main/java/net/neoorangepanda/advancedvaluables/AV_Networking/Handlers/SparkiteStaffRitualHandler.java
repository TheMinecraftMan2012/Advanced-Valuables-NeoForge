package net.neoorangepanda.advancedvaluables.AV_Networking.Handlers;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoorangepanda.advancedvaluables.AV_Registries.AdvancedValuables_BlockClass;
import net.neoorangepanda.advancedvaluables.AV_Registries.AdvancedValuables_ItemClass;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

@EventBusSubscriber(modid = AdvancedValuables.MOD_ID)
public class SparkiteStaffRitualHandler
{
    private static final Set<BlockPos> ACTIVE_ALTARS = new HashSet<>();
    private static final Object[][] STRUCTURE = {
            {-1, -1, (Supplier<Block>) AdvancedValuables_BlockClass.RED_GARNET_BLOCK},
            { 0, -1, (Supplier<Block>) () -> Blocks.NETHERRACK},
            { 1, -1, (Supplier<Block>) AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK},

            {-1,  0, (Supplier<Block>) () -> Blocks.NETHERRACK},
            { 1,  0, (Supplier<Block>) () -> Blocks.NETHERRACK},

            {-1,  1, (Supplier<Block>) AdvancedValuables_BlockClass.PINK_GARNET_BLOCK},
            { 0,  1, (Supplier<Block>) () -> Blocks.NETHERRACK},
            { 1,  1, (Supplier<Block>) AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK}
    };

    @SubscribeEvent
    public static void onItemDroppedForSparkiteStaff(EntityTickEvent.Post event)
    {
        if (!(event.getEntity() instanceof ItemEntity itemEntity)) return;
        if (itemEntity.level().isClientSide()) return;
        if (!(itemEntity.level() instanceof ServerLevel serverLevel)) return;
        if (!itemEntity.onGround()) return;

        ItemStack stack = itemEntity.getItem();
        boolean isRelevant = stack.is(AdvancedValuables_ItemClass.SPARKITE.get()) || stack.is(Items.STICK);
        if (!isRelevant) return;

        BlockPos altarPos = itemEntity.blockPosition().below();

        if (!serverLevel.getBlockState(altarPos).is(AdvancedValuables_BlockClass.SPARKITE_BLOCK.get())) return;
        if (!serverLevel.isRaining()) return;
        if (!isStructureValid(serverLevel, altarPos)) return;

        AABB searchArea = new AABB(altarPos).inflate(0.6, 1.0, 0.6);
        List<ItemEntity> nearbyItems = serverLevel.getEntitiesOfClass(ItemEntity.class, searchArea);

        ItemEntity sparkiteEntity = null;
        ItemEntity stickEntity = null;

        for (ItemEntity e : nearbyItems)
        {
            if (!e.isAlive()) return;
            if (sparkiteEntity == null && e.getItem().is(AdvancedValuables_ItemClass.SPARKITE.get())) sparkiteEntity = e;
            else if (stickEntity == null && e.getItem().is(Items.STICK)) stickEntity = e;
        }

        if (sparkiteEntity == null || stickEntity == null) return;
        if (!ACTIVE_ALTARS.add(altarPos)) return;

        try { performRitual(serverLevel, altarPos, sparkiteEntity, stickEntity); }
        finally { ACTIVE_ALTARS.remove(altarPos); }
    }

    private static boolean isStructureValid(ServerLevel serverLevel, BlockPos center)
    {
        for (Object[] entry : STRUCTURE)
        {
            int dx = (Integer) entry[0];
            int dz = (Integer) entry[1];

            @SuppressWarnings("unchecked")
            Supplier<Block> expectedSupplier = (Supplier<Block>) entry[2];
            Block expected = expectedSupplier.get();
            BlockPos pos = center.offset(dx, 0, dz);
            if (!serverLevel.getBlockState(pos).is(expected)) return false;
        }

        return true;
    }

    private static void performRitual(ServerLevel serverLevel, BlockPos altarPos, ItemEntity sparkite, ItemEntity stick)
    {
        sparkite.discard();
        stick.discard();

        LightningBolt lightningBolt = EntityType.LIGHTNING_BOLT.create(serverLevel, EntitySpawnReason.TRIGGERED);
        if (lightningBolt != null)
        {
            lightningBolt.setVisualOnly(true);
            lightningBolt.setPos(Vec3.atBottomCenterOf(altarPos.above()));
            serverLevel.addFreshEntity(lightningBolt);
        }
        serverLevel.playSound(null, altarPos, SoundEvents.LIGHTNING_BOLT_THUNDER, SoundSource.BLOCKS, 3.0F, 1.0F);

        ItemStack sparkiteStaff = new ItemStack(AdvancedValuables_ItemClass.SPARKITE_STAFF.get());
        ItemEntity sparkiteStaffEntity = new ItemEntity(serverLevel, altarPos.getX() + 0.5, altarPos.getY() + 1.0,
                altarPos.getZ() + 0.5, sparkiteStaff);

        sparkiteStaffEntity.setDefaultPickUpDelay();
        serverLevel.addFreshEntity(sparkiteStaffEntity);
    }
}
