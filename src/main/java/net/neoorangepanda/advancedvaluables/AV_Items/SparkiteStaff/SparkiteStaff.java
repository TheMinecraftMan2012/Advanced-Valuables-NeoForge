package net.neoorangepanda.advancedvaluables.AV_Items.SparkiteStaff;

import com.geckolib.animatable.GeoItem;
import com.geckolib.animatable.client.GeoRenderProvider;
import com.geckolib.animatable.instance.AnimatableInstanceCache;
import com.geckolib.animatable.manager.AnimatableManager;
import com.geckolib.animation.AnimationController;
import com.geckolib.animation.RawAnimation;
import com.geckolib.renderer.GeoItemRenderer;
import com.geckolib.util.GeckoLibUtil;
import com.google.common.base.Suppliers;
import net.minecraft.client.Minecraft;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.neoorangepanda.advancedvaluables.AV_Enchantments.AdvancedValuables_EnchantmentBootstrap;
import net.neoorangepanda.advancedvaluables.AV_Registries.AdvancedValuables_DataComponent;
import net.neoorangepanda.advancedvaluables.AV_Screens.AV_ThunderConfig.ThunderConfigScreen;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.Nullable;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class SparkiteStaff extends Item implements GeoItem
{
    private static final int HOLD_THRESHOLD_TICKS = 12;
    private static final int USE_DURATION = 72000;
    private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);
    public static final String FROM_STAFF_KEY = "advancedvaluables_from_staff";

    public SparkiteStaff(Properties properties)
    {
        super(properties);
        GeoItem.registerSyncedAnimatable(this);
    }

    @Override
    public @NotNull ItemUseAnimation getUseAnimation(@NotNull ItemStack itemStack)
    {
        return ItemUseAnimation.NONE;
    }

    @Override
    public int getUseDuration(@NotNull ItemStack itemStack, @NotNull LivingEntity user)
    {
        return USE_DURATION;
    }

    @Override
    public @NotNull InteractionResult use(@NotNull Level level, Player player, @NotNull InteractionHand hand)
    {
        player.startUsingItem(hand);
        return InteractionResult.CONSUME;
    }

    @Override
    public void onUseTick(@NotNull Level level, @NotNull LivingEntity livingEntity, @NotNull ItemStack stack, int remainingUseDuration)
    {
        int ticksUsed = getUseDuration(stack, livingEntity) - remainingUseDuration;

        if (ticksUsed == HOLD_THRESHOLD_TICKS && level.isClientSide())
        {
            int current = stack.getOrDefault(AdvancedValuables_DataComponent.THUNDER_COUNT.get(), 1);
            Minecraft.getInstance().setScreen(new ThunderConfigScreen(current));
            livingEntity.stopUsingItem();
        }
    }

    @Override
    public boolean releaseUsing(@NotNull ItemStack stack, @NotNull Level level, @NotNull LivingEntity livingEntity, int timeLeft)
    {
        int ticksUsed = getUseDuration(stack, livingEntity) - timeLeft;
        int count = stack.getOrDefault(AdvancedValuables_DataComponent.THUNDER_COUNT.get(), 1);

        if (ticksUsed >= HOLD_THRESHOLD_TICKS) return false;
        if (level.isClientSide() || !(livingEntity instanceof ServerPlayer serverPlayer)) return false;

        strikeThunder(serverPlayer, count);
        return true;
    }

    @Override
    public void createGeoRenderer(@NotNull Consumer<GeoRenderProvider> consumer)
    {
        consumer.accept(new GeoRenderProvider()
        {
            private final Supplier<GeoItemRenderer<@NotNull SparkiteStaff>> renderer = Suppliers.memoize(() ->
                    new GeoItemRenderer<>(SparkiteStaff.this));

            @Override
            public @Nullable GeoItemRenderer<?> getGeoItemRenderer()
            {
                return this.renderer.get();
            }
        });
    }

    @Override
    public void registerControllers(AnimatableManager.@NotNull ControllerRegistrar controllers)
    {
        controllers.add(new AnimationController<>("controller", 5, state -> state.setAndContinue(RawAnimation.begin().thenLoop("rotating"))));
    }

    @Override
    public @NotNull AnimatableInstanceCache getAnimatableInstanceCache()
    {
        return this.geoCache;
    }

    private void strikeThunder(ServerPlayer player, int count)
    {
        ServerLevel level = player.level();

        Vec3 start = player.getEyePosition();
        Vec3 look = player.getViewVector(1.0F);
        Vec3 end = start.add(look.scale(64.0));

        ClipContext ctx = new ClipContext(
                start, end,
                ClipContext.Block.OUTLINE,
                ClipContext.Fluid.NONE,
                player
        );
        BlockHitResult hit = level.clip(ctx);
        Vec3 target = hit.getLocation();

        LightningBolt bolt = EntityType.LIGHTNING_BOLT.create(level, EntitySpawnReason.TRIGGERED);

        assert bolt != null;
        bolt.getPersistentData().putBoolean(FROM_STAFF_KEY, true);

        for (int i = 0; i < count; i++)
        {
            bolt.move(MoverType.PLAYER, target);
            bolt.setCause(player);
            level.addFreshEntity(bolt);
        }
    }

    @Override
    public boolean supportsEnchantment(@NotNull ItemStack stack, @NotNull Holder<@NotNull Enchantment> enchantment)
    {
        if (enchantment.is(AdvancedValuables_EnchantmentBootstrap.SMITEBOLT)) return false;

        return super.supportsEnchantment(stack, enchantment);
    }

    @Override
    @SuppressWarnings("deprecation")
    public void appendHoverText(@NotNull ItemStack itemStack, @NotNull TooltipContext context, @NotNull TooltipDisplay display,
                                @NotNull Consumer<Component> builder, @NotNull TooltipFlag tooltipFlag)
    {
        if(!Minecraft.getInstance().hasShiftDown()) builder.accept(Component.literal("Press §eShift§r for more info."));
        else builder.accept(Component.literal("""
                This is §bSparkite Staff§r.
                Press §aRight Click§r to summon thunder.
                Hold §Shift§r and §Left-Click§r to summon thunder explosion.
                Hold §aRight Click§r to open a menu. In here there is a box for number of thunder per right click.
                Good luck using it!
                """));
        super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
    }
}
