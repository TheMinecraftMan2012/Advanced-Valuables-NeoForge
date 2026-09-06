package net.neoorangepanda.advancedvaluables.AV_DataGen;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AdvancedValuables_VanillaArmorTrimOverrideProvider implements DataProvider
{

    private final PackOutput.PathProvider itemsPathProvider;
    private final PackOutput.PathProvider modelsPathProvider;
    private final String modId;

    private static final List<String> VANILLA_MATERIALS = List.of(
            "quartz", "iron", "gold", "diamond", "netherite",
            "redstone", "copper", "emerald", "lapis", "amethyst", "resin"
    );

    private static final List<String> AV_TRIM_MATERIALS = List.of(
            "ruby", "red_sapphire", "blue_sapphire", "green_sapphire",
            "red_garnet", "blue_garnet", "pink_garnet", "yellow_garnet", "fusion_gem"
    );

    private static final Set<String> TRIM_MATERIALS = Stream.concat(VANILLA_MATERIALS.stream(), AV_TRIM_MATERIALS.stream()).collect(Collectors.toCollection(LinkedHashSet::new));

    private static final Map<String, String> SLOT_TRIM_PREFIX = Map.of(
            "helmet", "helmet_trim",
            "chestplate", "chestplate_trim",
            "leggings", "leggings_trim",
            "boots", "boots_trim"
    );
    private static final List<String> VANILLA_ARMOR_BASES = List.of("chainmail", "iron", "golden", "diamond", "netherite");

    public AdvancedValuables_VanillaArmorTrimOverrideProvider(PackOutput output)
    {
        this.modId = AdvancedValuables.MOD_ID;
        this.itemsPathProvider = output.createPathProvider(PackOutput.Target.RESOURCE_PACK, "items");
        this.modelsPathProvider = output.createPathProvider(PackOutput.Target.RESOURCE_PACK, "models");
    }

    @Override
    public @NotNull CompletableFuture<?> run(@NotNull CachedOutput cache)
    {
        var futures = new java.util.ArrayList<CompletableFuture<?>>();
        for (String base : VANILLA_ARMOR_BASES)
        {
            for (var entry : SLOT_TRIM_PREFIX.entrySet())
            {
                String slot = entry.getKey();
                String trimPrefix = entry.getValue();
                String pieceName = base + "_" + slot;
                futures.add(writeCustomModels(cache, pieceName, trimPrefix));
                futures.add(writeVanillaItemOverride(cache, pieceName));
            }
        }
        return CompletableFuture.allOf(futures.toArray(CompletableFuture[]::new));
    }

    private CompletableFuture<?> writeCustomModels(CachedOutput cache, String pieceName, String trimPrefix)
    {
        var futures = new java.util.ArrayList<CompletableFuture<?>>();

        for (String material : TRIM_MATERIALS)
        {
            JsonObject model = new JsonObject();
            model.addProperty("parent", "minecraft:item/generated");
            JsonObject textures = new JsonObject();
            textures.addProperty("layer0", "minecraft:item/" + pieceName);
            textures.addProperty("layer1", "minecraft:trims/items/" + trimPrefix + "_" + material);
            model.add("textures", textures);
            Identifier modelId = Identifier.fromNamespaceAndPath(modId, "item/" + pieceName + "_" + material + "_trim");
            futures.add(DataProvider.saveStable(cache, model, modelsPathProvider.json(modelId)));
        }
        return CompletableFuture.allOf(futures.toArray(CompletableFuture[]::new));
    }

    private CompletableFuture<?> writeVanillaItemOverride(CachedOutput cache, String pieceName)
    {
        JsonObject root = new JsonObject();
        JsonObject select = new JsonObject();
        select.addProperty("type", "minecraft:select");
        select.addProperty("property", "minecraft:trim_material");
        JsonArray cases = new JsonArray();

        for (String material : AV_TRIM_MATERIALS)
        {
            cases.add(caseEntry(modId + ":item/" + pieceName + "_" + material + "_trim", modId + ":" + material));
        }

        for (String material : VANILLA_MATERIALS)
        {
            cases.add(caseEntry("minecraft:item/" + pieceName + "_" + material + "_trim", "minecraft:" + material));
        }

        select.add("cases", cases);
        JsonObject fallback = new JsonObject();
        fallback.addProperty("type", "minecraft:model");
        fallback.addProperty("model", "minecraft:item/" + pieceName);
        select.add("fallback", fallback);
        root.add("model", select);
        Identifier itemId = Identifier.fromNamespaceAndPath("minecraft", pieceName);
        return DataProvider.saveStable(cache, root, itemsPathProvider.json(itemId));
    }

    private JsonObject caseEntry(String modelRef, String when)
    {
        JsonObject caseObj = new JsonObject();
        JsonObject caseModel = new JsonObject();
        caseModel.addProperty("type", "minecraft:model");
        caseModel.addProperty("model", modelRef);
        caseObj.add("model", caseModel);
        caseObj.addProperty("when", when);
        return caseObj;
    }

    @Override
    public @NotNull String getName()
    {
        return "Vanilla Armor Trim Overrides";
    }
}