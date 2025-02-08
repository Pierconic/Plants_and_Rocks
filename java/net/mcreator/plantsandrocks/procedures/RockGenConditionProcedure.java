package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class RockGenConditionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double airsides = 0;
		double solidsides = 0;
		if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()
				|| world.isEmptyBlock(BlockPos.containing(x, y - 1, z)) && world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude()) {
			airsides = 0;
			solidsides = 0;
			if (world.getBlockState(BlockPos.containing(x - 1, y, z)).canOcclude()) {
				solidsides = solidsides + 1;
			} else if (world.isEmptyBlock(BlockPos.containing(x - 1, y, z)) || (world.getBlockState(BlockPos.containing(x - 1, y, z + 0))).getBlock() == Blocks.SNOW) {
				airsides = solidsides + 1;
			}
			if (world.getBlockState(BlockPos.containing(x + 1, y, z)).canOcclude()) {
				solidsides = solidsides + 1;
			} else if (world.isEmptyBlock(BlockPos.containing(x + 1, y, z)) || (world.getBlockState(BlockPos.containing(x + 1, y, z + 0))).getBlock() == Blocks.SNOW) {
				airsides = solidsides + 1;
			}
			if (world.getBlockState(BlockPos.containing(x, y, z + 1)).canOcclude()) {
				solidsides = solidsides + 1;
			} else if (world.isEmptyBlock(BlockPos.containing(x, y, z + 1)) || (world.getBlockState(BlockPos.containing(x - 0, y, z + 1))).getBlock() == Blocks.SNOW) {
				airsides = solidsides + 1;
			}
			if (world.getBlockState(BlockPos.containing(x, y, z - 1)).canOcclude()) {
				solidsides = solidsides + 1;
			} else if (world.isEmptyBlock(BlockPos.containing(x, y, z - 1)) || (world.getBlockState(BlockPos.containing(x - 0, y, z - 1))).getBlock() == Blocks.SNOW) {
				airsides = solidsides + 1;
			}
			if (airsides > 0 && airsides < 4 && solidsides > 1 && airsides < 4) {
				if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("birch_forest")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_birch_forest"))
						|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("cherry_grove")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("flower_forest"))) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.ANDESITE.defaultBlockState(), 3);
				} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_taiga"))
						|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("ice_spikes"))) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.PACKED_ICE.defaultBlockState(), 3);
				} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.SMOOTH_SANDSTONE.defaultBlockState(), 3);
				} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("windswept_gravelly_hills")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("windswept_hills"))
						|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("windswept_forest"))) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.STONE.defaultBlockState(), 3);
				} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("jungle")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("sparse_jungle"))
						|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))
						|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))) {
					if (Math.random() < 0.65) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.COBBLESTONE.defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
					}
				} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("plains"))) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.GRANITE.defaultBlockState(), 3);
				} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("eroded_badlands"))
						|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("wooded_badlands")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))
						|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("windswept_savanna")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna_plateau"))) {
					if (Math.random() < 0.65) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.TERRACOTTA.defaultBlockState(), 3);
					} else if (Math.random() < 0.65) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.ORANGE_TERRACOTTA.defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.WHITE_TERRACOTTA.defaultBlockState(), 3);
					}
				} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("forest"))) {
					if (Math.random() < 0.65) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.STONE.defaultBlockState(), 3);
					} else if (Math.random() < 0.9) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.GRANITE.defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.COPPER_ORE.defaultBlockState(), 3);
					}
				} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest"))) {
					if (Math.random() < 0.65) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.DEEPSLATE.defaultBlockState(), 3);
					} else if (Math.random() < 0.65) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.COBBLED_DEEPSLATE.defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.INFESTED_DEEPSLATE.defaultBlockState(), 3);
					}
				} else if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER) {
					if (world.isEmptyBlock(BlockPos.containing(x, y - 1, z))) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.GLOWSTONE.defaultBlockState(), 3);
					} else {
						if (Math.random() < 0.75) {
							world.setBlock(BlockPos.containing(x, y, z), Blocks.BLACKSTONE.defaultBlockState(), 3);
						} else {
							world.setBlock(BlockPos.containing(x, y, z), Blocks.GILDED_BLACKSTONE.defaultBlockState(), 3);
						}
					}
				}
			}
		}
	}
}
