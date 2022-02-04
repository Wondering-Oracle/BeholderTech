package com.silicateseer.beholdertech.blocks;

import com.silicateseer.beholdertech.BeholderTech;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BTBlocks {

    public static final Block INFUSER = registerBlock("infusing_table", new Block(
            AbstractBlock.Settings.of(Material.METAL).requiresTool().strength(3.5f)), ItemGroup.MISC);
    public static final Block GOLDENDROP = registerBlockWithoutItem("goldendrop",
            new GoldendropBlock(AbstractBlock.Settings.of(Material.PLANT, MapColor.GOLD).noCollision().ticksRandomly().sounds(BlockSoundGroup.CROP)));
    public static final Block FERREL = registerBlockWithoutItem("ferrel",
            new FerrelBlock(AbstractBlock.Settings.of(Material.PLANT, MapColor.LIGHT_GRAY).noCollision().ticksRandomly().sounds(BlockSoundGroup.CROP)));

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItems(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(BeholderTech.MODID, name), block);
    }
    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(BeholderTech.MODID, name), block);
    }
    private static Item registerBlockItems(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(BeholderTech.MODID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerBTBlocks() {
        BeholderTech.LOGGER.info("Registering BeholderTech Blocks");
    }
}
