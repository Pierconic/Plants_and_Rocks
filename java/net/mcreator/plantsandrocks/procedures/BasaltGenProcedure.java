package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class BasaltGenProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(BlockPos.containing(x, y, z)) && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude() && y <= 58) {
			return true;
		}
		return false;
	}
}
