package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SmallForestPatchGenConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(BlockPos.containing(x + 2, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z + 2)).canOcclude() && world.getBlockState(BlockPos.containing(x + 2, y - 1, z + 2)).canOcclude()
				&& world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x + 2, y - 0, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 0, z + 2)).canOcclude()
				&& world.getBlockState(BlockPos.containing(x + 2, y - 0, z + 2)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 0, z)).canOcclude() && world.isEmptyBlock(BlockPos.containing(x + 1, y + 2, z + 1))
				&& world.canSeeSkyFromBelowWater(BlockPos.containing(x + 1, y + 3, z + 1)) && !((world.getBlockState(BlockPos.containing(x + 1, y + 1, z + 1))).getBlock() instanceof LiquidBlock)) {
			if (ForestBoulderConditionProcedure.execute(world, x, y, z) == true) {
				return true;
			}
		}
		return false;
	}
}
