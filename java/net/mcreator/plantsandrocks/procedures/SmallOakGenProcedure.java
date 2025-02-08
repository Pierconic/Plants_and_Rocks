package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class SmallOakGenProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("forest"))) {
			if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && world.getBlockState(BlockPos.containing(x + 4, y, z)).canOcclude() && world.getBlockState(BlockPos.containing(x - 4, y, z)).canOcclude()
					&& world.getBlockState(BlockPos.containing(x, y, z - 4)).canOcclude() && world.getBlockState(BlockPos.containing(x, y, z + 4)).canOcclude() && world.getBlockState(BlockPos.containing(x + 4, y - 1, z)).canOcclude()
					&& world.getBlockState(BlockPos.containing(x - 4, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z - 4)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z + 4)).canOcclude()
					&& world.canSeeSkyFromBelowWater(BlockPos.containing(x + 1, y + 1, z)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x - 1, y + 1, z)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z - 1))
					&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z + 1))) {
				return true;
			}
		}
		return false;
	}
}
