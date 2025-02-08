
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.plantsandrocks.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.plantsandrocks.block.VeggieSpreaderBlock;
import net.mcreator.plantsandrocks.block.RoyalHoney4Block;
import net.mcreator.plantsandrocks.block.RoyalHoney3Block;
import net.mcreator.plantsandrocks.block.RoyalHoney2Block;
import net.mcreator.plantsandrocks.block.RoyalHoney1Block;
import net.mcreator.plantsandrocks.block.NaturalRoyalHoneyBlock;
import net.mcreator.plantsandrocks.block.GenblockVinerBlock;
import net.mcreator.plantsandrocks.block.GenblockStonerBlock;
import net.mcreator.plantsandrocks.block.GenblockGeneralDecoratorBlock;
import net.mcreator.plantsandrocks.block.FakeRedMushroomBlock;
import net.mcreator.plantsandrocks.block.FakeBrownMushroomBlock;
import net.mcreator.plantsandrocks.block.FairyCenterBlock;
import net.mcreator.plantsandrocks.block.FairyCenter2Block;
import net.mcreator.plantsandrocks.block.DeactivatedFairyCenterBlock;
import net.mcreator.plantsandrocks.PlantsAndRocksMod;

public class PlantsAndRocksModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(PlantsAndRocksMod.MODID);
	public static final DeferredBlock<Block> FAKE_RED_MUSHROOM = REGISTRY.register("fake_red_mushroom", FakeRedMushroomBlock::new);
	public static final DeferredBlock<Block> FAKE_BROWN_MUSHROOM = REGISTRY.register("fake_brown_mushroom", FakeBrownMushroomBlock::new);
	public static final DeferredBlock<Block> NATURAL_ROYAL_HONEY = REGISTRY.register("natural_royal_honey", NaturalRoyalHoneyBlock::new);
	public static final DeferredBlock<Block> GENBLOCK_VINER = REGISTRY.register("genblock_viner", GenblockVinerBlock::new);
	public static final DeferredBlock<Block> FAIRY_CENTER = REGISTRY.register("fairy_center", FairyCenterBlock::new);
	public static final DeferredBlock<Block> FAIRY_CENTER_2 = REGISTRY.register("fairy_center_2", FairyCenter2Block::new);
	public static final DeferredBlock<Block> DEACTIVATED_FAIRY_CENTER = REGISTRY.register("deactivated_fairy_center", DeactivatedFairyCenterBlock::new);
	public static final DeferredBlock<Block> VEGGIE_SPREADER = REGISTRY.register("veggie_spreader", VeggieSpreaderBlock::new);
	public static final DeferredBlock<Block> GENBLOCK_STONER = REGISTRY.register("genblock_stoner", GenblockStonerBlock::new);
	public static final DeferredBlock<Block> GENBLOCK_GENERAL_DECORATOR = REGISTRY.register("genblock_general_decorator", GenblockGeneralDecoratorBlock::new);
	public static final DeferredBlock<Block> ROYAL_HONEY_1 = REGISTRY.register("royal_honey_1", RoyalHoney1Block::new);
	public static final DeferredBlock<Block> ROYAL_HONEY_2 = REGISTRY.register("royal_honey_2", RoyalHoney2Block::new);
	public static final DeferredBlock<Block> ROYAL_HONEY_3 = REGISTRY.register("royal_honey_3", RoyalHoney3Block::new);
	public static final DeferredBlock<Block> ROYAL_HONEY_4 = REGISTRY.register("royal_honey_4", RoyalHoney4Block::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
