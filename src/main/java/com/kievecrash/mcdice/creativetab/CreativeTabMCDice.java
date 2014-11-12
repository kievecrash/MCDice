package com.kievecrash.mcdice.creativetab;

import com.kievecrash.mcdice.init.ModBlocks;
import com.kievecrash.mcdice.init.ModItems;
import com.kievecrash.mcdice.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabMCDice {
    public static final CreativeTabs MCDICE_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.sixSidedDice;
        }
    };
}
