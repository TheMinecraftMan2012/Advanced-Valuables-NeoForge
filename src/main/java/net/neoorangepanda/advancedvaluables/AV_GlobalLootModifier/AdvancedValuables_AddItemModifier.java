package net.neoorangepanda.advancedvaluables.AV_GlobalLootModifier;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.common.loot.LootModifier;
import org.jetbrains.annotations.NotNull;

public class AdvancedValuables_AddItemModifier extends LootModifier
{
    @SuppressWarnings("unused")
    public static final MapCodec<AdvancedValuables_AddItemModifier> CODEC = RecordCodecBuilder.mapCodec(instance ->
            LootModifier.codecStart(instance).and(
                    ItemStackTemplate.CODEC.fieldOf("stack").forGetter(inst -> inst.itemStack)).apply(instance,
                    (lootItemConditions, integer, itemStackTemplate) -> new AdvancedValuables_AddItemModifier(lootItemConditions, itemStackTemplate)));

    private final ItemStackTemplate itemStack;

    public AdvancedValuables_AddItemModifier(LootItemCondition[] conditionsIn, ItemStackTemplate itemStackTemplate)
    {
        super(conditionsIn, 1000);
        this.itemStack = itemStackTemplate;
    }

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(@NotNull ObjectArrayList<ItemStack> generatedLoot, @NotNull LootContext context)
    {
        for(LootItemCondition condition : this.conditions)
        {
            if(!condition.test(context))
            {
                return generatedLoot;
            }
        }

        generatedLoot.add(itemStack.create());
        return generatedLoot;
    }

    @Override
    public @NotNull MapCodec<? extends IGlobalLootModifier> codec()
    {
        return CODEC;
    }
}
