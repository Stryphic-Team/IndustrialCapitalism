package com.stryphic.industrialcapitalism;

import com.stryphic.industrialcapitalism.util.Reference;
import com.stryphic.stryphiccore.blocks.BlockGreen;
import com.stryphic.stryphiccore.entityproperties.CorePlayerCapability;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class IndustrialCapitalism
{

    public static Logger logger;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code

        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
