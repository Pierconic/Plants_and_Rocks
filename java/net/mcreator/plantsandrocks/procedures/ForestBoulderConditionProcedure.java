package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class ForestBoulderConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:forests")))) {
			sx = -4;
			found = false;
			for (int index0 = 0; index0 < 8; index0++) {
				sy = -4;
				for (int index1 = 0; index1 < 8; index1++) {
					sz = -4;
					for (int index2 = 0; index2 < 8; index2++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("minecraft:leaves")))) {
							found = true;
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			if (found == true) {
				return true;
			}
		}
		return false;
	}
}
