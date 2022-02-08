package com.silicateseer.beholdertech.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

public enum BTArmorMaterials implements ArmorMaterial {

    BRONZE("bronze", 12, new int[]{2,4,5,2},10,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f,
            () -> Ingredient.ofItems(BTItems.BRONZE_INGOT)),
    QUARTZ("quartz", 12, new int[]{2,5,5,2},12,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f,
            () -> Ingredient.ofItems(Items.QUARTZ)),
    SILVER("silver", 10, new int[]{1,4,5,2},17,
            SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0f, 0.0f,
            () -> Ingredient.ofItems(BTItems.SILVER_INGOT)),
    EMERALD("emerald", 22, new int[]{2,5,6,2},20,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0f, 0.0f,
            () -> Ingredient.ofItems(Items.EMERALD));

    private static final int[] BASE_DURABILITY;
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredientSupplier;

    BTArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = repairIngredientSupplier;
    }

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    static {
        BASE_DURABILITY = new int[]{13, 15, 16, 11};
    }
}
