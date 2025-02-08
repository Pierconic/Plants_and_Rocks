package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class NetherSpreaderProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sy = 0;
		while (sy < 128) {
			if ((world.getBlockState(BlockPos.containing(x, (y - sy) - 1, z))).is(BlockTags.create(ResourceLocation.parse("forge:nylium_replaceable"))) && !world.getBlockState(BlockPos.containing(x, y - sy, z)).canOcclude()) {
				NetherDecorationProcedure.execute(world, x, y, z);
			}
			sy = sy + 1;
		}
	}
}
