package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class DownRootProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sy = 0;
		while (!found && sy < 25) {
			if (world.getBlockState(BlockPos.containing(x, y - sy, z)).canOcclude() && world.isEmptyBlock(BlockPos.containing(x, (y - sy) - 1, z))) {
				if (Math.random() < 0.2) {
					if (Math.random() < 0.3) {
						world.setBlock(BlockPos.containing(x, y - sy, z + 1), Blocks.ROOTED_DIRT.defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y - sy, z + 1), Blocks.DIRT.defaultBlockState(), 3);
					}
				}
				if (Math.random() < 0.2) {
					if (Math.random() < 0.3) {
						world.setBlock(BlockPos.containing(x, y - sy, z - 1), Blocks.ROOTED_DIRT.defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y - sy, z - 1), Blocks.DIRT.defaultBlockState(), 3);
					}
				}
				if (Math.random() < 0.2) {
					if (Math.random() < 0.3) {
						world.setBlock(BlockPos.containing(x - 1, y - sy, z), Blocks.ROOTED_DIRT.defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x - 1, y - sy, z), Blocks.DIRT.defaultBlockState(), 3);
					}
				}
				if (Math.random() < 0.2) {
					if (Math.random() < 0.3) {
						world.setBlock(BlockPos.containing(x + 1, y - sy, z), Blocks.ROOTED_DIRT.defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x + 1, y - sy, z), Blocks.DIRT.defaultBlockState(), 3);
					}
				}
				world.setBlock(BlockPos.containing(x, y - sy, z), Blocks.ROOTED_DIRT.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, (y - sy) - 1, z), Blocks.HANGING_ROOTS.defaultBlockState(), 3);
				found = true;
			} else if (world.getBlockState(BlockPos.containing(x, y - sy, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - sy, z)).canOcclude()) {
				if (Math.random() < 0.08) {
					world.setBlock(BlockPos.containing(x, y - sy, z), Blocks.ROOTED_DIRT.defaultBlockState(), 3);
				}
				sy = sy + 1;
			} else {
				found = true;
			}
		}
	}
}
