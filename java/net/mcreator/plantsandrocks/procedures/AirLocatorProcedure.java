package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class AirLocatorProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -6;
		found = false;
		for (int index0 = 0; index0 < 12; index0++) {
			sy = -6;
			for (int index1 = 0; index1 < 12; index1++) {
				sz = -6;
				for (int index2 = 0; index2 < 12; index2++) {
					if (world.isEmptyBlock(BlockPos.containing(x + sx, y + sy, z + sz)) && found == false) {
						DripstoneSpreaderProcedure.execute(world, x + sx, y + sy, z + sz);
						found = true;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
	}
}
