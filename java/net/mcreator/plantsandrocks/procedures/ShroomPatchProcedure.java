package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class ShroomPatchProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double size = 0;
		size = Mth.nextInt(RandomSource.create(), 1, 3);
		sx = (-2) * size;
		for (int index0 = 0; index0 < (int) (4 * size); index0++) {
			sy = (-2) * size;
			for (int index1 = 0; index1 < (int) (4 * size); index1++) {
				sz = (-2) * size;
				for (int index2 = 0; index2 < (int) (4 * size); index2++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("minecraft:moss_replaceable"))) && world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz))
							&& Math.random() < 0.5) {
						if (Math.random() < 0.3) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.MYCELIUM.defaultBlockState(), 3);
						} else if (Math.random() < 0.4) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.COARSE_DIRT.defaultBlockState(), 3);
						}
						if (Math.random() < 0.07) {
							if (Math.random() < 0.5) {
								world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.RED_MUSHROOM_BLOCK.defaultBlockState(), 3);
							} else {
								world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.BROWN_MUSHROOM_BLOCK.defaultBlockState(), 3);
							}
						} else if (Math.random() < 0.25 && !((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.COARSE_DIRT)) {
							if (Math.random() < 0.5) {
								world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.RED_MUSHROOM.defaultBlockState(), 3);
							} else {
								world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.BROWN_MUSHROOM.defaultBlockState(), 3);
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
