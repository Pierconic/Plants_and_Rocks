package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class SpruceFallGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double stumpside = 0;
		double stumpnumber = 0;
		if (Math.random() < 1) {
			stumpside = Mth.nextInt(RandomSource.create(), 0, 3);
			stumpside = Mth.nextInt(RandomSource.create(), 1, 6);
			if (stumpside == 0 && world.isEmptyBlock(BlockPos.containing(x, y, z - 2)) && world.getBlockState(BlockPos.containing(x, y - 1, z - 2)).canOcclude() && world.isEmptyBlock(BlockPos.containing(x, y, z - 3))
					&& world.getBlockState(BlockPos.containing(x, y - 1, z - 3)).canOcclude() && world.isEmptyBlock(BlockPos.containing(x, y, z - 4)) && world.getBlockState(BlockPos.containing(x, y - 1, z - 4)).canOcclude()) {
				if (stumpnumber == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "fallen_spruce_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z - 2), BlockPos.containing(x, y, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (stumpnumber == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "fallen_spruce_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z - 2), BlockPos.containing(x, y, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (stumpnumber == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "fallen_spruce_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z - 2), BlockPos.containing(x, y, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (stumpnumber == 4) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "fallen_spruce_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z - 2), BlockPos.containing(x, y, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (stumpnumber == 5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "fallen_spruce_7"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z - 2), BlockPos.containing(x, y, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (stumpnumber == 6) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "fallen_spruce_8"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z - 2), BlockPos.containing(x, y, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (stumpside == 1 && world.isEmptyBlock(BlockPos.containing(x, y, z + 2)) && world.getBlockState(BlockPos.containing(x, y - 1, z + 2)).canOcclude() && world.isEmptyBlock(BlockPos.containing(x, y, z + 3))
					&& world.getBlockState(BlockPos.containing(x, y - 1, z + 3)).canOcclude() && world.isEmptyBlock(BlockPos.containing(x, y, z + 4)) && world.getBlockState(BlockPos.containing(x, y - 1, z + 4)).canOcclude()) {
				if (stumpnumber == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "fallen_spruce_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z + 2), BlockPos.containing(x, y, z + 2), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (stumpnumber == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "fallen_spruce_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z + 2), BlockPos.containing(x, y, z + 2), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (stumpnumber == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "fallen_spruce_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z + 2), BlockPos.containing(x, y, z + 2), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (stumpnumber == 4) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "fallen_spruce_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z + 2), BlockPos.containing(x, y, z + 2), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (stumpnumber == 5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "fallen_spruce_7"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z + 2), BlockPos.containing(x, y, z + 2), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (stumpnumber == 6) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "fallen_spruce_8"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z + 2), BlockPos.containing(x, y, z + 2), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (stumpside == 2 && world.isEmptyBlock(BlockPos.containing(x + 2, y, z)) && world.getBlockState(BlockPos.containing(x + 2, y - 1, z)).canOcclude() && world.isEmptyBlock(BlockPos.containing(x + 3, y, z))
					&& world.getBlockState(BlockPos.containing(x + 3, y - 1, z)).canOcclude() && world.isEmptyBlock(BlockPos.containing(x + 4, y, z)) && world.getBlockState(BlockPos.containing(x + 4, y - 1, z)).canOcclude()) {
				if (stumpnumber == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "fallen_spruce_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 2, y, z), BlockPos.containing(x + 2, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (stumpnumber == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "fallen_spruce_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 2, y, z), BlockPos.containing(x + 2, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (stumpnumber == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "fallen_spruce_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 2, y, z), BlockPos.containing(x + 2, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (stumpnumber == 4) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "fallen_spruce_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 2, y, z), BlockPos.containing(x + 2, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (stumpnumber == 5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "fallen_spruce_7"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 2, y, z), BlockPos.containing(x + 2, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (stumpnumber == 6) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "fallen_spruce_8"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 2, y, z), BlockPos.containing(x + 2, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (stumpside == 3 && world.isEmptyBlock(BlockPos.containing(x - 2, y, z)) && world.getBlockState(BlockPos.containing(x - 2, y - 1, z)).canOcclude() && world.isEmptyBlock(BlockPos.containing(x - 3, y, z))
					&& world.getBlockState(BlockPos.containing(x - 3, y - 1, z)).canOcclude() && world.isEmptyBlock(BlockPos.containing(x - 4, y, z)) && world.getBlockState(BlockPos.containing(x - 4, y - 1, z)).canOcclude()) {
				if (stumpnumber == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "fallen_spruce_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y, z), BlockPos.containing(x - 2, y, z),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (stumpnumber == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "fallen_spruce_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y, z), BlockPos.containing(x - 2, y, z),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (stumpnumber == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "fallen_spruce_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y, z), BlockPos.containing(x - 2, y, z),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (stumpnumber == 4) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "fallen_spruce_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y, z), BlockPos.containing(x - 2, y, z),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (stumpnumber == 5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "fallen_spruce_7"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y, z), BlockPos.containing(x - 2, y, z),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (stumpnumber == 6) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("plants_and_rocks", "fallen_spruce_8"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y, z), BlockPos.containing(x - 2, y, z),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			}
		}
	}
}
