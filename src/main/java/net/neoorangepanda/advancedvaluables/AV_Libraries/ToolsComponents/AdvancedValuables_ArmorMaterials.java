package net.neoorangepanda.advancedvaluables.AV_Libraries.ToolsComponents;

import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Util;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;
import net.neoorangepanda.advancedvaluables.AV_Utils.AdvancedValuables_Tags;

import java.util.EnumMap;

public class AdvancedValuables_ArmorMaterials
{
    public static ResourceKey<EquipmentAsset> RED_SAPPHIRE_EQA = createArmorId("red_sapphire");
    public static ResourceKey<EquipmentAsset> BLUE_SAPPHIRE_EQA = createArmorId("blue_sapphire");
    public static ResourceKey<EquipmentAsset> GREEN_SAPPHIRE_EQA = createArmorId("green_sapphire");

    public static ResourceKey<EquipmentAsset> RED_GARNET_EQA = createArmorId("red_garnet");
    public static ResourceKey<EquipmentAsset> BLUE_GARNET_EQA = createArmorId("blue_garnet");
    public static ResourceKey<EquipmentAsset> PINK_GARNET_EQA = createArmorId("pink_garnet");
    public static ResourceKey<EquipmentAsset> YELLOW_GARNET_EQA = createArmorId("yellow_garnet");

    public static ResourceKey<EquipmentAsset> FUSION_GEM_EQA = createArmorId("fusion_gem");
    public static ResourceKey<EquipmentAsset> RUBY_EQA = createArmorId("ruby");

    public static final ArmorMaterial RED_SAPPHIRE = new ArmorMaterial(1200,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 2);
                attribute.put(ArmorType.LEGGINGS, 4);
                attribute.put(ArmorType.CHESTPLATE, 6);
                attribute.put(ArmorType.HELMET, 2);
                attribute.put(ArmorType.BODY, 4);
            }), 20, SoundEvents.ARMOR_EQUIP_GENERIC, 2f, 0, AdvancedValuables_Tags.Items.RED_SAPPHIRE_REPAIR, RED_SAPPHIRE_EQA);

    public static final ArmorMaterial BLUE_SAPPHIRE = new ArmorMaterial(1200,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 2);
                attribute.put(ArmorType.LEGGINGS, 4);
                attribute.put(ArmorType.CHESTPLATE, 6);
                attribute.put(ArmorType.HELMET, 2);
                attribute.put(ArmorType.BODY, 4);
            }), 20, SoundEvents.ARMOR_EQUIP_GENERIC, 2f, 0, AdvancedValuables_Tags.Items.BLUE_SAPPHIRE_REPAIR, BLUE_SAPPHIRE_EQA);

    public static final ArmorMaterial GREEN_SAPPHIRE = new ArmorMaterial(1200,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 2);
                attribute.put(ArmorType.LEGGINGS, 4);
                attribute.put(ArmorType.CHESTPLATE, 6);
                attribute.put(ArmorType.HELMET, 2);
                attribute.put(ArmorType.BODY, 4);
            }), 20, SoundEvents.ARMOR_EQUIP_GENERIC, 2f, 0, AdvancedValuables_Tags.Items.GREEN_SAPPHIRE_REPAIR, GREEN_SAPPHIRE_EQA);

    public static final ArmorMaterial RED_GARNET = new ArmorMaterial(1200,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 2);
                attribute.put(ArmorType.LEGGINGS, 4);
                attribute.put(ArmorType.CHESTPLATE, 6);
                attribute.put(ArmorType.HELMET, 2);
                attribute.put(ArmorType.BODY, 4);
            }), 20, SoundEvents.ARMOR_EQUIP_GENERIC, 4f, 0, AdvancedValuables_Tags.Items.RED_GARNET_REPAIR, RED_GARNET_EQA);

    public static final ArmorMaterial BLUE_GARNET = new ArmorMaterial(1200,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 2);
                attribute.put(ArmorType.LEGGINGS, 4);
                attribute.put(ArmorType.CHESTPLATE, 6);
                attribute.put(ArmorType.HELMET, 2);
                attribute.put(ArmorType.BODY, 4);
            }), 20, SoundEvents.ARMOR_EQUIP_GENERIC, 4f, 0, AdvancedValuables_Tags.Items.BLUE_GARNET_REPAIR, BLUE_GARNET_EQA);

    public static final ArmorMaterial PINK_GARNET = new ArmorMaterial(1200,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 2);
                attribute.put(ArmorType.LEGGINGS, 4);
                attribute.put(ArmorType.CHESTPLATE, 6);
                attribute.put(ArmorType.HELMET, 2);
                attribute.put(ArmorType.BODY, 4);
            }), 20, SoundEvents.ARMOR_EQUIP_GENERIC, 4f, 0, AdvancedValuables_Tags.Items.PINK_GARNET_REPAIR, PINK_GARNET_EQA);

    public static final ArmorMaterial YELLOW_GARNET = new ArmorMaterial(1200,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 2);
                attribute.put(ArmorType.LEGGINGS, 4);
                attribute.put(ArmorType.CHESTPLATE, 6);
                attribute.put(ArmorType.HELMET, 2);
                attribute.put(ArmorType.BODY, 4);
            }), 20, SoundEvents.ARMOR_EQUIP_GENERIC, 4f, 0, AdvancedValuables_Tags.Items.BLUE_GARNET_REPAIR, YELLOW_GARNET_EQA);

    public static final ArmorMaterial FUSION_GEM = new ArmorMaterial(1200,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 2);
                attribute.put(ArmorType.LEGGINGS, 4);
                attribute.put(ArmorType.CHESTPLATE, 6);
                attribute.put(ArmorType.HELMET, 2);
                attribute.put(ArmorType.BODY, 4);
            }), 20, SoundEvents.ARMOR_EQUIP_GENERIC, 10f, 0, AdvancedValuables_Tags.Items.FUSION_REPAIR, FUSION_GEM_EQA);

    public static final ArmorMaterial RUBY = new ArmorMaterial(1200,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 2);
                attribute.put(ArmorType.LEGGINGS, 4);
                attribute.put(ArmorType.CHESTPLATE, 6);
                attribute.put(ArmorType.HELMET, 2);
                attribute.put(ArmorType.BODY, 4);
            }), 20, SoundEvents.ARMOR_EQUIP_GENERIC, 7f, 0, AdvancedValuables_Tags.Items.RUBY_REPAIR, RUBY_EQA);

    private static ResourceKey<EquipmentAsset> createArmorId(String armorId)
    {
        return ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, armorId));
    }
}
