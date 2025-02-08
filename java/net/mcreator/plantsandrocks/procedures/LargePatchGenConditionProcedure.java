package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class LargePatchGenConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (!world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("plains"))) {
			if (world.getBlockState(BlockPos.containing(x + 5, y, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y, z + 5)).canOcclude() && world.getBlockState(BlockPos.containing(x, y, z + 5)).canOcclude()
					&& world.getBlockState(BlockPos.containing(x, y, z)).canOcclude() && world.isEmptyBlock(BlockPos.containing(x + 3, y + 2, z + 3)) && world.getBlockState(BlockPos.containing(x + 2, y, z)).canOcclude()
					&& world.getBlockState(BlockPos.containing(x, y, z + 2)).canOcclude() && world.getBlockState(BlockPos.containing(x, y, z + 2)).canOcclude() && world.getBlockState(BlockPos.containing(x + 5, y - 1, z + 5)).canOcclude()
					&& world.getBlockState(BlockPos.containing(x, y - 1, z + 5)).canOcclude() && world.getBlockState(BlockPos.containing(x + 5, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
				return true;
			}
		}
		return false;
	}
}
