package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class MossLargeSpreaderProcedure {
	public static void execute(LevelAccessor world, double x, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -6;
		for (int index0 = 0; index0 < 13; index0++) {
			sz = -6;
			for (int index1 = 0; index1 < 13; index1++) {
				if (Math.random() < 0.7 && Math.abs(sx) < 4 && Math.abs(sz) < 4
						&& ((world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) - 1, z + sz))).getBlock() == Blocks.MUD
								|| (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) - 1, z + sz))).getBlock() == Blocks.GRASS_BLOCK
								|| (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) - 1, z + sz))).getBlock() == Blocks.DIRT)
						&& (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) + 1, z + sz))).getBlock() == Blocks.WATER) {
					world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) - 1, z + sz), Blocks.MOSS_BLOCK.defaultBlockState(), 3);
				} else if (Math.random() < 0.35
						&& ((world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) - 1, z + sz))).getBlock() == Blocks.MUD
								|| (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) - 1, z + sz))).getBlock() == Blocks.GRASS_BLOCK
								|| (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) - 1, z + sz))).getBlock() == Blocks.DIRT)
						&& (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) + 1, z + sz))).getBlock() == Blocks.WATER) {
					world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) - 1, z + sz), Blocks.MOSS_BLOCK.defaultBlockState(), 3);
				}
				sz = sz + 1;
			}
			sx = sx + 1;
		}
	}
}
