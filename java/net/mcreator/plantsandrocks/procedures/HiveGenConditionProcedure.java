package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class HiveGenConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(BlockPos.containing(x, y + 8, z)) && world.getBlockState(BlockPos.containing(x + 4, y, z)).canOcclude() && world.getBlockState(BlockPos.containing(x - 4, y, z)).canOcclude()
				&& world.getBlockState(BlockPos.containing(x, y, z - 4)).canOcclude() && world.getBlockState(BlockPos.containing(x, y, z + 4)).canOcclude() && world.getBlockState(BlockPos.containing(x + 6, y - 5, z)).canOcclude()
				&& world.getBlockState(BlockPos.containing(x - 6, y - 5, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 5, z + 6)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 5, z - 6)).canOcclude()) {
			return true;
		}
		return false;
	}
}
