package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.plantsandrocks.init.PlantsAndRocksModBlocks;

public class LegacyHoneyProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), PlantsAndRocksModBlocks.NATURAL_ROYAL_HONEY.get().defaultBlockState(), 3);
	}
}
