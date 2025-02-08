package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SpikeSpreaderProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		if (y > 62) {
			sx = -3;
			for (int index0 = 0; index0 < 7; index0++) {
				sy = -3;
				for (int index1 = 0; index1 < 7; index1++) {
					sz = -3;
					for (int index2 = 0; index2 < 7; index2++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.STONE || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.STONE
								|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SAND) {
							if (Math.random() < 0.4) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.STONE.defaultBlockState(), 3);
								if (world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz)) || (world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() instanceof LiquidBlock) {
									if (Math.random() < 0.7) {
										world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.STONE.defaultBlockState(), 3);
									} else {
										world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.GRANITE.defaultBlockState(), 3);
									}
								}
							} else if (Math.random() < 0.2) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.GRANITE.defaultBlockState(), 3);
							} else if (Math.random() < 0.2) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.DIORITE.defaultBlockState(), 3);
							}
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			sx = -7;
			for (int index3 = 0; index3 < 15; index3++) {
				sy = -7;
				for (int index4 = 0; index4 < 15; index4++) {
					sz = -7;
					for (int index5 = 0; index5 < 15; index5++) {
						if (((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.STONE || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.GRANITE
								|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.ANDESITE) && world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz))) {
							if (Math.random() < 0.016) {
								if (Math.random() < 0.4) {
									world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.STONE.defaultBlockState(), 3);
								} else if (Math.random() < 0.2) {
									world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.DIORITE.defaultBlockState(), 3);
								} else if (Math.random() < 0.2) {
									world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.GRANITE.defaultBlockState(), 3);
								}
							} else if (Math.random() < 0.04) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.DIORITE.defaultBlockState(), 3);
							} else if (Math.random() < 0.2) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.GRANITE.defaultBlockState(), 3);
							}
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
		}
		return true;
	}
}
