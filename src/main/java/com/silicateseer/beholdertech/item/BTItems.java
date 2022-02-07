package com.silicateseer.beholdertech.item;

import com.silicateseer.beholdertech.BeholderTech;
import com.silicateseer.beholdertech.block.BTBlocks;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BTItems {

    //Base Seeds
    public static final Item METAMORPHIC_WHEAT_SEEDS = registerItem("metamorphic_wheat_seeds",
            new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
    public static final Item METAMORPHIC_BEETROOT_SEEDS = registerItem("metamorphic_beetroot_seeds",
            new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
    //Metal Seeds
    public static final Item GOLDENDROP_SEEDS = registerItem("goldendrop_seeds",
            new AliasedBlockItem(BTBlocks.GOLDENDROP, new Item.Settings().group(ItemGroup.MATERIALS)));
    public static final Item FERREL_SEEDS = registerItem("ferrel_seeds",
            new AliasedBlockItem(BTBlocks.FERREL, new Item.Settings().group(ItemGroup.MATERIALS)));
    public static final Item GOLD_OREROOT_SEEDS = registerItem("gold_oreroot_seeds",
            new AliasedBlockItem(BTBlocks.GOLD_OREROOT, new Item.Settings().group(ItemGroup.MATERIALS)));
    public static final Item IRON_OREROOT_SEEDS = registerItem("iron_oreroot_seeds",
            new AliasedBlockItem(BTBlocks.IRON_OREROOT, new Item.Settings().group(ItemGroup.MATERIALS)));
    public static final Item COPPER_OREROOT_SEEDS = registerItem("copper_oreroot_seeds",
            new AliasedBlockItem(BTBlocks.COPPER_OREROOT, new Item.Settings().group(ItemGroup.MATERIALS)));

    public static final Item GOLDENDROP_HAY = registerItem("goldendrop",
            new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
    public static final Item FERREL_HAY = registerItem("ferrel",
            new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
    //Mineral Seeds (Redstone, Lapis, Quartz, Amethyst, Glowstone)
    //Gem Seeds (Diamond, Emerald)
    //Drop Seeds (Ender Pearls, Blaze Powder, Prismarine Shards & Crystals)

    //Alloys
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot",
            new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
    public static final Item SILVER_INGOT = registerItem("silver_ingot",
            new Item(new Item.Settings().group(ItemGroup.MATERIALS)));

    //Tools & Armor
    //Bronze
    public static final Item BRONZE_SWORD = registerItem("bronze_sword",
            new SwordItem(BTToolMaterials.BRONZE, 3, -2.4f,
                    new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item BRONZE_SHOVEL = registerItem("bronze_shovel",
            new ShovelItem(BTToolMaterials.BRONZE, 1.5f, -3.0f,
                    new Item.Settings().group(ItemGroup.TOOLS)));
    public static final Item BRONZE_PICKAXE = registerItem("bronze_pickaxe",
            new BTPickaxeItem(BTToolMaterials.BRONZE, 1, -2.8f,
                    new Item.Settings().group(ItemGroup.TOOLS)));
    public static final Item BRONZE_AXE = registerItem("bronze_axe",
            new BTAxeItem(BTToolMaterials.BRONZE, 7.0f, -3.1f,
                    new Item.Settings().group(ItemGroup.TOOLS)));
    public static final Item BRONZE_HOE = registerItem("bronze_hoe",
            new BTHoeItem(BTToolMaterials.BRONZE, -1, -2.0f,
                    new Item.Settings().group(ItemGroup.TOOLS)));
    //Silver
    public static final Item SILVER_SWORD = registerItem("silver_sword",
            new SwordItem(BTToolMaterials.SILVER, 3, -2.4f,
                    new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item SILVER_SHOVEL = registerItem("silver_shovel",
            new ShovelItem(BTToolMaterials.SILVER, 1.5f, -3.0f,
                    new Item.Settings().group(ItemGroup.TOOLS)));
    public static final Item SILVER_PICKAXE = registerItem("silver_pickaxe",
            new BTPickaxeItem(BTToolMaterials.SILVER, 1, -2.8f,
                    new Item.Settings().group(ItemGroup.TOOLS)));
    public static final Item SILVER_AXE = registerItem("silver_axe",
            new BTAxeItem(BTToolMaterials.SILVER, 6.0f, -3.1f,
                    new Item.Settings().group(ItemGroup.TOOLS)));
    public static final Item SILVER_HOE = registerItem("silver_hoe",
            new BTHoeItem(BTToolMaterials.SILVER, -1, -2.0f,
                    new Item.Settings().group(ItemGroup.TOOLS)));
    //Quartz
    public static final Item QUARTZ_SWORD = registerItem("bronze_sword",
            new SwordItem(BTToolMaterials.QUARTZ, 3, -2.4f,
                    new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item QUARTZ_SHOVEL = registerItem("bronze_shovel",
            new ShovelItem(BTToolMaterials.QUARTZ, 1.5f, -3.0f,
                    new Item.Settings().group(ItemGroup.TOOLS)));
    public static final Item QUARTZ_PICKAXE = registerItem("bronze_pickaxe",
            new BTPickaxeItem(BTToolMaterials.QUARTZ, 1, -2.8f,
                    new Item.Settings().group(ItemGroup.TOOLS)));
    public static final Item QUARTZ_AXE = registerItem("bronze_axe",
            new BTAxeItem(BTToolMaterials.QUARTZ, 6.0f, -3.1f,
                    new Item.Settings().group(ItemGroup.TOOLS)));
    public static final Item QUARTZ_HOE = registerItem("bronze_hoe",
            new BTHoeItem(BTToolMaterials.QUARTZ, -1, -2.0f,
                    new Item.Settings().group(ItemGroup.TOOLS)));
    //Emerald
    public static final Item EMERALD_SWORD = registerItem("bronze_sword",
            new SwordItem(BTToolMaterials.EMERALD, 3, -2.4f,
                    new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item EMERALD_SHOVEL = registerItem("bronze_shovel",
            new ShovelItem(BTToolMaterials.EMERALD, 1.5f, -3.0f,
                    new Item.Settings().group(ItemGroup.TOOLS)));
    public static final Item EMERALD_PICKAXE = registerItem("bronze_pickaxe",
            new BTPickaxeItem(BTToolMaterials.EMERALD, 1, -2.8f,
                    new Item.Settings().group(ItemGroup.TOOLS)));
    public static final Item EMERALD_AXE = registerItem("bronze_axe",
            new BTAxeItem(BTToolMaterials.EMERALD, 5.0f, -3.0f,
                    new Item.Settings().group(ItemGroup.TOOLS)));
    public static final Item EMERALD_HOE = registerItem("bronze_hoe",
            new BTHoeItem(BTToolMaterials.EMERALD, -3, 0.0f,
                    new Item.Settings().group(ItemGroup.TOOLS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BeholderTech.MODID, name), item);
    }

    public static void registerBTItems() {
        BeholderTech.LOGGER.info("Registering BeholderTech Items");
    }
}
