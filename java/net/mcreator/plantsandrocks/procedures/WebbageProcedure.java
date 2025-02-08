package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class WebbageProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && Math.random() < 0.4) {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.COBWEB.defaultBlockState(), 3);
		}
		if (world.isEmptyBlock(BlockPos.containing(x + 1, y, z)) && Math.random() < 0.4) {
			world.setBlock(BlockPos.containing(x + 1, y + 1, z), Blocks.COBWEB.defaultBlockState(), 3);
		}
		if (world.isEmptyBlock(BlockPos.containing(x - 1, y, z)) && Math.random() < 0.4) {
			world.setBlock(BlockPos.containing(x - 1, y + 1, z), Blocks.COBWEB.defaultBlockState(), 3);
		}
		if (world.isEmptyBlock(BlockPos.containing(x, y, z - 1)) && Math.random() < 0.4) {
			world.setBlock(BlockPos.containing(x, y + 1, z - 1), Blocks.COBWEB.defaultBlockState(), 3);
		}
		if (world.isEmptyBlock(BlockPos.containing(x, y, z + 1)) && Math.random() < 0.4) {
			world.setBlock(BlockPos.containing(x, y + 1, z + 1), Blocks.COBWEB.defaultBlockState(), 3);
		}
		if (world.isEmptyBlock(BlockPos.containing(x, y - 1, z)) && Math.random() < 0.2) {
			world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.COBWEB.defaultBlockState(), 3);
		}
	}
}
