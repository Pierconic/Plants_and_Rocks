package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class SpruceStructureSpecificationProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_taiga")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("grove")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("windswept_forest"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("windswept_hills"))) {
			return true;
		}
		return false;
	}
}
