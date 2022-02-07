package com.silicateseer.beholdertech.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum BTToolMaterials implements ToolMaterial {

    BRONZE(MiningLevels.STONE,190,4.0f,1.0f,11,
            () -> Ingredient.ofItems(BTItems.BRONZE_INGOT)),
    QUARTZ(MiningLevels.IRON,190,6.0f,1.0f,16,
            () -> Ingredient.ofItems(Items.QUARTZ)),
    SILVER(MiningLevels.IRON,100,6.0f,1.0f,18,
            () -> Ingredient.ofItems(BTItems.SILVER_INGOT)),
    EMERALD(MiningLevels.DIAMOND,846,10.0f,2.0f,20,
            () -> Ingredient.ofItems(Items.EMERALD));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    BTToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
