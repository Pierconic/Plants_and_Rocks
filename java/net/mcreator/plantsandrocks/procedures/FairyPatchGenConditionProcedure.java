package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.plantsandrocks.init.PlantsAndRocksModBlocks;

public class FairyPatchGenConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(BlockPos.containing(x + 3, y + 2, z + 3)) && world.getBlockState(BlockPos.containing(x + 5, y - 1, z + 5)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z + 5)).canOcclude()
				&& world.getBlockState(BlockPos.containing(x + 5, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
			if (ForestBoulderConditionProcedure.execute(world, x, y, z) == true) {
				world.setBlock(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z), z), PlantsAndRocksModBlocks.DEACTIVATED_FAIRY_CENTER.get().defaultBlockState(), 3);
				world.scheduleTick(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z), z),
						world.getBlockState(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z), z)).getBlock(), 2);
				return true;
			}
		}
		return false;
	}
}
