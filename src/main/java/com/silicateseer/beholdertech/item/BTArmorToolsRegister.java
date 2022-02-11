package com.silicateseer.beholdertech.item;

import com.silicateseer.beholdertech.BeholderTech;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.lwjgl.system.CallbackI;

public class BTArmorToolsRegister {

    public static final Item[][] QUARTZ = {
            registerTools("quartz", BTToolMaterials.QUARTZ,
                    6.0f, -3.1f, -1, -2.0f),
            registerArmor("quartz", BTArmorMaterials.QUARTZ)
    };
    public static final Item[][] EMERALD = {
            registerTools("emerald", BTToolMaterials.EMERALD,
                    5.0f, -3.0f, -3, 0.0f),
            registerArmor("emerald", BTArmorMaterials.EMERALD)
    };
    public static final Item[][] BRONZE = {
            registerTools("bronze", BTToolMaterials.BRONZE,
                    7.0f, -3.1f, -1, -2.0f),
            registerArmor("bronze", BTArmorMaterials.BRONZE)
    };
    public static final Item[][] SILVER = {
            registerTools("silver", BTToolMaterials.SILVER,
                    6.0f, -3.1f, -1, -2.0f),
            registerArmor("silver", BTArmorMaterials.SILVER)
    };

    public static Item registerSword(String name, ToolMaterial material) {
        return Registry.register(Registry.ITEM, new Identifier(BeholderTech.MODID, name+"_sword"),
                new SwordItem(material, 3, -2.4f,
                        new Item.Settings().group(ItemGroup.COMBAT)));
    }
    public static Item registerShovel(String name, ToolMaterial material) {
        return Registry.register(Registry.ITEM, new Identifier(BeholderTech.MODID, name+"_shovel"),
                new ShovelItem(material, 1.5f, -3.0f,
                        new Item.Settings().group(ItemGroup.TOOLS)));
    }
    public static Item registerPickaxe(String name, ToolMaterial material) {
        return Registry.register(Registry.ITEM, new Identifier(BeholderTech.MODID, name+"_pickaxe"),
                new BTPickaxeItem(material, 1, -2.8f,
                        new Item.Settings().group(ItemGroup.TOOLS)));
    }
    public static Item registerAxe(String name, ToolMaterial material, Float dmg, Float spd) {
        return Registry.register(Registry.ITEM, new Identifier(BeholderTech.MODID, name+"_axe"),
                new BTAxeItem(material, dmg, spd,
                        new Item.Settings().group(ItemGroup.TOOLS)));
    }
    public static Item registerHoe(String name, ToolMaterial material, Integer dmg, Float spd) {
        return Registry.register(Registry.ITEM, new Identifier(BeholderTech.MODID, name+"_hoe"),
                new BTHoeItem(material, dmg, spd,
                        new Item.Settings().group(ItemGroup.TOOLS)));
    }
    public static Item registerHelmet(String name, ArmorMaterial material) {
        return Registry.register(Registry.ITEM, new Identifier(BeholderTech.MODID, name+"_helmet"),
                new ArmorItem(material, EquipmentSlot.HEAD,
                        new Item.Settings().group(ItemGroup.COMBAT)));
    }
    public static Item registerChestplate(String name, ArmorMaterial material) {
        return Registry.register(Registry.ITEM, new Identifier(BeholderTech.MODID, name+"_chestplate"),
                new ArmorItem(material, EquipmentSlot.CHEST,
                        new Item.Settings().group(ItemGroup.COMBAT)));
    }
    public static Item registerLeggings(String name, ArmorMaterial material) {
        return Registry.register(Registry.ITEM, new Identifier(BeholderTech.MODID, name+"_leggings"),
                new ArmorItem(material, EquipmentSlot.LEGS,
                        new Item.Settings().group(ItemGroup.COMBAT)));
    }
    public static Item registerBoots(String name, ArmorMaterial material) {
        return Registry.register(Registry.ITEM, new Identifier(BeholderTech.MODID, name+"_boots"),
                new ArmorItem(material, EquipmentSlot.FEET,
                        new Item.Settings().group(ItemGroup.COMBAT)));
    }

    public static Item[] registerTools
            (String name, ToolMaterial material, Float axeDamage, Float axeSpeed, Integer hoeDamage, Float hoeSpeed) {
        return new Item[]{
                registerSword(name, material),
                registerShovel(name, material),
                registerPickaxe(name, material),
                registerAxe(name, material, axeDamage, axeSpeed),
                registerHoe(name, material, hoeDamage, hoeSpeed)
        };
    }
    public static Item[] registerArmor(String name, ArmorMaterial material) {
        return new Item[]{
                registerHelmet(name, material),
                registerChestplate(name, material),
                registerLeggings(name, material),
                registerBoots(name, material)

        };
    }

    public static void registerBTATReg() {
        BeholderTech.LOGGER.info("Registering BeholderTech Tools and Armor");
    }
}
