package com.silicateseer.beholdertech.items;

import com.silicateseer.beholdertech.BeholderTech;
import com.silicateseer.beholdertech.blocks.BTBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BTItems {

    public static final Item GOLDENDROP_SEEDS = registerItem("goldendrop_seeds",
            new AliasedBlockItem(BTBlocks.GOLDENDROP, new Item.Settings().group(ItemGroup.MATERIALS)));
    public static final Item FERREL_SEEDS = registerItem("ferrel_seeds",
            new AliasedBlockItem(BTBlocks.FERREL, new Item.Settings().group(ItemGroup.MATERIALS)));

    //Generator Outputs
    /*public static final Item ENERGY_CRYSTAL = registerItem("placeholder",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    //Grinder Outputs
    public static final Item AMETHYST_DUST = registerItem("amethyst_dust",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item QUARTZ_DUST = registerItem("quartz_dust",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    //Crusher Outputs
    public static final Item DIAMOND_DUST = registerItem("diamond_dust",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item EMERALD_DUST = registerItem("emerald_dust",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));*/

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BeholderTech.MODID, name), item);
    }

    public static void registerBTItems() {
        BeholderTech.LOGGER.info("Registering BeholderTech Items");
    }
}
