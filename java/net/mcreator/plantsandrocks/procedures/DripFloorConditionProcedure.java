package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class DripFloorConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double solids = 0;
		double airsides = 0;
		if (y < 60 && y > -15) {
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
			if (!world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("lush_caves")) && airsides > 0 && solids > 1) {
				return true;
			}
		}
		return false;
	}
}
