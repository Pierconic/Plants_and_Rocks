package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class GiantShroomGenProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z))
				&& ((world.getBlockState(BlockPos.containing(x + 3, y - 0, z))).getBlock() == Blocks.MYCELIUM || (world.getBlockState(BlockPos.containing(x + 3, y - 0, z))).getBlock() == Blocks.COARSE_DIRT)
				&& ((world.getBlockState(BlockPos.containing(x - 3, y - 0, z))).getBlock() == Blocks.MYCELIUM || (world.getBlockState(BlockPos.containing(x - 3, y - 0, z))).getBlock() == Blocks.COARSE_DIRT)
				&& ((world.getBlockState(BlockPos.containing(x, y - 0, z - 3))).getBlock() == Blocks.MYCELIUM || (world.getBlockState(BlockPos.containing(x, y - 0, z - 3))).getBlock() == Blocks.COARSE_DIRT)
				&& ((world.getBlockState(BlockPos.containing(x, y - 0, z + 3))).getBlock() == Blocks.MYCELIUM || (world.getBlockState(BlockPos.containing(x, y - 0, z + 3))).getBlock() == Blocks.COARSE_DIRT)) {
			return true;
		}
		return false;
	}
}
