package net.doctorocclusion.deadmen;

import net.doctorocclusion.deadmen.blocks.DeadmenBlocks;
import net.doctorocclusion.deadmen.entities.DeadmenEntities;
import net.doctorocclusion.deadmen.items.DeadmenItems;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class CommonProxy
{
	public void preInit(FMLPreInitializationEvent event) {
		DeadmenBlocks.init();
		DeadmenItems.init();
		DeadmenEntities.init();
		DeadmenCrafting.init();
	}

	public void init(FMLInitializationEvent event) {
		registerRenderers();
	}

	public void postInit(FMLPostInitializationEvent event) {
	}

	public void serverStarting(FMLServerStartingEvent event) {
	}

	public void registerItemSimple(Item item, ResourceLocation loc) {

	}

	public void registerRenderers() {
	}
}
