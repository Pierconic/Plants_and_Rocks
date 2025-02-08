package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class RootconversionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.DIRT || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.COARSE_DIRT
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.CLAY || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.MOSS_BLOCK
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.STONE || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.GRANITE) {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.ROOTED_DIRT.defaultBlockState(), 3);
		}
		sx = -8;
		for (int index0 = 0; index0 < 12; index0++) {
			sy = -6;
			for (int index1 = 0; index1 < 12; index1++) {
				sz = -6;
				for (int index2 = 0; index2 < 12; index2++) {
					if (Math.random() < 0.2
							&& ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.DIRT || (world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.COARSE_DIRT
									|| (world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.CLAY || (world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.MOSS_BLOCK
									|| (world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.STONE || (world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.GRANITE)
							&& (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.AIR) {
						world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.ROOTED_DIRT.defaultBlockState(), 3);
						if (Math.random() < 0.5) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.HANGING_ROOTS.defaultBlockState(), 3);
						}
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
	}
}
