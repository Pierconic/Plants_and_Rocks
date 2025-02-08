package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.plantsandrocks.init.PlantsAndRocksModBlocks;
import net.mcreator.plantsandrocks.PlantsAndRocksMod;

public class GeneralDecoratorInstigationProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
			world.setBlock(BlockPos.containing(x, y, z), PlantsAndRocksModBlocks.GENBLOCK_GENERAL_DECORATOR.get().defaultBlockState(), 3);
			world.scheduleTick(BlockPos.containing(x, y, z), world.getBlockState(BlockPos.containing(x, y, z)).getBlock(), 2);
			PlantsAndRocksMod.queueServerWork(10, () -> {
				if (world instanceof Level _level)
					_level.updateNeighborsAt(BlockPos.containing(x, y, z), _level.getBlockState(BlockPos.containing(x, y, z)).getBlock());
			});
		} else if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER) {
			world.setBlock(BlockPos.containing(x, y, z), PlantsAndRocksModBlocks.GENBLOCK_GENERAL_DECORATOR.get().defaultBlockState(), 3);
			world.scheduleTick(BlockPos.containing(x, y, z), world.getBlockState(BlockPos.containing(x, y, z)).getBlock(), 2);
			PlantsAndRocksMod.queueServerWork(10, () -> {
				if (world instanceof Level _level)
					_level.updateNeighborsAt(BlockPos.containing(x, y, z), _level.getBlockState(BlockPos.containing(x, y, z)).getBlock());
			});
		}
		return true;
	}
}
