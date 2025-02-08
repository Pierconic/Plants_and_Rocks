package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class PeonySpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -3;
		for (int index0 = 0; index0 < 6; index0++) {
			sy = -3;
			for (int index1 = 0; index1 < 6; index1++) {
				sz = -3;
				for (int index2 = 0; index2 < 6; index2++) {
					if (((world.getBlockState(BlockPos.containing(x + sx, y + sx, z + sx))).is(BlockTags.create(ResourceLocation.parse("minecraft:moss_replaceable")))
							|| (world.getBlockState(BlockPos.containing(x + sx, y + sx, z + sx))).getBlock() == Blocks.MOSS_BLOCK) && Math.random() < 0.6) {
						world.setBlock(BlockPos.containing(x + sx, y + sx, z + sx), Blocks.COARSE_DIRT.defaultBlockState(), 3);
						if (world.isEmptyBlock(BlockPos.containing(x + sx, y + sx + 2, z + sx)) && Math.random() < 0.6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "peony"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x + sx, (y + sx) - 1, z + sx), BlockPos.containing(x + sx, (y + sx) - 1, z + sx),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						}
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
	}
}
