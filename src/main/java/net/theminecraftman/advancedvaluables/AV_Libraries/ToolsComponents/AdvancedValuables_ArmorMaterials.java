package net.theminecraftman.advancedvaluables.AV_Libraries.ToolsComponents;

import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.theminecraftman.advancedvaluables.AV_Registries.AdvancedValuables_ItemClass;
import net.theminecraftman.advancedvaluables.AdvancedValuables;

import java.util.EnumMap;
import java.util.List;

public class AdvancedValuables_ArmorMaterials
{
    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS = DeferredRegister.create(Registries.ARMOR_MATERIAL, AdvancedValuables.MOD_ID);

    public static final Holder<ArmorMaterial> RED_SAPPHIRE = ARMOR_MATERIALS.register("red_sapphire", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ARMOR_EQUIP_IRON, () -> Ingredient.of(AdvancedValuables_ItemClass.RED_SAPPHIRE.get()),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "red_sapphire"))), 0, 0
    ));

    public static final Holder<ArmorMaterial> BLUE_SAPPHIRE = ARMOR_MATERIALS.register("blue_sapphire", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ARMOR_EQUIP_IRON, () -> Ingredient.of(AdvancedValuables_ItemClass.BLUE_SAPPHIRE.get()),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "blue_sapphire"))), 0, 0
    ));

    public static final Holder<ArmorMaterial> GREEN_SAPPHIRE = ARMOR_MATERIALS.register("green_sapphire", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ARMOR_EQUIP_IRON, () -> Ingredient.of(AdvancedValuables_ItemClass.GREEN_SAPPHIRE.get()),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "green_sapphire"))), 0, 0
    ));

    public static final Holder<ArmorMaterial> RED_GARNET = ARMOR_MATERIALS.register("red_garnet", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ARMOR_EQUIP_IRON, () -> Ingredient.of(AdvancedValuables_ItemClass.RED_GARNET.get()),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "red_garnet"))), 0, 0
    ));

    public static final Holder<ArmorMaterial> BLUE_GARNET = ARMOR_MATERIALS.register("blue_garnet", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ARMOR_EQUIP_IRON, () -> Ingredient.of(AdvancedValuables_ItemClass.BLUE_GARNET.get()),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "blue_garnet"))), 0, 0
    ));

    public static final Holder<ArmorMaterial> PINK_GARNET = ARMOR_MATERIALS.register("pink_garnet", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ARMOR_EQUIP_IRON, () -> Ingredient.of(AdvancedValuables_ItemClass.PINK_GARNET.get()),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "pink_garnet"))), 0, 0
    ));

    public static final Holder<ArmorMaterial> YELLOW_GARNET = ARMOR_MATERIALS.register("yellow_garnet", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ARMOR_EQUIP_IRON, () -> Ingredient.of(AdvancedValuables_ItemClass.YELLOW_GARNET.get()),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "yellow_garnet"))), 0, 0
    ));

    public static final Holder<ArmorMaterial> FUSION_GEM = ARMOR_MATERIALS.register("fusion_gem", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 10);
                map.put(ArmorItem.Type.LEGGINGS, 10);
                map.put(ArmorItem.Type.CHESTPLATE, 10);
                map.put(ArmorItem.Type.HELMET, 10);
                map.put(ArmorItem.Type.BODY, 10);
            }), 20, SoundEvents.ARMOR_EQUIP_IRON, () -> Ingredient.of(AdvancedValuables_ItemClass.FUSION_GEM.get()),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "fusion_gem"))), 0, 0
    ));

    public static final Holder<ArmorMaterial> RUBY = ARMOR_MATERIALS.register("ruby", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ARMOR_EQUIP_IRON, () -> Ingredient.of(AdvancedValuables_ItemClass.RUBY.get()),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "ruby"))), 0, 0
    ));

    public static void register(IEventBus eventBus)
    {
        ARMOR_MATERIALS.register(eventBus);
    }
}
