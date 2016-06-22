package net.doctorocclusion.deadmen.items;

import net.doctorocclusion.deadmen.Deadmen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Sam Sartor on 6/22/2016.
 */
public class DeadmenItems {
	public static Item FOGDUST;

	public static void init() {
		FOGDUST = registerItem(new Item(), "fogdust", CreativeTabs.MATERIALS);
	}

	public static <T extends Item> T registerItem(T item, String name)
	{
		return registerItem(item, name, null);
	}

	public static <T extends Item> T registerItem(T item, String name, CreativeTabs tab)
	{
		ResourceLocation loc = new ResourceLocation(Deadmen.ID, name);
		item.setUnlocalizedName(name);

		if (tab != null) item.setCreativeTab(tab);

		GameRegistry.register(item, loc);
		Deadmen.proxy.registerItemSimple(item, loc);

		return item;
	}
}
