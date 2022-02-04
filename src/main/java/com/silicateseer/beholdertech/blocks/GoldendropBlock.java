package com.silicateseer.beholdertech.blocks;

import com.silicateseer.beholdertech.items.BTItems;
import net.minecraft.block.*;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class GoldendropBlock extends OreCropBlock {

    public GoldendropBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(AGE, 0));
    }

    @Override
    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        return new ItemStack(BTItems.GOLDENDROP_SEEDS);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}
