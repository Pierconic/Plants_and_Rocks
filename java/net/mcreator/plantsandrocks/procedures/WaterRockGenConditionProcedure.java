package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class WaterRockGenConditionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double airsides = 0;
		double solidsides = 0;
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() instanceof LiquidBlock && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
			airsides = 0;
			solidsides = 0;
			if (world.getBlockState(BlockPos.containing(x - 1, y, z)).canOcclude()) {
				solidsides = solidsides + 1;
			} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() instanceof LiquidBlock) {
				airsides = solidsides + 1;
			}
			if (world.getBlockState(BlockPos.containing(x + 1, y, z)).canOcclude()) {
				solidsides = solidsides + 1;
			} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() instanceof LiquidBlock) {
				airsides = solidsides + 1;
			}
			if (world.getBlockState(BlockPos.containing(x, y, z + 1)).canOcclude()) {
				solidsides = solidsides + 1;
			} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() instanceof LiquidBlock) {
				airsides = solidsides + 1;
			}
			if (world.getBlockState(BlockPos.containing(x, y, z - 1)).canOcclude()) {
				solidsides = solidsides + 1;
			} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() instanceof LiquidBlock) {
				airsides = solidsides + 1;
			}
			if (airsides > 0 && airsides < 4 && solidsides > 1 && airsides < 4) {
				if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_cold_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("cold_ocean"))) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.GRANITE.defaultBlockState(), 3);
				} else {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.PRISMARINE.defaultBlockState(), 3);
				}
			}
		}
	}
}
