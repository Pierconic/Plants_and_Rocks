package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class JungleStructureSpecificationProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("bamboo_jungle")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("jungle"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("sparse_jungle"))) {
			return true;
		}
		return false;
	}
}
