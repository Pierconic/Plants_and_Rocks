package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class GenericLargeSpreaderProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -6;
		for (int index0 = 0; index0 < 13; index0++) {
			sz = -6;
			for (int index1 = 0; index1 < 13; index1++) {
				if (Math.random() < 0.7 && Math.abs(sx) < 5 && Math.abs(sz) < 5
						&& (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz))).getBlock() == Blocks.GRASS_BLOCK) {
					world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz), (world.getBlockState(BlockPos.containing(x, y, z))), 3);
				} else if (Math.random() < 0.45 && (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz))).getBlock() == Blocks.GRASS_BLOCK) {
					world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz), (world.getBlockState(BlockPos.containing(x, y, z))), 3);
				}
				sz = sz + 1;
			}
			sx = sx + 1;
		}
	}
}
