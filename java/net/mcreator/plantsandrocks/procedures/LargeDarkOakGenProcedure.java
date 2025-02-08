package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class LargeDarkOakGenProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest"))) {
			if (world.isEmptyBlock(BlockPos.containing(x, y + 8, z)) && world.getBlockState(BlockPos.containing(x + 4, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x - 4, y - 1, z)).canOcclude()
					&& world.getBlockState(BlockPos.containing(x, y - 1, z - 4)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z + 4)).canOcclude()) {
				return true;
			}
		}
		return false;
	}
}
