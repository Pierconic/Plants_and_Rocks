package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class AcaciaStructureSpecificationProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna_plateau"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("windswept_savanna")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("eroded_badlands")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("mushroom_fields"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("wooded_badlands"))) {
			return true;
		}
		return false;
	}
}
