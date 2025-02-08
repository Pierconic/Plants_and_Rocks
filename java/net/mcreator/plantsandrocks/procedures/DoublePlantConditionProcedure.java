package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class DoublePlantConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(BlockPos.containing(x, y, z)).canOcclude() && world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && world.isEmptyBlock(BlockPos.containing(x, y + 2, z))) {
			return true;
		}
		return false;
	}
}
