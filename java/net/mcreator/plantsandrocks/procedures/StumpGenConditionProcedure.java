package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class StumpGenConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:forests")))
				&& !(!((world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() instanceof LiquidBlock) && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z)))) {
			return true;
		}
		return false;
	}
}
