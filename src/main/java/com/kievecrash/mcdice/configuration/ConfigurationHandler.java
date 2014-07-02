package com.kievecrash.mcdice.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {
    public static void init(File configFile){
        //create the configuration object from the given configuration file
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;

        try{
            //load the configuration file
            configuration.load();

            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean(true);
        }
        catch (Exception e){
            //Log the exception
        }
        finally{
            //save the configuration file
            configuration.save();
        }

        System.out.println(configValue);
    }
}
