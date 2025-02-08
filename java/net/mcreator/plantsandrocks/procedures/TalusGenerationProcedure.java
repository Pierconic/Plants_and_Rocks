package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class TalusGenerationProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -4;
		for (int index0 = 0; index0 < 9; index0++) {
			sy = -4;
			for (int index1 = 0; index1 < 7; index1++) {
				sz = -4;
				for (int index2 = 0; index2 < 9; index2++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable"))) && Math.random() < 0.22) {
						RockGenConditionProcedure.execute(world, x + sx, y + sy, z + sz);
					} else if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("minecraft:is_ocean")))
							&& ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SAND || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.GRAVEL)) {
						WaterRockGenConditionProcedure.execute(world, x + sx, y + sy, z + sz);
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		return true;
	}
}
