package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class SwampTreeGenProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("swamp")) && world.isEmptyBlock(BlockPos.containing(x + 3, y + 4, z))
				&& (world.isEmptyBlock(BlockPos.containing(x, y + 4, z + 3)) || world.isEmptyBlock(BlockPos.containing(x + 3, y + 4, z + 3)) || world.isEmptyBlock(BlockPos.containing(x, y + 4, z)))
				&& world.getBlockState(BlockPos.containing(x + 3, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z + 3)).canOcclude() && world.getBlockState(BlockPos.containing(x + 3, y - 1, z + 3)).canOcclude()
				&& world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
			return true;
		}
		return false;
	}
}
