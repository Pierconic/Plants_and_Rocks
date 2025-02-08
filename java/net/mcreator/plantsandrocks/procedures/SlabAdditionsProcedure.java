package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class SlabAdditionsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.6) {
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:slaby"))) && world.getBlockState(BlockPos.containing(x, y, z - 1)).canOcclude()
					|| (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).is(BlockTags.create(ResourceLocation.parse("forge:slaby"))) && world.getBlockState(BlockPos.containing(x, y, z + 1)).canOcclude()
					|| (world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).is(BlockTags.create(ResourceLocation.parse("forge:slaby"))) && world.getBlockState(BlockPos.containing(x - 1, y, z)).canOcclude()
					|| (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).is(BlockTags.create(ResourceLocation.parse("forge:slaby"))) && world.getBlockState(BlockPos.containing(x + 1, y, z)).canOcclude()) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STONE) {
					world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.STONE_SLAB.defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GRANITE) {
					world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.GRANITE_SLAB.defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ANDESITE) {
					world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.ANDESITE_SLAB.defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DIORITE) {
					world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.DIORITE_SLAB.defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SANDSTONE) {
					world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.SANDSTONE_SLAB.defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.RED_SANDSTONE) {
					world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.RED_SANDSTONE_SLAB.defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BLACKSTONE) {
					world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.BLACKSTONE_SLAB.defaultBlockState(), 3);
				}
			}
		}
	}
}
