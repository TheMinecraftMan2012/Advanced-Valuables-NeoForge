package net.theminecraftman.advancedvaluables.AV_CMT;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.theminecraftman.advancedvaluables.AV_Templates.AdvancedValuables_BlockClass;
import net.theminecraftman.advancedvaluables.AV_Templates.AdvancedValuables_ItemClass;
import net.theminecraftman.advancedvaluables.AdvancedValuables;

public class AdvancedValuables_CreativeModeTabs
{
    public static final DeferredRegister<CreativeModeTab> AV_REGISTER_CMT = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AdvancedValuables.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> AV_VALUABLE_TAB = AV_REGISTER_CMT.register("valuables", () -> CreativeModeTab.builder()
            .title(Component.translatable("creativetab.advancedvaluables.valuables"))
            .icon(() -> new ItemStack(AdvancedValuables_ItemClass.FUSION_GEM.get()))
            .displayItems((params, output) -> {
                // -- Solid Items -- //
                output.accept(AdvancedValuables_ItemClass.BLUE_SAPPHIRE.get());
                output.accept(AdvancedValuables_ItemClass.RED_SAPPHIRE.get());
                output.accept(AdvancedValuables_ItemClass.GREEN_SAPPHIRE.get());
                output.accept(AdvancedValuables_ItemClass.RED_GARNET.get());
                output.accept(AdvancedValuables_ItemClass.BLUE_GARNET.get());
                output.accept(AdvancedValuables_ItemClass.PINK_GARNET.get());
                output.accept(AdvancedValuables_ItemClass.YELLOW_GARNET.get());
                output.accept(AdvancedValuables_ItemClass.FUSION_GEM.get());
                output.accept(AdvancedValuables_ItemClass.RUBY.get());

                // -- Raw Items -- //
                output.accept(AdvancedValuables_ItemClass.BLUE_RAW_SAPPHIRE.get());
                output.accept(AdvancedValuables_ItemClass.RED_RAW_SAPPHIRE.get());
                output.accept(AdvancedValuables_ItemClass.GREEN_RAW_SAPPHIRE.get());
                output.accept(AdvancedValuables_ItemClass.RED_RAW_GARNET.get());
                output.accept(AdvancedValuables_ItemClass.BLUE_RAW_GARNET.get());
                output.accept(AdvancedValuables_ItemClass.PINK_RAW_GARNET.get());
                output.accept(AdvancedValuables_ItemClass.YELLOW_RAW_GARNET.get());
                output.accept(AdvancedValuables_ItemClass.RAW_FUSION_GEM.get());
                output.accept(AdvancedValuables_ItemClass.RAW_RUBY.get());

                // -- Solid Blocks -- //
                output.accept(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK.get());
                output.accept(AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK.get());
                output.accept(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK.get());
                output.accept(AdvancedValuables_BlockClass.RED_GARNET_BLOCK.get());
                output.accept(AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK.get());
                output.accept(AdvancedValuables_BlockClass.PINK_GARNET_BLOCK.get());
                output.accept(AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK.get());
                output.accept(AdvancedValuables_BlockClass.FUSION_BLOCK.get());
                output.accept(AdvancedValuables_BlockClass.RUBY_BLOCK.get());

                // -- Raw Blocks -- //
                output.accept(AdvancedValuables_BlockClass.BLUE_RAW_SAPPHIRE_BLOCK.get());
                output.accept(AdvancedValuables_BlockClass.RED_RAW_SAPPHIRE_BLOCK.get());
                output.accept(AdvancedValuables_BlockClass.GREEN_RAW_SAPPHIRE_BLOCK.get());
                output.accept(AdvancedValuables_BlockClass.RED_RAW_GARNET_BLOCK.get());
                output.accept(AdvancedValuables_BlockClass.BLUE_RAW_GARNET_BLOCK.get());
                output.accept(AdvancedValuables_BlockClass.PINK_RAW_GARNET_BLOCK.get());
                output.accept(AdvancedValuables_BlockClass.YELLOW_RAW_GARNET_BLOCK.get());
                output.accept(AdvancedValuables_BlockClass.RAW_FUSION_BLOCK.get());
                output.accept(AdvancedValuables_BlockClass.RAW_RUBY_BLOCK.get());
            })
            .build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> AV_VALUABLE_ORES_TAB = AV_REGISTER_CMT.register("valuable_ores", () -> CreativeModeTab.builder()
            .withTabsBefore(ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "valuables"))
            .title(Component.translatable("creativetab.advancedvaluables.valuable_ores"))
            .icon(() -> new ItemStack(AdvancedValuables_BlockClass.FUSION_ORE.get()))
            .displayItems((params, output) -> {
                output.accept(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_ORE);
                output.accept(AdvancedValuables_BlockClass.RED_SAPPHIRE_ORE);
                output.accept(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_ORE);
                output.accept(AdvancedValuables_BlockClass.RED_GARNET_ORE);
                output.accept(AdvancedValuables_BlockClass.BLUE_GARNET_ORE);
                output.accept(AdvancedValuables_BlockClass.PINK_GARNET_ORE);
                output.accept(AdvancedValuables_BlockClass.YELLOW_GARNET_ORE);
                output.accept(AdvancedValuables_BlockClass.FUSION_ORE);
                output.accept(AdvancedValuables_BlockClass.RUBY_ORE);

                output.accept(AdvancedValuables_BlockClass.DEEPSLATE_BLUE_SAPPHIRE_ORE);
                output.accept(AdvancedValuables_BlockClass.DEEPSLATE_RED_SAPPHIRE_ORE);
                output.accept(AdvancedValuables_BlockClass.DEEPSLATE_GREEN_SAPPHIRE_ORE);
                output.accept(AdvancedValuables_BlockClass.DEEPSLATE_RED_GARNET_ORE);
                output.accept(AdvancedValuables_BlockClass.DEEPSLATE_BLUE_GARNET_ORE);
                output.accept(AdvancedValuables_BlockClass.DEEPSLATE_PINK_GARNET_ORE);
                output.accept(AdvancedValuables_BlockClass.DEEPSLATE_YELLOW_GARNET_ORE);
                output.accept(AdvancedValuables_BlockClass.DEEPSLATE_FUSION_ORE);
                output.accept(AdvancedValuables_BlockClass.DEEPSLATE_RUBY_ORE);
            })
            .build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> AV_TOOLS_ARMOR = AV_REGISTER_CMT.register("tools_armor", () -> CreativeModeTab.builder()
            .withTabsBefore(ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "valuable_ores"))
            .title(Component.translatable("creativetab.advancedvaluables.tools_armor"))
            .icon(() -> new ItemStack(AdvancedValuables_ItemClass.FUSION_PICKAXE.get()))
            .displayItems((params, output) -> {
                output.accept(AdvancedValuables_ItemClass.RED_SAPPHIRE_PICKAXE);
                output.accept(AdvancedValuables_ItemClass.RED_SAPPHIRE_AXE);
                output.accept(AdvancedValuables_ItemClass.RED_SAPPHIRE_SHOVEL);
                output.accept(AdvancedValuables_ItemClass.RED_SAPPHIRE_HOE);
                output.accept(AdvancedValuables_ItemClass.RED_SAPPHIRE_SWORD);

                output.accept(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_PICKAXE);
                output.accept(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_AXE);
                output.accept(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_SHOVEL);
                output.accept(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_HOE);
                output.accept(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_SWORD);

                output.accept(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_PICKAXE);
                output.accept(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_AXE);
                output.accept(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_SHOVEL);
                output.accept(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_HOE);
                output.accept(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_SWORD);

                output.accept(AdvancedValuables_ItemClass.RED_GARNET_PICKAXE);
                output.accept(AdvancedValuables_ItemClass.RED_GARNET_AXE);
                output.accept(AdvancedValuables_ItemClass.RED_GARNET_SHOVEL);
                output.accept(AdvancedValuables_ItemClass.RED_GARNET_HOE);
                output.accept(AdvancedValuables_ItemClass.RED_GARNET_SWORD);

                output.accept(AdvancedValuables_ItemClass.BLUE_GARNET_PICKAXE);
                output.accept(AdvancedValuables_ItemClass.BLUE_GARNET_AXE);
                output.accept(AdvancedValuables_ItemClass.BLUE_GARNET_SHOVEL);
                output.accept(AdvancedValuables_ItemClass.BLUE_GARNET_HOE);
                output.accept(AdvancedValuables_ItemClass.BLUE_GARNET_SWORD);

                output.accept(AdvancedValuables_ItemClass.PINK_GARNET_PICKAXE);
                output.accept(AdvancedValuables_ItemClass.PINK_GARNET_AXE);
                output.accept(AdvancedValuables_ItemClass.PINK_GARNET_SHOVEL);
                output.accept(AdvancedValuables_ItemClass.PINK_GARNET_HOE);
                output.accept(AdvancedValuables_ItemClass.PINK_GARNET_SWORD);

                output.accept(AdvancedValuables_ItemClass.YELLOW_GARNET_PICKAXE);
                output.accept(AdvancedValuables_ItemClass.YELLOW_GARNET_AXE);
                output.accept(AdvancedValuables_ItemClass.YELLOW_GARNET_SHOVEL);
                output.accept(AdvancedValuables_ItemClass.YELLOW_GARNET_HOE);
                output.accept(AdvancedValuables_ItemClass.YELLOW_GARNET_SWORD);

                output.accept(AdvancedValuables_ItemClass.FUSION_PICKAXE);
                output.accept(AdvancedValuables_ItemClass.FUSION_AXE);
                output.accept(AdvancedValuables_ItemClass.FUSION_SHOVEL);
                output.accept(AdvancedValuables_ItemClass.FUSION_HOE);
                output.accept(AdvancedValuables_ItemClass.FUSION_SWORD);

                output.accept(AdvancedValuables_ItemClass.RUBY_PICKAXE);
                output.accept(AdvancedValuables_ItemClass.RUBY_AXE);
                output.accept(AdvancedValuables_ItemClass.RUBY_SHOVEL);
                output.accept(AdvancedValuables_ItemClass.RUBY_HOE);
                output.accept(AdvancedValuables_ItemClass.RUBY_SWORD);

                output.accept(AdvancedValuables_ItemClass.RED_SAPPHIRE_HELMET.get());
                output.accept(AdvancedValuables_ItemClass.RED_SAPPHIRE_CHESTPLATE.get());
                output.accept(AdvancedValuables_ItemClass.RED_SAPPHIRE_LEGGINGS.get());
                output.accept(AdvancedValuables_ItemClass.RED_SAPPHIRE_BOOTS.get());

                output.accept(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_HELMET.get());
                output.accept(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_CHESTPLATE.get());
                output.accept(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_LEGGINGS.get());
                output.accept(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_BOOTS.get());

                output.accept(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_HELMET.get());
                output.accept(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_CHESTPLATE.get());
                output.accept(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_LEGGINGS.get());
                output.accept(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_BOOTS.get());

                output.accept(AdvancedValuables_ItemClass.RED_GARNET_HELMET.get());
                output.accept(AdvancedValuables_ItemClass.RED_GARNET_CHESTPLATE.get());
                output.accept(AdvancedValuables_ItemClass.RED_GARNET_LEGGINGS.get());
                output.accept(AdvancedValuables_ItemClass.RED_GARNET_BOOTS.get());

                output.accept(AdvancedValuables_ItemClass.BLUE_GARNET_HELMET.get());
                output.accept(AdvancedValuables_ItemClass.BLUE_GARNET_CHESTPLATE.get());
                output.accept(AdvancedValuables_ItemClass.BLUE_GARNET_LEGGINGS.get());
                output.accept(AdvancedValuables_ItemClass.BLUE_GARNET_BOOTS.get());

                output.accept(AdvancedValuables_ItemClass.PINK_GARNET_HELMET.get());
                output.accept(AdvancedValuables_ItemClass.PINK_GARNET_CHESTPLATE.get());
                output.accept(AdvancedValuables_ItemClass.PINK_GARNET_LEGGINGS.get());
                output.accept(AdvancedValuables_ItemClass.PINK_GARNET_BOOTS.get());

                output.accept(AdvancedValuables_ItemClass.YELLOW_GARNET_HELMET.get());
                output.accept(AdvancedValuables_ItemClass.YELLOW_GARNET_CHESTPLATE.get());
                output.accept(AdvancedValuables_ItemClass.YELLOW_GARNET_LEGGINGS.get());
                output.accept(AdvancedValuables_ItemClass.YELLOW_GARNET_BOOTS.get());

                output.accept(AdvancedValuables_ItemClass.FUSION_HELMET.get());
                output.accept(AdvancedValuables_ItemClass.FUSION_CHESTPLATE.get());
                output.accept(AdvancedValuables_ItemClass.FUSION_LEGGINGS.get());
                output.accept(AdvancedValuables_ItemClass.FUSION_BOOTS.get());

                output.accept(AdvancedValuables_ItemClass.RUBY_HELMET.get());
                output.accept(AdvancedValuables_ItemClass.RUBY_CHESTPLATE.get());
                output.accept(AdvancedValuables_ItemClass.RUBY_LEGGINGS.get());
                output.accept(AdvancedValuables_ItemClass.RUBY_BOOTS.get());
            })
            .build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> AV_FOODS_TAB = AV_REGISTER_CMT.register("foods", () -> CreativeModeTab.builder()
            .withTabsBefore(ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "tools_armor"))
            .icon(() -> new ItemStack(AdvancedValuables_ItemClass.FUSION_APPLE.get()))
            .title(Component.translatable("creativetab.advancedvaluables.foods"))
            .displayItems((params, output) -> {
                output.accept(AdvancedValuables_ItemClass.RED_SAPPHIRE_APPLE);
                output.accept(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_APPLE);
                output.accept(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_APPLE);

                output.accept(AdvancedValuables_ItemClass.RED_GARNET_APPLE);
                output.accept(AdvancedValuables_ItemClass.BLUE_GARNET_APPLE);
                output.accept(AdvancedValuables_ItemClass.PINK_GARNET_APPLE);
                output.accept(AdvancedValuables_ItemClass.YELLOW_GARNET_APPLE);

                output.accept(AdvancedValuables_ItemClass.FUSION_APPLE);
                output.accept(AdvancedValuables_ItemClass.RUBY_APPLE);
            })
            .build());

    public static void register(IEventBus eventBus)
    {
        AV_REGISTER_CMT.register(eventBus);
    }
}
