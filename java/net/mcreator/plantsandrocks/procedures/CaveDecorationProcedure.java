package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class CaveDecorationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double sy2 = 0;
		double number = 0;
		boolean found = false;
		boolean ocean = false;
		if (!world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dripstone_caves")) && !world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_dark"))
				&& !world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("lush_caves"))) {
			if (Math.random() < 0.03) {
				DripstoneSpreaderProcedure.execute(world, x + Mth.nextInt(RandomSource.create(), -8, 8), y, z + Mth.nextInt(RandomSource.create(), -8, 8));
			} else if (Math.random() < 0.02) {
				ShroomPatchProcedure.execute(world, x + Mth.nextInt(RandomSource.create(), -8, 8), y, z + Mth.nextInt(RandomSource.create(), -8, 8));
			} else if (Math.random() < 0.015 && y > 0) {
				WebSpreaderProcedure.execute(world, x, y, z);
			}
		}
	}
}
