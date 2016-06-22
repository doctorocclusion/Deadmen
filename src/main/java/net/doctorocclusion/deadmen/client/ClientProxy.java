package net.doctorocclusion.deadmen.client;

import net.doctorocclusion.deadmen.CommonProxy;
import net.doctorocclusion.deadmen.Deadmen;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerItemSimple(Item item, ResourceLocation loc) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Deadmen.ID + ":" + loc.getResourcePath(), "inventory"));
	}
}
