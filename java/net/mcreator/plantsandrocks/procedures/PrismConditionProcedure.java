package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class PrismConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 5, z))).getBlock() instanceof LiquidBlock) {
			return true;
		}
		return false;
	}
}
