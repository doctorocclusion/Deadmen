package net.doctorocclusion.deadmen;

import net.doctorocclusion.deadmen.events.EventHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Deadmen.ID, name = Deadmen.NAME, version = Deadmen.MAJOR + "." + Deadmen.MINOR + "." + Deadmen.BUILD)
public class Deadmen
{
	public static final String ID = "deadmen";
	public static final String NAME = "Deadmen";

	public static final int MAJOR = 1;
	public static final int MINOR = 0;
	public static final int BUILD = 0;

	@Mod.Instance("deadmen")
	public static Deadmen instance;

	@SidedProxy(modId = Deadmen.ID, clientSide = "net.doctorocclusion.deadmen.client.ClientProxy", serverSide = "net.doctorocclusion.deadmen.CommonProxy")
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		instance = this;
		MinecraftForge.EVENT_BUS.register(new EventHooks());
		proxy.preInit(event);
	}


	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init(event);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit(event);
	}

	@Mod.EventHandler
	public void serverStarting(FMLServerStartingEvent event)
	{
		proxy.serverStarting(event);
	}
}
