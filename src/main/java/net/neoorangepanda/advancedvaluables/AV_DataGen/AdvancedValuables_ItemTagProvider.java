package net.neoorangepanda.advancedvaluables.AV_DataGen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.data.ItemTagsProvider;
import net.neoorangepanda.advancedvaluables.AV_Registries.AdvancedValuables_ItemClass;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;
import net.neoorangepanda.advancedvaluables.AV_Utils.AdvancedValuables_Tags;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("all")
public class AdvancedValuables_ItemTagProvider extends ItemTagsProvider
{

    public AdvancedValuables_ItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider)
    {
        super(output, lookupProvider, AdvancedValuables.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider)
    {
        tag(AdvancedValuables_Tags.Items.VALUABLE_ITEMS)
                .addTags(AdvancedValuables_Tags.Items.SMELT_ITEMS,
                        AdvancedValuables_Tags.Items.RAW_ITEMS,
                        AdvancedValuables_Tags.Items.ELEMENTAL_ITEMS);

        tag(AdvancedValuables_Tags.Items.ELEMENTAL_ITEMS)
                .add(AdvancedValuables_ItemClass.SPARKITE.get());

        tag(AdvancedValuables_Tags.Items.SMELT_ITEMS)
                .add(AdvancedValuables_ItemClass.BLUE_SAPPHIRE.get())
                .add(AdvancedValuables_ItemClass.RED_SAPPHIRE.get())
                .add(AdvancedValuables_ItemClass.GREEN_SAPPHIRE.get())
                .add(AdvancedValuables_ItemClass.RED_GARNET.get())
                .add(AdvancedValuables_ItemClass.BLUE_GARNET.get())
                .add(AdvancedValuables_ItemClass.PINK_GARNET.get())
                .add(AdvancedValuables_ItemClass.YELLOW_GARNET.get())
                .add(AdvancedValuables_ItemClass.FUSION_GEM.get())
                .add(AdvancedValuables_ItemClass.RUBY.get());

        tag(AdvancedValuables_Tags.Items.RAW_ITEMS)
                .add(AdvancedValuables_ItemClass.BLUE_RAW_SAPPHIRE.get())
                .add(AdvancedValuables_ItemClass.RED_RAW_SAPPHIRE.get())
                .add(AdvancedValuables_ItemClass.GREEN_RAW_SAPPHIRE.get())
                .add(AdvancedValuables_ItemClass.RED_RAW_GARNET.get())
                .add(AdvancedValuables_ItemClass.BLUE_RAW_GARNET.get())
                .add(AdvancedValuables_ItemClass.PINK_RAW_GARNET.get())
                .add(AdvancedValuables_ItemClass.YELLOW_RAW_GARNET.get())
                .add(AdvancedValuables_ItemClass.RAW_FUSION_GEM.get())
                .add(AdvancedValuables_ItemClass.RAW_RUBY.get());

        tag(AdvancedValuables_Tags.Items.AV_HELMETS)
                .add(AdvancedValuables_ItemClass.RED_SAPPHIRE_HELMET.get())
                .add(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_HELMET.get())
                .add(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_HELMET.get())
                .add(AdvancedValuables_ItemClass.RED_GARNET_HELMET.get())
                .add(AdvancedValuables_ItemClass.BLUE_GARNET_HELMET.get())
                .add(AdvancedValuables_ItemClass.PINK_GARNET_HELMET.get())
                .add(AdvancedValuables_ItemClass.YELLOW_GARNET_HELMET.get())
                .add(AdvancedValuables_ItemClass.FUSION_HELMET.get())
                .add(AdvancedValuables_ItemClass.RUBY_HELMET.get());

        tag(AdvancedValuables_Tags.Items.AV_BOOTS)
                .add(AdvancedValuables_ItemClass.RED_SAPPHIRE_BOOTS.get())
                .add(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_BOOTS.get())
                .add(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_BOOTS.get())
                .add(AdvancedValuables_ItemClass.RED_GARNET_BOOTS.get())
                .add(AdvancedValuables_ItemClass.BLUE_GARNET_BOOTS.get())
                .add(AdvancedValuables_ItemClass.PINK_GARNET_BOOTS.get())
                .add(AdvancedValuables_ItemClass.YELLOW_GARNET_BOOTS.get())
                .add(AdvancedValuables_ItemClass.FUSION_BOOTS.get())
                .add(AdvancedValuables_ItemClass.RUBY_BOOTS.get());

        tag(AdvancedValuables_Tags.Items.AV_LEGGINGS)
                .add(AdvancedValuables_ItemClass.RED_SAPPHIRE_LEGGINGS.get())
                .add(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_LEGGINGS.get())
                .add(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_LEGGINGS.get())
                .add(AdvancedValuables_ItemClass.RED_GARNET_LEGGINGS.get())
                .add(AdvancedValuables_ItemClass.BLUE_GARNET_LEGGINGS.get())
                .add(AdvancedValuables_ItemClass.PINK_GARNET_LEGGINGS.get())
                .add(AdvancedValuables_ItemClass.YELLOW_GARNET_LEGGINGS.get())
                .add(AdvancedValuables_ItemClass.FUSION_LEGGINGS.get())
                .add(AdvancedValuables_ItemClass.RUBY_LEGGINGS.get());

        tag(AdvancedValuables_Tags.Items.AV_CHESTPLATES)
                .add(AdvancedValuables_ItemClass.RED_SAPPHIRE_CHESTPLATE.get())
                .add(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_CHESTPLATE.get())
                .add(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_CHESTPLATE.get())
                .add(AdvancedValuables_ItemClass.RED_GARNET_CHESTPLATE.get())
                .add(AdvancedValuables_ItemClass.BLUE_GARNET_CHESTPLATE.get())
                .add(AdvancedValuables_ItemClass.PINK_GARNET_CHESTPLATE.get())
                .add(AdvancedValuables_ItemClass.YELLOW_GARNET_CHESTPLATE.get())
                .add(AdvancedValuables_ItemClass.FUSION_CHESTPLATE.get())
                .add(AdvancedValuables_ItemClass.RUBY_CHESTPLATE.get());

        tag(AdvancedValuables_Tags.Items.AV_PICKAXES)
                .add(AdvancedValuables_ItemClass.RED_SAPPHIRE_PICKAXE.get())
                .add(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_PICKAXE.get())
                .add(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_PICKAXE.get())
                .add(AdvancedValuables_ItemClass.RED_GARNET_PICKAXE.get())
                .add(AdvancedValuables_ItemClass.BLUE_GARNET_PICKAXE.get())
                .add(AdvancedValuables_ItemClass.PINK_GARNET_PICKAXE.get())
                .add(AdvancedValuables_ItemClass.YELLOW_GARNET_PICKAXE.get())
                .add(AdvancedValuables_ItemClass.FUSION_PICKAXE.get())
                .add(AdvancedValuables_ItemClass.RUBY_PICKAXE.get());

        tag(AdvancedValuables_Tags.Items.AV_AXES)
                .add(AdvancedValuables_ItemClass.RED_SAPPHIRE_AXE.get())
                .add(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_AXE.get())
                .add(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_AXE.get())
                .add(AdvancedValuables_ItemClass.RED_GARNET_AXE.get())
                .add(AdvancedValuables_ItemClass.BLUE_GARNET_AXE.get())
                .add(AdvancedValuables_ItemClass.PINK_GARNET_AXE.get())
                .add(AdvancedValuables_ItemClass.YELLOW_GARNET_AXE.get())
                .add(AdvancedValuables_ItemClass.FUSION_AXE.get())
                .add(AdvancedValuables_ItemClass.RUBY_AXE.get());

        tag(AdvancedValuables_Tags.Items.AV_SHOVELS)
                .add(AdvancedValuables_ItemClass.RED_SAPPHIRE_SHOVEL.get())
                .add(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_SHOVEL.get())
                .add(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_SHOVEL.get())
                .add(AdvancedValuables_ItemClass.RED_GARNET_SHOVEL.get())
                .add(AdvancedValuables_ItemClass.BLUE_GARNET_SHOVEL.get())
                .add(AdvancedValuables_ItemClass.PINK_GARNET_SHOVEL.get())
                .add(AdvancedValuables_ItemClass.YELLOW_GARNET_SHOVEL.get())
                .add(AdvancedValuables_ItemClass.FUSION_SHOVEL.get())
                .add(AdvancedValuables_ItemClass.RUBY_SHOVEL.get());

        tag(AdvancedValuables_Tags.Items.AV_HOES)
                .add(AdvancedValuables_ItemClass.RED_SAPPHIRE_HOE.get())
                .add(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_HOE.get())
                .add(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_HOE.get())
                .add(AdvancedValuables_ItemClass.RED_GARNET_HOE.get())
                .add(AdvancedValuables_ItemClass.BLUE_GARNET_HOE.get())
                .add(AdvancedValuables_ItemClass.PINK_GARNET_HOE.get())
                .add(AdvancedValuables_ItemClass.YELLOW_GARNET_HOE.get())
                .add(AdvancedValuables_ItemClass.FUSION_HOE.get())
                .add(AdvancedValuables_ItemClass.RUBY_HOE.get());

        tag(AdvancedValuables_Tags.Items.AV_SWORDS)
                .addTag(AdvancedValuables_Tags.Items.AV_ELEMENTAL_WEAPONS)
                .add(AdvancedValuables_ItemClass.RED_SAPPHIRE_SWORD.get())
                .add(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_SWORD.get())
                .add(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_SWORD.get())
                .add(AdvancedValuables_ItemClass.RED_GARNET_SWORD.get())
                .add(AdvancedValuables_ItemClass.BLUE_GARNET_SWORD.get())
                .add(AdvancedValuables_ItemClass.PINK_GARNET_SWORD.get())
                .add(AdvancedValuables_ItemClass.YELLOW_GARNET_SWORD.get())
                .add(AdvancedValuables_ItemClass.FUSION_SWORD.get())
                .add(AdvancedValuables_ItemClass.RUBY_SWORD.get());

        tag(AdvancedValuables_Tags.Items.AV_SPEARS)
                .add(AdvancedValuables_ItemClass.RED_SAPPHIRE_SPEAR.get())
                .add(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_SPEAR.get())
                .add(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_SPEAR.get())
                .add(AdvancedValuables_ItemClass.RED_GARNET_SPEAR.get())
                .add(AdvancedValuables_ItemClass.BLUE_GARNET_SPEAR.get())
                .add(AdvancedValuables_ItemClass.PINK_GARNET_SPEAR.get())
                .add(AdvancedValuables_ItemClass.YELLOW_GARNET_SPEAR.get())
                .add(AdvancedValuables_ItemClass.FUSION_SPEAR.get())
                .add(AdvancedValuables_ItemClass.RUBY_SPEAR.get());

        tag(AdvancedValuables_Tags.Items.AV_ELEMENTAL_WEAPONS)
                .add(AdvancedValuables_ItemClass.SPARKITE_STAFF.get());

        tag(AdvancedValuables_Tags.Items.AV_SAPPHIRE_POWDERS)
            .add(AdvancedValuables_ItemClass.RED_SAPPHIRE_POWDER.get())
            .add(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_POWDER.get())
            .add(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_POWDER.get())
            .add(AdvancedValuables_ItemClass.MIXED_SAPPHIRE_POWDER.get());

        tag(AdvancedValuables_Tags.Items.AV_GARNET_POWDERS)
            .add(AdvancedValuables_ItemClass.RED_GARNET_POWDER.get())
            .add(AdvancedValuables_ItemClass.BLUE_GARNET_POWDER.get())
            .add(AdvancedValuables_ItemClass.PINK_GARNET_POWDER.get())
            .add(AdvancedValuables_ItemClass.YELLOW_GARNET_POWDER.get())
            .add(AdvancedValuables_ItemClass.MIXED_GARNET_POWDER.get());

        tag(AdvancedValuables_Tags.Items.RED_SAPPHIRE_REPAIR).add(AdvancedValuables_ItemClass.RED_SAPPHIRE.get());
        tag(AdvancedValuables_Tags.Items.BLUE_SAPPHIRE_REPAIR).add(AdvancedValuables_ItemClass.BLUE_SAPPHIRE.get());
        tag(AdvancedValuables_Tags.Items.GREEN_SAPPHIRE_REPAIR).add(AdvancedValuables_ItemClass.GREEN_SAPPHIRE.get());

        tag(AdvancedValuables_Tags.Items.RED_GARNET_REPAIR).add(AdvancedValuables_ItemClass.RED_GARNET.get());
        tag(AdvancedValuables_Tags.Items.BLUE_GARNET_REPAIR).add(AdvancedValuables_ItemClass.BLUE_GARNET.get());
        tag(AdvancedValuables_Tags.Items.PINK_GARNET_REPAIR).add(AdvancedValuables_ItemClass.PINK_GARNET.get());
        tag(AdvancedValuables_Tags.Items.YELLOW_GARNET_REPAIR).add(AdvancedValuables_ItemClass.YELLOW_GARNET.get());

        tag(AdvancedValuables_Tags.Items.FUSION_REPAIR).add(AdvancedValuables_ItemClass.FUSION_GEM.get());
        tag(AdvancedValuables_Tags.Items.RUBY_REPAIR).add(AdvancedValuables_ItemClass.RUBY.get());
        tag(AdvancedValuables_Tags.Items.SPARKITE_REPAIR).add(AdvancedValuables_ItemClass.SPARKITE.get());

        tag(ItemTags.PICKAXES).addTag(AdvancedValuables_Tags.Items.AV_PICKAXES);
        tag(ItemTags.AXES).addTag(AdvancedValuables_Tags.Items.AV_AXES);
        tag(ItemTags.SHOVELS).addTag(AdvancedValuables_Tags.Items.AV_SHOVELS);
        tag(ItemTags.HOES).addTag(AdvancedValuables_Tags.Items.AV_HOES);
        tag(ItemTags.SWORDS).addTag(AdvancedValuables_Tags.Items.AV_SWORDS);
        tag(ItemTags.SPEARS).addTag(AdvancedValuables_Tags.Items.AV_SPEARS);

        tag(ItemTags.TRIM_MATERIALS).addTag(AdvancedValuables_Tags.Items.SMELT_ITEMS);
        tag(ItemTags.TRIMMABLE_ARMOR)
                .addTags(AdvancedValuables_Tags.Items.AV_CHESTPLATES,
                        AdvancedValuables_Tags.Items.AV_HELMETS,
                        AdvancedValuables_Tags.Items.AV_LEGGINGS,
                        AdvancedValuables_Tags.Items.AV_BOOTS);
        tag(ItemTags.HEAD_ARMOR).addTag(AdvancedValuables_Tags.Items.AV_HELMETS);
        tag(ItemTags.CHEST_ARMOR).addTag(AdvancedValuables_Tags.Items.AV_CHESTPLATES);
        tag(ItemTags.LEG_ARMOR).addTag(AdvancedValuables_Tags.Items.AV_LEGGINGS);
        tag(ItemTags.FOOT_ARMOR).addTag(AdvancedValuables_Tags.Items.AV_BOOTS);
    }
}
