package net.doctorocclusion.deadmen.blocks;

import net.doctorocclusion.deadmen.Deadmen;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Sam Sartor on 6/22/2016.
 */
public class DeadmenBlocks {
	public static Material FOGDUST_MATERIAL = new Material(MapColor.BLUE);

	public static Block FOGDUST_BLOCK;

	public static void init() {
		FOGDUST_BLOCK = registerBlock(new BlockFalling(FOGDUST_MATERIAL) {
			@Override
			public SoundType getSoundType() {
				return SoundType.SAND;
			}
		}, "fogdust_block", CreativeTabs.BUILDING_BLOCKS);
		FOGDUST_BLOCK.setHardness(0.1F);
	}

	public static <T extends Block> T registerBlock(T block, String name) {
		return registerBlock(block, name, ItemBlock.class, null);
	}

	public static <T extends Block> T registerBlock(T block, String name, CreativeTabs tab) {
		return registerBlock(block, name, ItemBlock.class, tab);
	}

	public static <T extends Block> T registerBlock(T block, String name,Class<? extends Item> itemClass) {
		return registerBlock(block, name, itemClass, null);
	}

	public static <T extends Block> T registerBlock(T block, String name, Class<? extends Item> itemClass, CreativeTabs tab)
	{
		ResourceLocation loc = new ResourceLocation(Deadmen.ID, name);
		block.setUnlocalizedName(name);
		if (tab != null) block.setCreativeTab(tab);

		GameRegistry.register(block, loc);

		if (itemClass != null) {
			try {
				Item item = itemClass.getConstructor(Block.class).newInstance(block);
				GameRegistry.register(item, loc);
				Deadmen.proxy.registerItemSimple(item, loc);
			} catch (Exception e) {
				throw new RuntimeException("Could not register item for block " + name);
			}
		}

		return block;
	}
}
