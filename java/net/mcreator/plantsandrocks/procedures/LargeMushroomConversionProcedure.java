package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.plantsandrocks.init.PlantsAndRocksModBlocks;

public class LargeMushroomConversionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -6;
		found = false;
		for (int index0 = 0; index0 < 12; index0++) {
			sy = 0;
			for (int index1 = 0; index1 < 9; index1++) {
				sz = -6;
				for (int index2 = 0; index2 < 12; index2++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == PlantsAndRocksModBlocks.FAKE_RED_MUSHROOM.get()) {
						world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.RED_MUSHROOM.defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == PlantsAndRocksModBlocks.FAKE_BROWN_MUSHROOM.get()) {
						world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.BROWN_MUSHROOM.defaultBlockState(), 3);
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
	}
}
