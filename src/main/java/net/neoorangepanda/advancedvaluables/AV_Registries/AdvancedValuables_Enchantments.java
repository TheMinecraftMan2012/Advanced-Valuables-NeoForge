package net.neoorangepanda.advancedvaluables.AV_Registries;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.enchantment.effects.EnchantmentEntityEffect;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoorangepanda.advancedvaluables.AV_Enchantments.enchants.*;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;

import java.util.function.Supplier;

public class AdvancedValuables_Enchantments
{
    public static final DeferredRegister<MapCodec<? extends EnchantmentEntityEffect>> ENTITY_ENCHANTMENT_EFFECTS =
            DeferredRegister.create(Registries.ENCHANTMENT_ENTITY_EFFECT_TYPE, AdvancedValuables.MOD_ID);

    public static final Supplier<MapCodec<? extends EnchantmentEntityEffect>> SMITEBOLT =
            ENTITY_ENCHANTMENT_EFFECTS.register("smitebolt", () -> SmiteboltEnchantmentEffect.CODEC);

    public static final Supplier<MapCodec<? extends EnchantmentEntityEffect>> SHEEP_KILLER =
            ENTITY_ENCHANTMENT_EFFECTS.register("sheep_killer", () -> SheepKillerEnchantmentEffect.CODEC);

    public static final Supplier<MapCodec<? extends EnchantmentEntityEffect>> POISON_SHARD =
            ENTITY_ENCHANTMENT_EFFECTS.register("poison_shard", () -> PoisonShardEnchantmentEffect.CODEC);

    public static final Supplier<MapCodec<? extends EnchantmentEntityEffect>> GEM_INFESTATION =
            ENTITY_ENCHANTMENT_EFFECTS.register("gem_infestation", () -> GemInfestationEnchantmentEffect.CODEC);

    public static void register(IEventBus eventBus)
    {
        ENTITY_ENCHANTMENT_EFFECTS.register(eventBus);
    }
}
