package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class MediumFungiGenConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(BlockPos.containing(x + 1, y + 1, z)) && world.isEmptyBlock(BlockPos.containing(x - 1, y + 1, z)) && world.isEmptyBlock(BlockPos.containing(x, y + 1, z - 1)) && world.isEmptyBlock(BlockPos.containing(x, y + 1, z + 1))
				&& world.isEmptyBlock(BlockPos.containing(x + 1, y + 1, z + 1)) && world.isEmptyBlock(BlockPos.containing(x + 1, y + 1, z - 1)) && world.isEmptyBlock(BlockPos.containing(x - 1, y + 1, z + 1))
				&& world.isEmptyBlock(BlockPos.containing(x - 1, y + 1, z - 1)) && world.getBlockState(BlockPos.containing(x + 1, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x - 1, y - 1, z)).canOcclude()
				&& world.getBlockState(BlockPos.containing(x, y - 1, z - 1)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z + 1)).canOcclude() && world.getBlockState(BlockPos.containing(x + 1, y - 1, z + 1)).canOcclude()
				&& world.getBlockState(BlockPos.containing(x - 1, y - 1, z + 1)).canOcclude() && world.getBlockState(BlockPos.containing(x + 1, y - 1, z - 1)).canOcclude()
				&& world.getBlockState(BlockPos.containing(x - 1, y - 1, z - 1)).canOcclude()) {
			return true;
		}
		return false;
	}
}
