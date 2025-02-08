
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.plantsandrocks.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.plantsandrocks.PlantsAndRocksMod;

public class PlantsAndRocksModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(PlantsAndRocksMod.MODID);
	public static final DeferredItem<Item> FAKE_RED_MUSHROOM = block(PlantsAndRocksModBlocks.FAKE_RED_MUSHROOM);
	public static final DeferredItem<Item> FAKE_BROWN_MUSHROOM = block(PlantsAndRocksModBlocks.FAKE_BROWN_MUSHROOM);
	public static final DeferredItem<Item> NATURAL_ROYAL_HONEY = block(PlantsAndRocksModBlocks.NATURAL_ROYAL_HONEY);
	public static final DeferredItem<Item> GENBLOCK_VINER = block(PlantsAndRocksModBlocks.GENBLOCK_VINER);
	public static final DeferredItem<Item> FAIRY_CENTER = block(PlantsAndRocksModBlocks.FAIRY_CENTER);
	public static final DeferredItem<Item> FAIRY_CENTER_2 = block(PlantsAndRocksModBlocks.FAIRY_CENTER_2);
	public static final DeferredItem<Item> DEACTIVATED_FAIRY_CENTER = block(PlantsAndRocksModBlocks.DEACTIVATED_FAIRY_CENTER);
	public static final DeferredItem<Item> VEGGIE_SPREADER = block(PlantsAndRocksModBlocks.VEGGIE_SPREADER);
	public static final DeferredItem<Item> GENBLOCK_STONER = block(PlantsAndRocksModBlocks.GENBLOCK_STONER);
	public static final DeferredItem<Item> GENBLOCK_GENERAL_DECORATOR = block(PlantsAndRocksModBlocks.GENBLOCK_GENERAL_DECORATOR);
	public static final DeferredItem<Item> ROYAL_HONEY_1 = block(PlantsAndRocksModBlocks.ROYAL_HONEY_1);
	public static final DeferredItem<Item> ROYAL_HONEY_2 = block(PlantsAndRocksModBlocks.ROYAL_HONEY_2);
	public static final DeferredItem<Item> ROYAL_HONEY_3 = block(PlantsAndRocksModBlocks.ROYAL_HONEY_3);
	public static final DeferredItem<Item> ROYAL_HONEY_4 = block(PlantsAndRocksModBlocks.ROYAL_HONEY_4);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
