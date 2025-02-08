package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class FungiGenConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (y <= 100 && y >= 0 && world.isEmptyBlock(BlockPos.containing(x, y, z)) && !world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z)) && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
			return true;
		}
		return false;
	}
}
