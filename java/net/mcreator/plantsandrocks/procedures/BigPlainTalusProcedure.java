package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class BigPlainTalusProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double ox = 0;
		double oz = 0;
		double rock = 0;
		if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("plains")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("sunflower_plains"))) {
			for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 4, 8); index0++) {
				ox = Mth.nextInt(RandomSource.create(), 5, 10);
				oz = Mth.nextInt(RandomSource.create(), 5, 10);
				if (Math.random() < 0.5) {
					ox = ox * (-1);
				}
				if (Math.random() < 0.5) {
					oz = oz * (-1);
				}
				if (world.getBlockState(BlockPos.containing(x + ox, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + ox), (int) (z + ox)) - 1, z + ox)).canOcclude()
						&& world.isEmptyBlock(BlockPos.containing(x + ox, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + ox), (int) (z + ox)), z + ox))) {
					if (Math.random() < 0.25) {
						rock = Mth.nextInt(RandomSource.create(), 0, 5);
						if (rock == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "plain_pebble_1"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x + ox, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + ox), (int) (z + ox)) - Mth.nextInt(RandomSource.create(), 0, 1), z + ox),
											BlockPos.containing(x + ox, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + ox), (int) (z + ox)) - Mth.nextInt(RandomSource.create(), 0, 1), z + ox),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (rock == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "plain_pebble_2"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x + ox, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + ox), (int) (z + ox)) - Mth.nextInt(RandomSource.create(), 0, 1), z + ox),
											BlockPos.containing(x + ox, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + ox), (int) (z + ox)) - Mth.nextInt(RandomSource.create(), 0, 1), z + ox),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (rock == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "plain_pebble_3"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x + ox, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + ox), (int) (z + ox)) - Mth.nextInt(RandomSource.create(), 0, 1), z + ox),
											BlockPos.containing(x + ox, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + ox), (int) (z + ox)) - Mth.nextInt(RandomSource.create(), 0, 1), z + ox),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (rock == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "plain_pebble_4"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x + ox, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + ox), (int) (z + ox)) - Mth.nextInt(RandomSource.create(), 0, 1), z + ox),
											BlockPos.containing(x + ox, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + ox), (int) (z + ox)) - Mth.nextInt(RandomSource.create(), 0, 1), z + ox),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (rock == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "plain_pebble_5"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x + ox, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + ox), (int) (z + ox)) - Mth.nextInt(RandomSource.create(), 0, 1), z + ox),
											BlockPos.containing(x + ox, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + ox), (int) (z + ox)) - Mth.nextInt(RandomSource.create(), 0, 1), z + ox),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (rock == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "plain_pebble_6"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x + ox, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + ox), (int) (z + ox)) - Mth.nextInt(RandomSource.create(), 0, 1), z + ox),
											BlockPos.containing(x + ox, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + ox), (int) (z + ox)) - Mth.nextInt(RandomSource.create(), 0, 1), z + ox),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						}
					} else {
						world.setBlock(BlockPos.containing(x + ox, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + ox), (int) (z + ox)) - Mth.nextInt(RandomSource.create(), 0, 1), z + ox), Blocks.GRANITE.defaultBlockState(), 3);
					}
				}
			}
			return true;
		}
		return false;
	}
}
