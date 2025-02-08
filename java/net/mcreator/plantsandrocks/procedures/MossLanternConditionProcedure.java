package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class MossLanternConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double airsides = 0;
		double solids = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (!world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_dark")) && y < 60) {
			airsides = 0;
			solids = 0;
			if (world.isEmptyBlock(BlockPos.containing(x, y - 1, z))) {
				airsides = airsides + 1;
			} else if (world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
				solids = solids + 1;
			}
			if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z))) {
				airsides = airsides + 1;
			} else if (world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude()) {
				solids = solids + 1;
			}
			if (world.isEmptyBlock(BlockPos.containing(x - 1, y, z))) {
				airsides = airsides + 1;
			} else if (world.getBlockState(BlockPos.containing(x - 1, y, z)).canOcclude()) {
				solids = solids + 1;
			}
			if (world.isEmptyBlock(BlockPos.containing(x + 1, y, z))) {
				airsides = airsides + 1;
			} else if (world.getBlockState(BlockPos.containing(x + 1, y, z)).canOcclude()) {
				solids = solids + 1;
			}
			if (world.isEmptyBlock(BlockPos.containing(x, y, z + 1))) {
				airsides = airsides + 1;
			} else if (world.getBlockState(BlockPos.containing(x, y, z + 1)).canOcclude()) {
				solids = solids + 1;
			}
			if (world.isEmptyBlock(BlockPos.containing(x, y, z - 1))) {
				airsides = airsides + 1;
			} else if (world.getBlockState(BlockPos.containing(x, y, z - 1)).canOcclude()) {
				solids = solids + 1;
			}
			if (airsides > 0 && solids > 1) {
				return true;
			}
		}
		return false;
	}
}
