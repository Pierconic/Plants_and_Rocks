package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class CaveSpreaderProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sy = 0;
		sy = y - 20;
		while (y - sy > -64) {
			if (!world.getBlockState(BlockPos.containing(x, y - sy + 2, z)).canOcclude() && !world.getBlockState(BlockPos.containing(x, y - sy + 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - sy, z)).canOcclude()) {
				CaveDecorationProcedure.execute(world, x, y - sy, z);
			}
			sy = sy + 1;
		}
	}
}
