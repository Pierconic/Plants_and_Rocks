package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class TreeRootSpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable"))) && !(world instanceof ServerLevel _level2 && _level2.isVillage(BlockPos.containing(x, y, z)))) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.ROOTED_DIRT.defaultBlockState(), 3);
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.HANGING_ROOTS.defaultBlockState(), 3);
			} else if (Math.random() < 0.6 && (world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
				world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.ROOTED_DIRT.defaultBlockState(), 3);
				if ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y - 2, z), Blocks.HANGING_ROOTS.defaultBlockState(), 3);
				}
			}
		}
		if (Math.random() < 0.2 && (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
			world.setBlock(BlockPos.containing(x, y, z - 1), Blocks.ROOTED_DIRT.defaultBlockState(), 3);
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(x, y - 1, z - 1), Blocks.HANGING_ROOTS.defaultBlockState(), 3);
			}
		}
		if (Math.random() < 0.2 && (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
			world.setBlock(BlockPos.containing(x, y, z + 1), Blocks.ROOTED_DIRT.defaultBlockState(), 3);
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(x, y - 1, z + 1), Blocks.HANGING_ROOTS.defaultBlockState(), 3);
			}
		}
		if (Math.random() < 0.2 && (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
			world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.ROOTED_DIRT.defaultBlockState(), 3);
			if ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(x + 1, y - 1, z), Blocks.HANGING_ROOTS.defaultBlockState(), 3);
			}
		}
		if (Math.random() < 0.2 && (world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
			world.setBlock(BlockPos.containing(x - 1, y, z), Blocks.ROOTED_DIRT.defaultBlockState(), 3);
			if ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(x - 1, y - 1, z), Blocks.HANGING_ROOTS.defaultBlockState(), 3);
			}
		}
	}
}
