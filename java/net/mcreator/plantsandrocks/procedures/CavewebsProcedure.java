package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class CavewebsProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (y < 60 && !(world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dripstone_caves")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("lush_caves")))
				&& world.isEmptyBlock(BlockPos.containing(x, y, z)) && (world.getBlockState(BlockPos.containing(x + 1, y, z)).canOcclude() || world.getBlockState(BlockPos.containing(x - 1, y, z)).canOcclude()
						|| world.getBlockState(BlockPos.containing(x, y, z - 1)).canOcclude() || world.getBlockState(BlockPos.containing(x, y, z + 1)).canOcclude() || world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude())) {
			return true;
		}
		return false;
	}
}
