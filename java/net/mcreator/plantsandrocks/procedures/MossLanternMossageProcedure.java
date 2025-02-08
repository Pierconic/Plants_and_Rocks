package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class MossLanternMossageProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double moss = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -3;
		found = false;
		for (int index0 = 0; index0 < 6; index0++) {
			sy = -3;
			for (int index1 = 0; index1 < 6; index1++) {
				sz = -3;
				for (int index2 = 0; index2 < 6; index2++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("minecraft:moss_replaceable")))) {
						if (Math.random() < 0.5) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.MOSS_BLOCK.defaultBlockState(), 3);
							if (Math.random() < 0.5 && world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz))) {
								if (Math.random() < 0.7) {
									world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.SHORT_GRASS.defaultBlockState(), 3);
								} else {
									world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.AZALEA.defaultBlockState(), 3);
								}
							} else if (Math.random() < 0.7 && world.isEmptyBlock(BlockPos.containing(x + sx, (y + sy) - 1, z + sz)) && world.isEmptyBlock(BlockPos.containing(x + sx, (y + sy) - 2, z + sz))) {
								if (Math.random() < 0.7) {
									world.setBlock(BlockPos.containing(x + sx, (y + sy) - 1, z + sz), Blocks.CAVE_VINES.defaultBlockState(), 3);
								} else {
									world.setBlock(BlockPos.containing(x + sx, (y + sy) - 1, z + sz), Blocks.CAVE_VINES.defaultBlockState(), 3);
									world.setBlock(BlockPos.containing(x + sx, (y + sy) - 2, z + sz), Blocks.CAVE_VINES.defaultBlockState(), 3);
								}
							}
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
