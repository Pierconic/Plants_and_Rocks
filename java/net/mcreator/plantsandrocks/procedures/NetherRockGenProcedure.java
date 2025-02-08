package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class NetherRockGenProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(BlockPos.containing(x, y, z)) && y <= 58 && world.getBlockState(BlockPos.containing(x + 1, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x - 1, y - 1, z)).canOcclude()
				&& world.getBlockState(BlockPos.containing(x, y - 1, z - 1)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z + 1)).canOcclude()) {
			BlackstoneSpreaderProcedure.execute(world, x, y, z);
			return true;
		}
		return false;
	}
}
