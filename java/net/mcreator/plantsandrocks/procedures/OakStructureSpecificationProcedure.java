package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class OakStructureSpecificationProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("forest")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("flower_forest"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("wooded_badlands"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("swamp")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("jungle"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("sparse_jungle")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
			return true;
		}
		return false;
	}
}
