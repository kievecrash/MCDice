package com.kievecrash.mcdice;

import com.kievecrash.mcdice.handler.ConfigurationHandler;
import com.kievecrash.mcdice.init.ModBlocks;
import com.kievecrash.mcdice.init.ModItems;
import com.kievecrash.mcdice.proxy.IProxy;
import com.kievecrash.mcdice.reference.Reference;
import com.kievecrash.mcdice.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class MCDice{

    @Mod.Instance(Reference.MOD_ID)
    public static MCDice instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initialization Complete");

        ModItems.init();

        ModBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        LogHelper.info("Initialization Complete");

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        LogHelper.info("Post Initialization Complete");

    }
}