package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class NetherDecorationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double sy2 = 0;
		double number = 0;
		boolean found = false;
		boolean ocean = false;
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		sx = 0;
		for (int index0 = 0; index0 < 16; index0++) {
			sy = -5;
			for (int index1 = 0; index1 < 10; index1++) {
				sz = 0;
				for (int index2 = 0; index2 < 16; index2++) {
					number = Mth.nextInt(RandomSource.create(), 1, 10);
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:slaby"))) && world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz))) {
						SlabAdditionsProcedure.execute(world, x + sx, y + sy, z + sz);
					}
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:nylium_replaceable"))) && Math.random() < 0.07) {
						RockGenConditionProcedure.execute(world, x + sx, y + sy, z + sz);
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
	}
}
