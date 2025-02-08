package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class FrozenRockGenConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double airsides = 0;
		double solidsides = 0;
		if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()
				&& world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:chilly")))) {
			airsides = 0;
			solidsides = 0;
			if (world.getBlockState(BlockPos.containing(x - 1, y, z)).canOcclude()) {
				solidsides = solidsides + 1;
			} else if (world.isEmptyBlock(BlockPos.containing(x - 1, y, z))) {
				airsides = solidsides + 1;
			}
			if (world.getBlockState(BlockPos.containing(x + 1, y, z)).canOcclude()) {
				solidsides = solidsides + 1;
			} else if (world.isEmptyBlock(BlockPos.containing(x + 1, y, z))) {
				airsides = solidsides + 1;
			}
			if (world.getBlockState(BlockPos.containing(x, y, z + 1)).canOcclude()) {
				solidsides = solidsides + 1;
			} else if (world.isEmptyBlock(BlockPos.containing(x, y, z + 1))) {
				airsides = solidsides + 1;
			}
			if (world.getBlockState(BlockPos.containing(x, y, z - 1)).canOcclude()) {
				solidsides = solidsides + 1;
			} else if (world.isEmptyBlock(BlockPos.containing(x, y, z - 1))) {
				airsides = solidsides + 1;
			}
			if (airsides > 0 && airsides < 4 && solidsides > 1 && airsides < 4) {
				return true;
			}
		}
		return false;
	}
}
