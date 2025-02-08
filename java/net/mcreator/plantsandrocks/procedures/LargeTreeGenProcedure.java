package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class LargeTreeGenProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -8;
		found = false;
		for (int index0 = 0; index0 < 16; index0++) {
			sy = -8;
			for (int index1 = 0; index1 < 16; index1++) {
				sz = -8;
				for (int index2 = 0; index2 < 16; index2++) {
					if (Blocks.DARK_OAK_LOG == (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
						found = true;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (found == true) {
			if (world.isEmptyBlock(BlockPos.containing(x, y + 8, z)) && world.getBlockState(BlockPos.containing(x + 4, y, z)).canOcclude() && world.getBlockState(BlockPos.containing(x - 4, y, z)).canOcclude()
					&& world.getBlockState(BlockPos.containing(x, y, z - 4)).canOcclude() && world.getBlockState(BlockPos.containing(x, y, z + 4)).canOcclude() && world.getBlockState(BlockPos.containing(x + 5, y + 3, z)).canOcclude()
					&& world.getBlockState(BlockPos.containing(x - 5, y + 3, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y + 3, z - 5)).canOcclude() && world.getBlockState(BlockPos.containing(x, y + 3, z + 5)).canOcclude()) {
				return true;
			}
		}
		return false;
	}
}
