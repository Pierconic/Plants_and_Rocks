package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class IceSpikeSpreaderProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		sx = -4;
		for (int index0 = 0; index0 < 9; index0++) {
			sy = -4;
			for (int index1 = 0; index1 < 9; index1++) {
				sz = -4;
				for (int index2 = 0; index2 < 9; index2++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).getBlock() == Blocks.DIRT || (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).getBlock() == Blocks.PACKED_ICE
							|| (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).getBlock() == Blocks.SNOW_BLOCK || (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).getBlock() == Blocks.GRAVEL) {
						if (Math.random() < 0.4) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.PACKED_ICE.defaultBlockState(), 3);
							if (world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz)) || (world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() instanceof LiquidBlock) {
								if (Math.random() < 0.7) {
									world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.PACKED_ICE.defaultBlockState(), 3);
								} else {
									world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.ICE.defaultBlockState(), 3);
								}
							}
						} else if ((world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).getBlock() == Blocks.PACKED_ICE) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.ICE.defaultBlockState(), 3);
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
