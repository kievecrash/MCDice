package com.kievecrash.mcdice.init;


import com.kievecrash.mcdice.block.BlockSixSidedDice;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static final BlockSixSidedDice sixSidedDice = new BlockSixSidedDice();

    public static void init(){
        GameRegistry.registerBlock(sixSidedDice, "blockSixSidedDice");
    }
}
