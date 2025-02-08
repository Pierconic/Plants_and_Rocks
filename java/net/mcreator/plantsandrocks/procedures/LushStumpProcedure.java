package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class LushStumpProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (!world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_dark"))) {
			sx = -3;
			found = false;
			for (int index0 = 0; index0 < 6; index0++) {
				sy = -3;
				for (int index1 = 0; index1 < 6; index1++) {
					sz = -3;
					for (int index2 = 0; index2 < 6; index2++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.MOSS_BLOCK) {
							found = true;
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
		}
		if (found == true) {
			if (world.isEmptyBlock(BlockPos.containing(x, y + 2, z)) && world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CLAY
					|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STONE || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.MOSS_BLOCK)) {
				return true;
			}
		}
		return false;
	}
}
