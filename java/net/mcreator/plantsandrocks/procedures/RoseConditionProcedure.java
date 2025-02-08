package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class RoseConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && world.getBlockState(BlockPos.containing(x, y, z)).canOcclude()) {
			return true;
		}
		return false;
	}
}
