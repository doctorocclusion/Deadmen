package net.doctorocclusion.deadmen;

import net.doctorocclusion.deadmen.blocks.DeadmenBlocks;
import net.doctorocclusion.deadmen.items.DeadmenItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Sam Sartor on 6/22/2016.
 */
public class DeadmenCrafting {
	public static void init() {
		GameRegistry.addShapedRecipe(new ItemStack(DeadmenBlocks.FOGDUST_BLOCK), "dd", "dd", 'd', DeadmenItems.FOGDUST);
		GameRegistry.addShapelessRecipe(new ItemStack(DeadmenItems.FOGDUST, 4), new ItemStack(DeadmenBlocks.FOGDUST_BLOCK));
	}
}
