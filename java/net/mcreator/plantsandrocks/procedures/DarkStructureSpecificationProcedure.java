package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class DarkStructureSpecificationProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("birch_forest")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_birch_forest"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("forest")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("flower_forest"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("meadow")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("cherry_grove"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest"))) {
			return true;
		}
		return false;
	}
}
