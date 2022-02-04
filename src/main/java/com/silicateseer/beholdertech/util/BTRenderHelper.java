package com.silicateseer.beholdertech.util;

import com.silicateseer.beholdertech.blocks.BTBlocks;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class BTRenderHelper {
    public static void setRenderLayers(){
        BlockRenderLayerMap.INSTANCE.putBlock(BTBlocks.GOLDENDROP, RenderLayer.getCutout());
    }
}
