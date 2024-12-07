package net.theminecraftman.advancedvaluables.AV_Libraries.ToolsComponents;

import net.minecraft.Util;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.theminecraftman.advancedvaluables.AdvancedValuables;
import net.theminecraftman.advancedvaluables.util.AdvancedValuables_Tags;

import java.util.EnumMap;

public class AdvancedValuables_ArmorMaterials
{
    public static final ArmorMaterial RED_SAPPHIRE = new ArmorMaterial(1200,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 2);
                attribute.put(ArmorType.LEGGINGS, 4);
                attribute.put(ArmorType.CHESTPLATE, 6);
                attribute.put(ArmorType.HELMET, 2);
                attribute.put(ArmorType.BODY, 4);
            }), 20, SoundEvents.ARMOR_EQUIP_GENERIC, 0, 0,
            AdvancedValuables_Tags.Items.RED_SAPPHIRE_REPAIR,
            ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "red_sapphire")
    );

    public static final ArmorMaterial BLUE_SAPPHIRE = new ArmorMaterial(1200,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 2);
                attribute.put(ArmorType.LEGGINGS, 4);
                attribute.put(ArmorType.CHESTPLATE, 6);
                attribute.put(ArmorType.HELMET, 2);
                attribute.put(ArmorType.BODY, 4);
            }), 20, SoundEvents.ARMOR_EQUIP_GENERIC, 0, 0, AdvancedValuables_Tags.Items.BLUE_SAPPHIRE_REPAIR,
            ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "blue_sapphire")
    );

    public static final ArmorMaterial GREEN_SAPPHIRE = new ArmorMaterial(1200,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 2);
                attribute.put(ArmorType.LEGGINGS, 4);
                attribute.put(ArmorType.CHESTPLATE, 6);
                attribute.put(ArmorType.HELMET, 2);
                attribute.put(ArmorType.BODY, 4);
            }), 20, SoundEvents.ARMOR_EQUIP_GENERIC, 0, 0, AdvancedValuables_Tags.Items.GREEN_SAPPHIRE_REPAIR,
            ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "green_sapphire")
    );

    public static final ArmorMaterial RED_GARNET = new ArmorMaterial(1200,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 2);
                attribute.put(ArmorType.LEGGINGS, 4);
                attribute.put(ArmorType.CHESTPLATE, 6);
                attribute.put(ArmorType.HELMET, 2);
                attribute.put(ArmorType.BODY, 4);
            }), 20, SoundEvents.ARMOR_EQUIP_GENERIC, 0, 0, AdvancedValuables_Tags.Items.RED_GARNET_REPAIR,
            ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "red_garnet")
    );

    public static final ArmorMaterial BLUE_GARNET = new ArmorMaterial(1200,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 2);
                attribute.put(ArmorType.LEGGINGS, 4);
                attribute.put(ArmorType.CHESTPLATE, 6);
                attribute.put(ArmorType.HELMET, 2);
                attribute.put(ArmorType.BODY, 4);
            }), 20, SoundEvents.ARMOR_EQUIP_GENERIC, 0, 0, AdvancedValuables_Tags.Items.BLUE_GARNET_REPAIR,
            ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "blue_garnet")
    );

    public static final ArmorMaterial PINK_GARNET = new ArmorMaterial(1200,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 2);
                attribute.put(ArmorType.LEGGINGS, 4);
                attribute.put(ArmorType.CHESTPLATE, 6);
                attribute.put(ArmorType.HELMET, 2);
                attribute.put(ArmorType.BODY, 4);
            }), 20, SoundEvents.ARMOR_EQUIP_GENERIC, 0, 0, AdvancedValuables_Tags.Items.PINK_GARNET_REPAIR,
            ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "pink_garnet")
    );

    public static final ArmorMaterial YELLOW_GARNET = new ArmorMaterial(1200,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 2);
                attribute.put(ArmorType.LEGGINGS, 4);
                attribute.put(ArmorType.CHESTPLATE, 6);
                attribute.put(ArmorType.HELMET, 2);
                attribute.put(ArmorType.BODY, 4);
            }), 20, SoundEvents.ARMOR_EQUIP_GENERIC, 0, 0, AdvancedValuables_Tags.Items.BLUE_GARNET_REPAIR,
            ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "yellow_garnet")
    );

    public static final ArmorMaterial FUSION_GEM = new ArmorMaterial(1200,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 2);
                attribute.put(ArmorType.LEGGINGS, 4);
                attribute.put(ArmorType.CHESTPLATE, 6);
                attribute.put(ArmorType.HELMET, 2);
                attribute.put(ArmorType.BODY, 4);
            }), 20, SoundEvents.ARMOR_EQUIP_GENERIC, 0, 0, AdvancedValuables_Tags.Items.FUSION_REPAIR,
            ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "fusion_gem")
    );

    public static final ArmorMaterial RUBY = new ArmorMaterial(1200,
            Util.make(new EnumMap<>(ArmorType.class), attribute -> {
                attribute.put(ArmorType.BOOTS, 2);
                attribute.put(ArmorType.LEGGINGS, 4);
                attribute.put(ArmorType.CHESTPLATE, 6);
                attribute.put(ArmorType.HELMET, 2);
                attribute.put(ArmorType.BODY, 4);
            }), 20, SoundEvents.ARMOR_EQUIP_GENERIC, 0, 0, AdvancedValuables_Tags.Items.RUBY_REPAIR,
            ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "ruby")
    );
}
