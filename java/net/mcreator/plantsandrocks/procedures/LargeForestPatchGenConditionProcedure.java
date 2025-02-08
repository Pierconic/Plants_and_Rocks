package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class LargeForestPatchGenConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(BlockPos.containing(x + 3, y + 2, z + 3)) && world.getBlockState(BlockPos.containing(x + 5, y - 1, z + 5)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z + 5)).canOcclude()
				&& world.getBlockState(BlockPos.containing(x + 5, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
			if (ForestBoulderConditionProcedure.execute(world, x, y, z) == true) {
				return true;
			}
		}
		return false;
	}
}
