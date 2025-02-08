package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class SnowCheckProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:chilly"))) && FluidCheckProcedure.execute(world, x, y, z)) {
			return true;
		} else {
			sx = -3;
			found = false;
			for (int index0 = 0; index0 < 5; index0++) {
				sy = -1;
				for (int index1 = 0; index1 < 3; index1++) {
					sz = -2;
					for (int index2 = 0; index2 < 5; index2++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SNOW) {
							return true;
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
		}
		return false;
	}
}
