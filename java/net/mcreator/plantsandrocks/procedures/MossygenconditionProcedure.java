package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class MossygenconditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(BlockPos.containing(x + 1, y, z)) && world.isEmptyBlock(BlockPos.containing(x - 1, y, z)) && world.isEmptyBlock(BlockPos.containing(x, y, z - 1)) && world.isEmptyBlock(BlockPos.containing(x, y, z + 1))
				&& world.isEmptyBlock(BlockPos.containing(x + 1, y, z + 1)) && world.isEmptyBlock(BlockPos.containing(x + 1, y, z - 1)) && world.isEmptyBlock(BlockPos.containing(x - 1, y, z + 1))
				&& world.isEmptyBlock(BlockPos.containing(x - 1, y, z - 1)) && world.getBlockState(BlockPos.containing(x + 3, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z + 3)).canOcclude()
				&& world.getBlockState(BlockPos.containing(x + 3, y - 1, z + 3)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()
				&& world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:forests")))) {
			return true;
		}
		return false;
	}
}
