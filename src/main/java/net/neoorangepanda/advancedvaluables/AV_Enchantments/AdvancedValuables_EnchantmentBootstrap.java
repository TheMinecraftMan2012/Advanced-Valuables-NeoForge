package net.neoorangepanda.advancedvaluables.AV_Enchantments;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.EnchantmentTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentEffectComponents;
import net.minecraft.world.item.enchantment.EnchantmentTarget;
import net.neoorangepanda.advancedvaluables.AV_Enchantments.enchants.GemInfestationEnchantmentEffect;
import net.neoorangepanda.advancedvaluables.AV_Enchantments.enchants.PoisonShardEnchantmentEffect;
import net.neoorangepanda.advancedvaluables.AV_Enchantments.enchants.SheepKillerEnchantmentEffect;
import net.neoorangepanda.advancedvaluables.AV_Enchantments.enchants.SmiteboltEnchantmentEffect;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;

public class AdvancedValuables_EnchantmentBootstrap
{
    public static final ResourceKey<Enchantment> SMITEBOLT = createEnchantment("smitebolt");
    public static final ResourceKey<Enchantment> SHEEP_KILLER = createEnchantment("sheep_killer");
    public static final ResourceKey<Enchantment> POISON_SHARD = createEnchantment("poison_shard");
    public static final ResourceKey<Enchantment> GEM_INFESTATION = createEnchantment("gem_infestation");

    public static void bootstrap(BootstrapContext<Enchantment> context)
    {
        var enchantments = context.lookup(Registries.ENCHANTMENT);
        var items = context.lookup(Registries.ITEM);

        register(context, SMITEBOLT, Enchantment.enchantment(Enchantment.definition(items.getOrThrow(ItemTags.WEAPON_ENCHANTABLE), 5, 2,
                        Enchantment.dynamicCost(5, 7), Enchantment.dynamicCost(25, 7), 2, EquipmentSlotGroup.MAINHAND))
                .exclusiveWith(enchantments.getOrThrow(EnchantmentTags.DAMAGE_EXCLUSIVE))
                .withEffect(EnchantmentEffectComponents.POST_ATTACK, EnchantmentTarget.ATTACKER, EnchantmentTarget.VICTIM, new SmiteboltEnchantmentEffect()));

        register(context, SHEEP_KILLER, Enchantment.enchantment(Enchantment.definition(items.getOrThrow(ItemTags.WEAPON_ENCHANTABLE), 5, 5,
                        Enchantment.dynamicCost(5, 7), Enchantment.dynamicCost(25, 7), 2, EquipmentSlotGroup.MAINHAND))
                .exclusiveWith(enchantments.getOrThrow(EnchantmentTags.DAMAGE_EXCLUSIVE))
                .withEffect(EnchantmentEffectComponents.POST_ATTACK, EnchantmentTarget.ATTACKER, EnchantmentTarget.VICTIM, new SheepKillerEnchantmentEffect()));

        register(context, POISON_SHARD, Enchantment.enchantment(Enchantment.definition(items.getOrThrow(ItemTags.WEAPON_ENCHANTABLE), 5, 1,
                        Enchantment.dynamicCost(5, 7), Enchantment.dynamicCost(25, 7), 2, EquipmentSlotGroup.MAINHAND))
                .exclusiveWith(enchantments.getOrThrow(EnchantmentTags.DAMAGE_EXCLUSIVE))
                .withEffect(EnchantmentEffectComponents.POST_ATTACK, EnchantmentTarget.ATTACKER, EnchantmentTarget.VICTIM, new PoisonShardEnchantmentEffect()));

        register(context, GEM_INFESTATION, Enchantment.enchantment(Enchantment.definition(items.getOrThrow(ItemTags.WEAPON_ENCHANTABLE), 5, 3,
                        Enchantment.dynamicCost(5, 7), Enchantment.dynamicCost(25, 7), 2, EquipmentSlotGroup.MAINHAND))
                .exclusiveWith(enchantments.getOrThrow(EnchantmentTags.DAMAGE_EXCLUSIVE))
                .withEffect(EnchantmentEffectComponents.POST_ATTACK, EnchantmentTarget.ATTACKER, EnchantmentTarget.VICTIM, new GemInfestationEnchantmentEffect()));
    }

    private static ResourceKey<Enchantment> createEnchantment(String enchantment)
    {
        return ResourceKey.create(Registries.ENCHANTMENT, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, enchantment));
    }

    private static void register(BootstrapContext<Enchantment> registry, ResourceKey<Enchantment> key, Enchantment.Builder builder)
    {
        registry.register(key, builder.build(key.identifier()));
    }
}
