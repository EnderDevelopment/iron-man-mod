package com.daozheng2026.ironmanmod;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public
class IronManItems {
    public static final ArmorMaterial IRON_MAN_ARMOR_MATERIAL = new IronManArmorMaterial();

    public static final Item IRON_MAN_HELMET = new ArmorItem(IRON_MAN_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(IronManMod.IRON_MAN_GROUP));
    public static final Item IRON_MAN_CHESTPLATE = new ArmorItem(IRON_MAN_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(IronManMod.IRON_MAN_GROUP));
    public static final Item IRON_MAN_LEGGINGS = new ArmorItem(IRON_MAN_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(IronManMod.IRON_MAN_GROUP));
    public static final Item IRON_MAN_BOOTS = new ArmorItem(IRON_MAN_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(IronManMod.IRON_MAN_GROUP));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(IronManMod.MOD_ID, "iron_man_helmet"), IRON_MAN_HELMET);
        Registry.register(Registry.ITEM, new Identifier(IronManMod.MOD_ID, "iron_man_chestplate"), IRON_MAN_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(IronManMod.MOD_ID, "iron_man_leggings"), IRON_MAN_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(IronManMod.MOD_ID, "iron_man_boots"), IRON_MAN_BOOTS);
    }
}
