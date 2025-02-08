package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class RootGenConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		boolean found = false;
		boolean village = false;
		if (world.isEmptyBlock(BlockPos.containing(x + 3, y + 1, z)) && world.isEmptyBlock(BlockPos.containing(x, y + 1, z + 3)) && world.isEmptyBlock(BlockPos.containing(x + 3, y + 1, z + 3)) && world.isEmptyBlock(BlockPos.containing(x, y + 1, z))
				&& world.getBlockState(BlockPos.containing(x, y, z + 3)).canOcclude() && world.getBlockState(BlockPos.containing(x + 3, y, z)).canOcclude() && world.getBlockState(BlockPos.containing(x + 3, y, z + 1)).canOcclude()
				&& world.getBlockState(BlockPos.containing(x, y, z)).canOcclude()) {
			sx = -3;
			found = false;
			for (int index0 = 0; index0 < 6; index0++) {
				sy = -3;
				for (int index1 = 0; index1 < 6; index1++) {
					sz = -3;
					for (int index2 = 0; index2 < 6; index2++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("minecraft:logs")))) {
							found = true;
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			if (found == true && !(world instanceof ServerLevel _level10 && _level10.isVillage(BlockPos.containing(x, y, z)))) {
				return true;
			}
		}
		return false;
	}
}
