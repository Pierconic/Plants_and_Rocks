package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class SnowyShrubGenConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("grove"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))) {
			if (world.getBlockState(BlockPos.containing(x + 1, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x - 1, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z - 1)).canOcclude()
					&& world.getBlockState(BlockPos.containing(x, y - 1, z + 1)).canOcclude()) {
				return true;
			}
		}
		return false;
	}
}
