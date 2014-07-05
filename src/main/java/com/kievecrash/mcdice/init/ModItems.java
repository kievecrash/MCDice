package com.kievecrash.mcdice.init;

import com.kievecrash.mcdice.item.ItemDiceSix;
import com.kievecrash.mcdice.item.ItemMCDice;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

    public static final ItemMCDice sixSidedDice = new ItemDiceSix();

    public static void init(){
        GameRegistry.registerItem(sixSidedDice, "sixSidedDice");
    }
}
