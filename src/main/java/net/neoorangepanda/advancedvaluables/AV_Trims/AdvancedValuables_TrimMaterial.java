package net.neoorangepanda.advancedvaluables.AV_Trims;

import net.minecraft.util.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.equipment.trim.MaterialAssetGroup;
import net.minecraft.world.item.equipment.trim.TrimMaterial;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;

public class AdvancedValuables_TrimMaterial
{
    public static final ResourceKey<TrimMaterial> RED_SAPPHIRE = ResourceKey.create(Registries.TRIM_MATERIAL, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "red_sapphire"));
    public static final ResourceKey<TrimMaterial> BLUE_SAPPHIRE = ResourceKey.create(Registries.TRIM_MATERIAL, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "blue_sapphire"));
    public static final ResourceKey<TrimMaterial> GREEN_SAPPHIRE = ResourceKey.create(Registries.TRIM_MATERIAL, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "green_sapphire"));

    public static final ResourceKey<TrimMaterial> RED_GARNET = ResourceKey.create(Registries.TRIM_MATERIAL, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "red_garnet"));
    public static final ResourceKey<TrimMaterial> BLUE_GARNET = ResourceKey.create(Registries.TRIM_MATERIAL, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "blue_garnet"));
    public static final ResourceKey<TrimMaterial> PINK_GARNET = ResourceKey.create(Registries.TRIM_MATERIAL, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "pink_garnet"));
    public static final ResourceKey<TrimMaterial> YELLOW_GARNET = ResourceKey.create(Registries.TRIM_MATERIAL, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "yellow_garnet"));

    public static final ResourceKey<TrimMaterial> FUSION_GEM = ResourceKey.create(Registries.TRIM_MATERIAL, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "fusion_gem"));
    public static final ResourceKey<TrimMaterial> RUBY = ResourceKey.create(Registries.TRIM_MATERIAL, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "ruby"));

    public static void bootstrap(BootstrapContext<TrimMaterial> context)
    {
        register(context, RED_SAPPHIRE, Style.EMPTY.withColor(TextColor.parseColor("#031cfc").getOrThrow()), "red_sapphire");
        register(context, BLUE_SAPPHIRE, Style.EMPTY.withColor(TextColor.parseColor("#031cfc").getOrThrow()), "blue_sapphire");
        register(context, GREEN_SAPPHIRE, Style.EMPTY.withColor(TextColor.parseColor("#031cfc").getOrThrow()), "green_sapphire");

        register(context, RED_GARNET, Style.EMPTY.withColor(TextColor.parseColor("#031cfc").getOrThrow()), "red_garnet");
        register(context, BLUE_GARNET, Style.EMPTY.withColor(TextColor.parseColor("#031cfc").getOrThrow()), "blue_garnet");
        register(context, PINK_GARNET, Style.EMPTY.withColor(TextColor.parseColor("#031cfc").getOrThrow()), "pink_garnet");
        register(context, YELLOW_GARNET, Style.EMPTY.withColor(TextColor.parseColor("#031cfc").getOrThrow()), "yellow_garnet");

        register(context, FUSION_GEM, Style.EMPTY.withColor(TextColor.parseColor("#031cfc").getOrThrow()), "fusion_gem");
        register(context, RUBY, Style.EMPTY.withColor(TextColor.parseColor("#031cfc").getOrThrow()), "ruby");
    }

    private static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> trimKey, Style style, String group)
    {
        TrimMaterial trimMaterial = new TrimMaterial(MaterialAssetGroup.create(group),
                Component.translatable(Util.makeDescriptionId("trim_material", trimKey.identifier())).withStyle(style));
        context.register(trimKey, trimMaterial);
    }
}
