package net.neoorangepanda.advancedvaluables.AV_DataGen;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class AdvancedValuables_TrimmedArmorModelProvider implements DataProvider
{

    private final PackOutput.PathProvider itemsPathProvider;
    private final PackOutput.PathProvider modelsPathProvider;
    private final String modid;

    private static final Map<String, String> SLOT_TRIM_PREFIX = Map.of(
            "helmet", "helmet_trim",
            "chestplate", "chestplate_trim",
            "leggings", "leggings_trim",
            "boots", "boots_trim"
    );

    private static final List<String> TRIM_MATERIALS = List.of(
            "quartz", "iron", "netherite", "redstone", "copper", "gold",
            "emerald", "diamond", "lapis", "amethyst", "resin",
            "ruby", "red_sapphire", "blue_sapphire", "green_sapphire",
            "red_garnet", "blue_garnet", "pink_garnet", "yellow_garnet", "fusion_gem"
    );

    private static final List<String> AV_TRIM_MATERIALS = List.of(
            "ruby", "red_sapphire", "blue_sapphire", "green_sapphire",
            "red_garnet", "blue_garnet", "pink_garnet", "yellow_garnet", "fusion_gem"
    );

    private static final List<String> GEM_ARMORS = List.of(
            "blue_garnet", "yellow_garnet", "red_sapphire", "blue_sapphire",
            "green_sapphire", "red_garnet", "pink_garnet", "fusion", "ruby"
    );

    public AdvancedValuables_TrimmedArmorModelProvider(PackOutput output)
    {
        this.modid = AdvancedValuables.MOD_ID;
        this.itemsPathProvider = output.createPathProvider(PackOutput.Target.RESOURCE_PACK, "items");
        this.modelsPathProvider = output.createPathProvider(PackOutput.Target.RESOURCE_PACK, "models");
    }

    @Override
    public CompletableFuture<?> run(CachedOutput cache)
    {
        var futures = new java.util.ArrayList<CompletableFuture<?>>();

        for (String gem : GEM_ARMORS)
        {
            for (String slot : SLOT_TRIM_PREFIX.keySet())
            {
                String pieceName = gem + "_" + slot;
                futures.add(writeTrimModels(cache, pieceName, slot));
                futures.add(writeItemSelect(cache, pieceName));
            }
        }

        return CompletableFuture.allOf(futures.toArray(CompletableFuture[]::new));
    }

    private CompletableFuture<?> writeTrimModels(CachedOutput cache, String pieceName, String slot)
    {
        var futures = new java.util.ArrayList<CompletableFuture<?>>();
        String trimPrefix = SLOT_TRIM_PREFIX.get(slot);

        for (String material : TRIM_MATERIALS)
        {
            JsonObject model = new JsonObject();
            model.addProperty("parent", "minecraft:item/generated");

            JsonObject textures = new JsonObject();
            textures.addProperty("layer0", modid + ":item/" + pieceName);
            textures.addProperty("layer1", "minecraft:trims/items/" + trimPrefix + "_" + material);
            model.add("textures", textures);

            Identifier modelId = Identifier.fromNamespaceAndPath(modid, "item/" + pieceName + "_" + material + "_trim");

            futures.add(DataProvider.saveStable(cache, model, modelsPathProvider.json(modelId)));
        }
        return CompletableFuture.allOf(futures.toArray(CompletableFuture[]::new));
    }

    private CompletableFuture<?> writeItemSelect(CachedOutput cache, String pieceName)
    {
        JsonObject root = new JsonObject();
        JsonObject select = new JsonObject();
        select.addProperty("type", "minecraft:select");
        select.addProperty("property", "minecraft:trim_material");

        JsonArray cases = new JsonArray();
        for (String material : TRIM_MATERIALS)
        {
            JsonObject caseObj = new JsonObject();
            JsonObject caseModel = new JsonObject();
            caseModel.addProperty("type", "minecraft:model");
            caseModel.addProperty("model", modid + ":item/" + pieceName + "_" + material + "_trim");
            caseObj.add("model", caseModel);

            if(AV_TRIM_MATERIALS.contains(material))
            {
                caseObj.addProperty("when", AdvancedValuables.MOD_ID + ":" + material);
            }
            else
            {
                caseObj.addProperty("when", "minecraft:" + material);
            }

            cases.add(caseObj);
        }
        select.add("cases", cases);

        JsonObject fallback = new JsonObject();
        fallback.addProperty("type", "minecraft:model");
        fallback.addProperty("model", modid + ":item/" + pieceName);
        select.add("fallback", fallback);

        root.add("model", select);

        Identifier itemId = Identifier.fromNamespaceAndPath(modid, pieceName);
        return DataProvider.saveStable(cache, root, itemsPathProvider.json(itemId));
    }

    @Override
    public String getName()
    {
        return "Trimmed Armor Models: " + modid;
    }
}
