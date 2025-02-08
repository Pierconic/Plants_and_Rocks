package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class WebSpreaderProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = 0;
		for (int index0 = 0; index0 < 16; index0++) {
			sy = -5;
			for (int index1 = 0; index1 < 10; index1++) {
				sz = 0;
				for (int index2 = 0; index2 < 16; index2++) {
					if (Math.random() < 0.2 && world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz)).canOcclude()) {
						WebbageProcedure.execute(world, x + sx, y + sy, z + sz);
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
	}
}
