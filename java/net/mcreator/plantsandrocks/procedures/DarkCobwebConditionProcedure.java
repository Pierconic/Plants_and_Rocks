package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class DarkCobwebConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (!world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))
				&& ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(ResourceLocation.parse("minecraft:logs")))
						|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(ResourceLocation.parse("minecraft:logs")))
						|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(ResourceLocation.parse("minecraft:logs")))
						|| (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(ResourceLocation.parse("minecraft:logs")))
						|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(ResourceLocation.parse("minecraft:logs"))))
				&& (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("jungle")))) {
			return true;
		}
		return false;
	}
}
