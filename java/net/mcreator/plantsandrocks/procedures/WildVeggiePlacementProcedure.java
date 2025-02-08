package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.plantsandrocks.init.PlantsAndRocksModBlocks;
import net.mcreator.plantsandrocks.PlantsAndRocksMod;

public class WildVeggiePlacementProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), PlantsAndRocksModBlocks.VEGGIE_SPREADER.get().defaultBlockState(), 3);
		world.scheduleTick(BlockPos.containing(x, y, z), world.getBlockState(BlockPos.containing(x, y, z)).getBlock(), 2);
		PlantsAndRocksMod.queueServerWork(10, () -> {
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x, y, z), _level.getBlockState(BlockPos.containing(x, y, z)).getBlock());
		});
		return true;
	}
}
