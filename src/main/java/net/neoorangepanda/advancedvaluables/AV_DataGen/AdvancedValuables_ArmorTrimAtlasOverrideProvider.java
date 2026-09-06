package net.neoorangepanda.advancedvaluables.AV_DataGen;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;
import org.jetbrains.annotations.NotNull;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class AdvancedValuables_ArmorTrimAtlasOverrideProvider implements DataProvider
{

    private final PackOutput.PathProvider atlasPathProvider;
    private final String modId;

    private static final List<String> CUSTOM_MATERIALS = List.of(
            "ruby", "red_sapphire", "blue_sapphire", "green_sapphire",
            "red_garnet", "blue_garnet", "pink_garnet", "yellow_garnet", "fusion_gem"
    );

    public AdvancedValuables_ArmorTrimAtlasOverrideProvider(PackOutput output)
    {
        this.modId = AdvancedValuables.MOD_ID;
        this.atlasPathProvider = output.createPathProvider(PackOutput.Target.RESOURCE_PACK, "atlases");
    }

    @Override
    public @NotNull CompletableFuture<?> run(@NotNull CachedOutput cache)
    {
        JsonObject armorTrimsAtlas = loadVanillaArmorTrimsAtlas();
        injectCustomTrimPermutations(armorTrimsAtlas);

        Identifier atlasId = Identifier.fromNamespaceAndPath("minecraft", "armor_trims");
        return DataProvider.saveStable(cache, armorTrimsAtlas, atlasPathProvider.json(atlasId));
    }

    private JsonObject loadVanillaArmorTrimsAtlas()
    {
        try (InputStream is = getClass().getClassLoader().getResourceAsStream("assets/minecraft/atlases/armor_trims.json"))
        {
            if (is == null)
            {
                throw new IllegalStateException(
                        "Could not find vanilla assets/minecraft/atlases/armor_trims.json on classpath. " +
                                "Make sure client resources are available to your datagen run.");
            }
            try (InputStreamReader reader = new InputStreamReader(is, StandardCharsets.UTF_8))
            {
                return JsonParser.parseReader(reader).getAsJsonObject();
            }
        } catch (Exception e)
        {
            throw new RuntimeException("Failed to read vanilla armor_trims.json atlas", e);
        }
    }

    private void injectCustomTrimPermutations(JsonObject atlas) {
        JsonArray sources = atlas.getAsJsonArray("sources");
        boolean patched = false;

        for (JsonElement el : sources)
        {
            JsonObject source = el.getAsJsonObject();

            String type = source.has("type") ? source.get("type").getAsString() : "";
            if (!type.contains("paletted_permutations")) continue;
            if (!source.has("textures") || !source.has("permutations")) continue;
            boolean isArmorTrimSource = false;
            for (JsonElement t : source.getAsJsonArray("textures"))
            {
                if (t.getAsString().contains("trims/entity/humanoid"))
                {
                    isArmorTrimSource = true;
                    break;
                }
            }
            if (!isArmorTrimSource) continue;

            JsonObject permutations = source.getAsJsonObject("permutations");
            for (String material : CUSTOM_MATERIALS)
            {
                permutations.addProperty(material, modId + ":trims/color_palettes/" + material);
            }
            patched = true;
        }

        if (!patched)
        {
            throw new IllegalStateException(
                    "Could not find the humanoid armor-trim paletted_permutations source in vanilla " +
                            "armor_trims.json — vanilla's atlas structure may have changed for this MC version.");
        }
    }

    @Override
    public @NotNull String getName()
    {
        return "Armor Trim Atlas Override (armor_trims.json)";
    }
}