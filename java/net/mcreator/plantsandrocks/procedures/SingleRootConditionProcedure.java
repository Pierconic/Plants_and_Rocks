package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SingleRootConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == Blocks.OAK_LOG || (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.OAK_LOG
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == Blocks.OAK_LOG || (world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == Blocks.OAK_LOG)) {
			return true;
		}
		return false;
	}
}
