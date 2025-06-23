package net.theminecraftman.advancedvaluables.AV_DataGen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;

import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.theminecraftman.advancedvaluables.AV_Registries.AdvancedValuables_BlockClass;
import net.theminecraftman.advancedvaluables.AV_Registries.AdvancedValuables_ItemClass;

import java.util.Set;

public class AdvancedValuables_BlockLootTableProvider extends BlockLootSubProvider
{
    protected AdvancedValuables_BlockLootTableProvider(HolderLookup.Provider provider)
    {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
    }

    @Override
    protected void generate()
    {
        dropSelf(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK.get());
        dropSelf(AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK.get());
        dropSelf(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK.get());
        dropSelf(AdvancedValuables_BlockClass.RED_GARNET_BLOCK.get());
        dropSelf(AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK.get());
        dropSelf(AdvancedValuables_BlockClass.PINK_GARNET_BLOCK.get());
        dropSelf(AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK.get());
        dropSelf(AdvancedValuables_BlockClass.FUSION_BLOCK.get());
        dropSelf(AdvancedValuables_BlockClass.RUBY_BLOCK.get());

        dropSelf(AdvancedValuables_BlockClass.BLUE_RAW_SAPPHIRE_BLOCK.get());
        dropSelf(AdvancedValuables_BlockClass.RED_RAW_SAPPHIRE_BLOCK.get());
        dropSelf(AdvancedValuables_BlockClass.GREEN_RAW_SAPPHIRE_BLOCK.get());
        dropSelf(AdvancedValuables_BlockClass.RED_RAW_GARNET_BLOCK.get());
        dropSelf(AdvancedValuables_BlockClass.BLUE_RAW_GARNET_BLOCK.get());
        dropSelf(AdvancedValuables_BlockClass.PINK_RAW_GARNET_BLOCK.get());
        dropSelf(AdvancedValuables_BlockClass.YELLOW_RAW_GARNET_BLOCK.get());
        dropSelf(AdvancedValuables_BlockClass.RAW_FUSION_BLOCK.get());
        dropSelf(AdvancedValuables_BlockClass.RAW_RUBY_BLOCK.get());

        this.add(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_ORE.get(), block -> createMultipleOreDrops(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_ORE.get(), AdvancedValuables_ItemClass.BLUE_RAW_SAPPHIRE.get(), 2, 4));
        this.add(AdvancedValuables_BlockClass.RED_SAPPHIRE_ORE.get(), block -> createMultipleOreDrops(AdvancedValuables_BlockClass.RED_SAPPHIRE_ORE.get(), AdvancedValuables_ItemClass.RED_RAW_SAPPHIRE.get(), 2, 4));
        this.add(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_ORE.get(), block -> createMultipleOreDrops(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_ORE.get(), AdvancedValuables_ItemClass.GREEN_RAW_SAPPHIRE.get(), 2, 4));
        this.add(AdvancedValuables_BlockClass.RED_GARNET_ORE.get(), block -> createMultipleOreDrops(AdvancedValuables_BlockClass.RED_GARNET_ORE.get(), AdvancedValuables_ItemClass.RED_RAW_GARNET.get(), 2, 5));
        this.add(AdvancedValuables_BlockClass.BLUE_GARNET_ORE.get(), block -> createMultipleOreDrops(AdvancedValuables_BlockClass.BLUE_GARNET_ORE.get(), AdvancedValuables_ItemClass.BLUE_RAW_GARNET.get(), 2, 5));
        this.add(AdvancedValuables_BlockClass.PINK_GARNET_ORE.get(), block -> createMultipleOreDrops(AdvancedValuables_BlockClass.PINK_GARNET_ORE.get(), AdvancedValuables_ItemClass.PINK_RAW_GARNET.get(), 2, 5));
        this.add(AdvancedValuables_BlockClass.YELLOW_GARNET_ORE.get(), block -> createMultipleOreDrops(AdvancedValuables_BlockClass.YELLOW_GARNET_ORE.get(), AdvancedValuables_ItemClass.YELLOW_RAW_GARNET.get(), 2, 5));
        this.add(AdvancedValuables_BlockClass.FUSION_ORE.get(), block -> createMultipleOreDrops(AdvancedValuables_BlockClass.FUSION_ORE.get(), AdvancedValuables_ItemClass.RAW_FUSION_GEM.get(), 5, 10));
        this.add(AdvancedValuables_BlockClass.RUBY_ORE.get(), block -> createMultipleOreDrops(AdvancedValuables_BlockClass.RUBY_ORE.get(), AdvancedValuables_ItemClass.RAW_RUBY.get(), 2, 6));

        this.add(AdvancedValuables_BlockClass.DEEPSLATE_BLUE_SAPPHIRE_ORE.get(), block -> createMultipleOreDrops(AdvancedValuables_BlockClass.DEEPSLATE_BLUE_SAPPHIRE_ORE.get(), AdvancedValuables_ItemClass.BLUE_RAW_SAPPHIRE.get(), 2, 5));
        this.add(AdvancedValuables_BlockClass.DEEPSLATE_RED_SAPPHIRE_ORE.get(), block -> createMultipleOreDrops(AdvancedValuables_BlockClass.DEEPSLATE_RED_SAPPHIRE_ORE.get(), AdvancedValuables_ItemClass.RED_RAW_SAPPHIRE.get(), 2, 5));
        this.add(AdvancedValuables_BlockClass.DEEPSLATE_GREEN_SAPPHIRE_ORE.get(), block -> createMultipleOreDrops(AdvancedValuables_BlockClass.DEEPSLATE_GREEN_SAPPHIRE_ORE.get(), AdvancedValuables_ItemClass.GREEN_RAW_SAPPHIRE.get(), 2, 5));
        this.add(AdvancedValuables_BlockClass.DEEPSLATE_RED_GARNET_ORE.get(), block -> createMultipleOreDrops(AdvancedValuables_BlockClass.DEEPSLATE_RED_GARNET_ORE.get(), AdvancedValuables_ItemClass.RED_RAW_GARNET.get(), 2, 6));
        this.add(AdvancedValuables_BlockClass.DEEPSLATE_BLUE_GARNET_ORE.get(), block -> createMultipleOreDrops(AdvancedValuables_BlockClass.DEEPSLATE_BLUE_GARNET_ORE.get(), AdvancedValuables_ItemClass.BLUE_RAW_GARNET.get(), 2, 6));
        this.add(AdvancedValuables_BlockClass.DEEPSLATE_PINK_GARNET_ORE.get(), block -> createMultipleOreDrops(AdvancedValuables_BlockClass.DEEPSLATE_PINK_GARNET_ORE.get(), AdvancedValuables_ItemClass.PINK_RAW_GARNET.get(), 2, 6));
        this.add(AdvancedValuables_BlockClass.DEEPSLATE_YELLOW_GARNET_ORE.get(), block -> createMultipleOreDrops(AdvancedValuables_BlockClass.DEEPSLATE_YELLOW_GARNET_ORE.get(), AdvancedValuables_ItemClass.YELLOW_RAW_GARNET.get(), 2, 6));
        this.add(AdvancedValuables_BlockClass.DEEPSLATE_FUSION_ORE.get(), block -> createMultipleOreDrops(AdvancedValuables_BlockClass.DEEPSLATE_FUSION_ORE.get(), AdvancedValuables_ItemClass.RAW_FUSION_GEM.get(), 6, 12));
        this.add(AdvancedValuables_BlockClass.DEEPSLATE_RUBY_ORE.get(), block -> createMultipleOreDrops(AdvancedValuables_BlockClass.DEEPSLATE_RUBY_ORE.get(), AdvancedValuables_ItemClass.RAW_RUBY.get(), 2, 7));

        dropSelf(AdvancedValuables_BlockClass.RED_SAPPHIRE_STAIRS.get());
        dropSelf(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_STAIRS.get());
        dropSelf(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_STAIRS.get());
        dropSelf(AdvancedValuables_BlockClass.RED_GARNET_STAIRS.get());
        dropSelf(AdvancedValuables_BlockClass.BLUE_GARNET_STAIRS.get());
        dropSelf(AdvancedValuables_BlockClass.PINK_GARNET_STAIRS.get());
        dropSelf(AdvancedValuables_BlockClass.YELLOW_GARNET_STAIRS.get());
        dropSelf(AdvancedValuables_BlockClass.RUBY_STAIRS.get());
        dropSelf(AdvancedValuables_BlockClass.FUSION_STAIRS.get());

        dropSelf(AdvancedValuables_BlockClass.RED_SAPPHIRE_PRESSURE_PLATE.get());
        dropSelf(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_PRESSURE_PLATE.get());
        dropSelf(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_PRESSURE_PLATE.get());
        dropSelf(AdvancedValuables_BlockClass.RED_GARNET_PRESSURE_PLATE.get());
        dropSelf(AdvancedValuables_BlockClass.BLUE_GARNET_PRESSURE_PLATE.get());
        dropSelf(AdvancedValuables_BlockClass.PINK_GARNET_PRESSURE_PLATE.get());
        dropSelf(AdvancedValuables_BlockClass.YELLOW_GARNET_PRESSURE_PLATE.get());
        dropSelf(AdvancedValuables_BlockClass.RUBY_PRESSURE_PLATE.get());
        dropSelf(AdvancedValuables_BlockClass.FUSION_PRESSURE_PLATE.get());

        dropSelf(AdvancedValuables_BlockClass.RED_SAPPHIRE_BUTTON.get());
        dropSelf(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BUTTON.get());
        dropSelf(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BUTTON.get());
        dropSelf(AdvancedValuables_BlockClass.RED_GARNET_BUTTON.get());
        dropSelf(AdvancedValuables_BlockClass.BLUE_GARNET_BUTTON.get());
        dropSelf(AdvancedValuables_BlockClass.PINK_GARNET_BUTTON.get());
        dropSelf(AdvancedValuables_BlockClass.YELLOW_GARNET_BUTTON.get());
        dropSelf(AdvancedValuables_BlockClass.RUBY_BUTTON.get());
        dropSelf(AdvancedValuables_BlockClass.FUSION_BUTTON.get());

        dropSelf(AdvancedValuables_BlockClass.RED_SAPPHIRE_FENCE.get());
        dropSelf(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_FENCE.get());
        dropSelf(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_FENCE.get());
        dropSelf(AdvancedValuables_BlockClass.RED_GARNET_FENCE.get());
        dropSelf(AdvancedValuables_BlockClass.BLUE_GARNET_FENCE.get());
        dropSelf(AdvancedValuables_BlockClass.PINK_GARNET_FENCE.get());
        dropSelf(AdvancedValuables_BlockClass.YELLOW_GARNET_FENCE.get());
        dropSelf(AdvancedValuables_BlockClass.RUBY_FENCE.get());
        dropSelf(AdvancedValuables_BlockClass.FUSION_FENCE.get());

        dropSelf(AdvancedValuables_BlockClass.RED_SAPPHIRE_FENCE_GATE.get());
        dropSelf(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_FENCE_GATE.get());
        dropSelf(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_FENCE_GATE.get());
        dropSelf(AdvancedValuables_BlockClass.RED_GARNET_FENCE_GATE.get());
        dropSelf(AdvancedValuables_BlockClass.BLUE_GARNET_FENCE_GATE.get());
        dropSelf(AdvancedValuables_BlockClass.PINK_GARNET_FENCE_GATE.get());
        dropSelf(AdvancedValuables_BlockClass.YELLOW_GARNET_FENCE_GATE.get());
        dropSelf(AdvancedValuables_BlockClass.RUBY_FENCE_GATE.get());
        dropSelf(AdvancedValuables_BlockClass.FUSION_FENCE_GATE.get());

        dropSelf(AdvancedValuables_BlockClass.RED_SAPPHIRE_WALL.get());
        dropSelf(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_WALL.get());
        dropSelf(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_WALL.get());
        dropSelf(AdvancedValuables_BlockClass.RED_GARNET_WALL.get());
        dropSelf(AdvancedValuables_BlockClass.BLUE_GARNET_WALL.get());
        dropSelf(AdvancedValuables_BlockClass.PINK_GARNET_WALL.get());
        dropSelf(AdvancedValuables_BlockClass.YELLOW_GARNET_WALL.get());
        dropSelf(AdvancedValuables_BlockClass.RUBY_WALL.get());
        dropSelf(AdvancedValuables_BlockClass.FUSION_WALL.get());

        dropSelf(AdvancedValuables_BlockClass.RED_SAPPHIRE_TRAPDOOR.get());
        dropSelf(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_TRAPDOOR.get());
        dropSelf(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_TRAPDOOR.get());
        dropSelf(AdvancedValuables_BlockClass.RED_GARNET_TRAPDOOR.get());
        dropSelf(AdvancedValuables_BlockClass.BLUE_GARNET_TRAPDOOR.get());
        dropSelf(AdvancedValuables_BlockClass.PINK_GARNET_TRAPDOOR.get());
        dropSelf(AdvancedValuables_BlockClass.YELLOW_GARNET_TRAPDOOR.get());
        dropSelf(AdvancedValuables_BlockClass.RUBY_TRAPDOOR.get());
        dropSelf(AdvancedValuables_BlockClass.FUSION_TRAPDOOR.get());

        this.add(AdvancedValuables_BlockClass.RED_SAPPHIRE_SLAB.get(), block -> createSlabItemTable(AdvancedValuables_BlockClass.RED_SAPPHIRE_SLAB.get()));
        this.add(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_SLAB.get(), block -> createSlabItemTable(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_SLAB.get()));
        this.add(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_SLAB.get(), block -> createSlabItemTable(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_SLAB.get()));
        this.add(AdvancedValuables_BlockClass.RED_GARNET_SLAB.get(), block -> createSlabItemTable(AdvancedValuables_BlockClass.RED_GARNET_SLAB.get()));
        this.add(AdvancedValuables_BlockClass.BLUE_GARNET_SLAB.get(), block -> createSlabItemTable(AdvancedValuables_BlockClass.BLUE_GARNET_SLAB.get()));
        this.add(AdvancedValuables_BlockClass.PINK_GARNET_SLAB.get(), block -> createSlabItemTable(AdvancedValuables_BlockClass.PINK_GARNET_SLAB.get()));
        this.add(AdvancedValuables_BlockClass.YELLOW_GARNET_SLAB.get(), block -> createSlabItemTable(AdvancedValuables_BlockClass.YELLOW_GARNET_SLAB.get()));
        this.add(AdvancedValuables_BlockClass.RUBY_SLAB.get(), block -> createSlabItemTable(AdvancedValuables_BlockClass.RUBY_SLAB.get()));
        this.add(AdvancedValuables_BlockClass.FUSION_SLAB.get(), block -> createSlabItemTable(AdvancedValuables_BlockClass.FUSION_SLAB.get()));

        this.add(AdvancedValuables_BlockClass.RED_SAPPHIRE_DOOR.get(), block -> createDoorTable(AdvancedValuables_BlockClass.RED_SAPPHIRE_DOOR.get()));
        this.add(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_DOOR.get(), block -> createDoorTable(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_DOOR.get()));
        this.add(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_DOOR.get(), block -> createDoorTable(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_DOOR.get()));
        this.add(AdvancedValuables_BlockClass.RED_GARNET_DOOR.get(), block -> createDoorTable(AdvancedValuables_BlockClass.RED_GARNET_DOOR.get()));
        this.add(AdvancedValuables_BlockClass.BLUE_GARNET_DOOR.get(), block -> createDoorTable(AdvancedValuables_BlockClass.BLUE_GARNET_DOOR.get()));
        this.add(AdvancedValuables_BlockClass.PINK_GARNET_DOOR.get(), block -> createDoorTable(AdvancedValuables_BlockClass.PINK_GARNET_DOOR.get()));
        this.add(AdvancedValuables_BlockClass.YELLOW_GARNET_DOOR.get(), block -> createDoorTable(AdvancedValuables_BlockClass.YELLOW_GARNET_DOOR.get()));
        this.add(AdvancedValuables_BlockClass.RUBY_DOOR.get(), block -> createDoorTable(AdvancedValuables_BlockClass.RUBY_DOOR.get()));
        this.add(AdvancedValuables_BlockClass.FUSION_DOOR.get(), block -> createDoorTable(AdvancedValuables_BlockClass.FUSION_DOOR.get()));
    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock, this.applyExplosionDecay(pBlock,
                LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks()
    {
        return AdvancedValuables_BlockClass.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
