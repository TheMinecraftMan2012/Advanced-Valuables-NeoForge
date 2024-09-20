package net.theminecraftman.advancedvaluables.AV_DataGen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;
import net.theminecraftman.advancedvaluables.AV_Templates.AdvancedValuables_ItemClass;
import net.theminecraftman.advancedvaluables.AdvancedValuables;

public class AdvancedValuables_ItemModelProvider extends ItemModelProvider
{
    public AdvancedValuables_ItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper)
    {
        super(output, AdvancedValuables.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        basicItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE.get());
        basicItem(AdvancedValuables_ItemClass.RED_SAPPHIRE.get());
        basicItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE.get());

        basicItem(AdvancedValuables_ItemClass.RED_GARNET.get());
        basicItem(AdvancedValuables_ItemClass.BLUE_GARNET.get());
        basicItem(AdvancedValuables_ItemClass.PINK_GARNET.get());
        basicItem(AdvancedValuables_ItemClass.YELLOW_GARNET.get());

        basicItem(AdvancedValuables_ItemClass.FUSION_GEM.get());
        basicItem(AdvancedValuables_ItemClass.RUBY.get());

        basicItem(AdvancedValuables_ItemClass.BLUE_RAW_SAPPHIRE.get());
        basicItem(AdvancedValuables_ItemClass.RED_RAW_SAPPHIRE.get());
        basicItem(AdvancedValuables_ItemClass.GREEN_RAW_SAPPHIRE.get());

        basicItem(AdvancedValuables_ItemClass.RED_RAW_GARNET.get());
        basicItem(AdvancedValuables_ItemClass.BLUE_RAW_GARNET.get());
        basicItem(AdvancedValuables_ItemClass.PINK_RAW_GARNET.get());
        basicItem(AdvancedValuables_ItemClass.YELLOW_RAW_GARNET.get());

        basicItem(AdvancedValuables_ItemClass.RAW_FUSION_GEM.get());
        basicItem(AdvancedValuables_ItemClass.RAW_RUBY.get());

        handheldItem(AdvancedValuables_ItemClass.RED_SAPPHIRE_PICKAXE);
        handheldItem(AdvancedValuables_ItemClass.RED_SAPPHIRE_AXE);
        handheldItem(AdvancedValuables_ItemClass.RED_SAPPHIRE_SHOVEL);
        handheldItem(AdvancedValuables_ItemClass.RED_SAPPHIRE_HOE);
        handheldItem(AdvancedValuables_ItemClass.RED_SAPPHIRE_SWORD);

        handheldItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_PICKAXE);
        handheldItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_AXE);
        handheldItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_SHOVEL);
        handheldItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_HOE);
        handheldItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_SWORD);

        handheldItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_PICKAXE);
        handheldItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_AXE);
        handheldItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_SHOVEL);
        handheldItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_HOE);
        handheldItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_SWORD);

        handheldItem(AdvancedValuables_ItemClass.RED_GARNET_PICKAXE);
        handheldItem(AdvancedValuables_ItemClass.RED_GARNET_AXE);
        handheldItem(AdvancedValuables_ItemClass.RED_GARNET_SHOVEL);
        handheldItem(AdvancedValuables_ItemClass.RED_GARNET_HOE);
        handheldItem(AdvancedValuables_ItemClass.RED_GARNET_SWORD);

        handheldItem(AdvancedValuables_ItemClass.BLUE_GARNET_PICKAXE);
        handheldItem(AdvancedValuables_ItemClass.BLUE_GARNET_AXE);
        handheldItem(AdvancedValuables_ItemClass.BLUE_GARNET_SHOVEL);
        handheldItem(AdvancedValuables_ItemClass.BLUE_GARNET_HOE);
        handheldItem(AdvancedValuables_ItemClass.BLUE_GARNET_SWORD);

        handheldItem(AdvancedValuables_ItemClass.PINK_GARNET_PICKAXE);
        handheldItem(AdvancedValuables_ItemClass.PINK_GARNET_AXE);
        handheldItem(AdvancedValuables_ItemClass.PINK_GARNET_SHOVEL);
        handheldItem(AdvancedValuables_ItemClass.PINK_GARNET_HOE);
        handheldItem(AdvancedValuables_ItemClass.PINK_GARNET_SWORD);

        handheldItem(AdvancedValuables_ItemClass.YELLOW_GARNET_PICKAXE);
        handheldItem(AdvancedValuables_ItemClass.YELLOW_GARNET_AXE);
        handheldItem(AdvancedValuables_ItemClass.YELLOW_GARNET_SHOVEL);
        handheldItem(AdvancedValuables_ItemClass.YELLOW_GARNET_HOE);
        handheldItem(AdvancedValuables_ItemClass.YELLOW_GARNET_SWORD);

        handheldItem(AdvancedValuables_ItemClass.FUSION_PICKAXE);
        handheldItem(AdvancedValuables_ItemClass.FUSION_AXE);
        handheldItem(AdvancedValuables_ItemClass.FUSION_SHOVEL);
        handheldItem(AdvancedValuables_ItemClass.FUSION_HOE);
        handheldItem(AdvancedValuables_ItemClass.FUSION_SWORD);

        handheldItem(AdvancedValuables_ItemClass.RUBY_PICKAXE);
        handheldItem(AdvancedValuables_ItemClass.RUBY_AXE);
        handheldItem(AdvancedValuables_ItemClass.RUBY_SHOVEL);
        handheldItem(AdvancedValuables_ItemClass.RUBY_HOE);
        handheldItem(AdvancedValuables_ItemClass.RUBY_SWORD);
    }

    private ItemModelBuilder handheldItem(DeferredItem<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID,"item/" + item.getId().getPath()));
    }
}
