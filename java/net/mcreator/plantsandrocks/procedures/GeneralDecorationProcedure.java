package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class GeneralDecorationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double sy2 = 0;
		double number = 0;
		boolean found = false;
		boolean ocean = false;
		if ((world.getBlockState(BlockPos.containing(x - 0, y, z - 1))).getBlock() == Blocks.SNOW || (world.getBlockState(BlockPos.containing(x - 0, y, z + 1))).getBlock() == Blocks.SNOW
				|| (world.getBlockState(BlockPos.containing(x - 1, y, z + 0))).getBlock() == Blocks.SNOW || (world.getBlockState(BlockPos.containing(x + 1, y, z + 0))).getBlock() == Blocks.SNOW) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.SNOW.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x - 0, y, z - 1))).getBlock() == Blocks.ICE || (world.getBlockState(BlockPos.containing(x - 0, y, z + 1))).getBlock() == Blocks.ICE
				|| (world.getBlockState(BlockPos.containing(x - 1, y, z + 0))).getBlock() == Blocks.ICE || (world.getBlockState(BlockPos.containing(x + 1, y, z + 0))).getBlock() == Blocks.ICE) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.ICE.defaultBlockState(), 3);
		} else {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
		if (world.getBiome(BlockPos.containing(x + 18, y, z)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:briney")))
				|| world.getBiome(BlockPos.containing(x - 18, y, z)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:briney")))
				|| world.getBiome(BlockPos.containing(x, y, z - 18)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:briney")))
				|| world.getBiome(BlockPos.containing(x, y, z + 18)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:briney")))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:briney")))) {
			ocean = true;
		}
		sx = 0;
		for (int index0 = 0; index0 < 16; index0++) {
			sy = -4;
			for (int index1 = 0; index1 < 9; index1++) {
				sz = 0;
				for (int index2 = 0; index2 < 16; index2++) {
					number = Mth.nextInt(RandomSource.create(), 1, 10);
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.BIRCH_LOG) {
						if (world.isEmptyBlock(BlockPos.containing(x + sx + 1, y + sy, z + sz)) && world.isEmptyBlock(BlockPos.containing(x + sx + 1, (y + sy) - 1, z + sz)) && world.isEmptyBlock(BlockPos.containing(x + sx + 1, y + sy, z + sz + 1))
								&& world.isEmptyBlock(BlockPos.containing(x + sx + 1, y + sy, (z + sz) - 1)) && number >= 1 && number <= 4) {
							if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.BIRCH_LOG && (world.getBlockState(BlockPos.containing(x + sx, y + sy + 2, z + sz))).getBlock() == Blocks.BIRCH_LOG
									&& (world.getBlockState(BlockPos.containing(x + sx, y + sy + 3, z + sz))).getBlock() == Blocks.BIRCH_LOG && (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).getBlock() == Blocks.BIRCH_LOG
									&& (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 2, z + sz))).getBlock() == Blocks.BIRCH_LOG && (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 3, z + sz))).getBlock() == Blocks.BIRCH_LOG
									&& number == 1) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx + 1), (y + sy), (z + sz)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"setblock ~ ~ ~ birch_log[axis=x]");
							} else {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx + 1), (y + sy), (z + sz)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"setblock ~ ~ ~ glow_lichen[west=true]");
							}
						} else if (world.isEmptyBlock(BlockPos.containing((x + sx) - 1, y + sy, z + sz)) && world.isEmptyBlock(BlockPos.containing((x + sx) - 1, (y + sy) - 1, z + sz))
								&& world.isEmptyBlock(BlockPos.containing((x + sx) - 1, y + sy, z + sz + 1)) && world.isEmptyBlock(BlockPos.containing((x + sx) - 1, y + sy, (z + sz) - 1)) && number >= 4 && number <= 7) {
							if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.BIRCH_LOG && (world.getBlockState(BlockPos.containing(x + sx, y + sy + 2, z + sz))).getBlock() == Blocks.BIRCH_LOG
									&& (world.getBlockState(BlockPos.containing(x + sx, y + sy + 3, z + sz))).getBlock() == Blocks.BIRCH_LOG && (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).getBlock() == Blocks.BIRCH_LOG
									&& (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 2, z + sz))).getBlock() == Blocks.BIRCH_LOG && (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 3, z + sz))).getBlock() == Blocks.BIRCH_LOG
									&& number == 4) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(((x + sx) - 1), (y + sy), (z + sz)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"setblock ~ ~ ~ birch_log[axis=x]");
							} else {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(((x + sx) - 1), (y + sy), (z + sz)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"setblock ~ ~ ~ glow_lichen[east=true]");
							}
						} else if (world.isEmptyBlock(BlockPos.containing(x + sx, y + sy, (z + sz) - 1)) && world.isEmptyBlock(BlockPos.containing(x + sx, (y + sy) - 1, (z + sz) - 1))
								&& world.isEmptyBlock(BlockPos.containing((x + sx) - 1, y + sy, (z + sz) - 1)) && world.isEmptyBlock(BlockPos.containing(x + sx + 1, y + sy, (z + sz) - 1)) && number >= 7 && number <= 9) {
							if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.BIRCH_LOG && (world.getBlockState(BlockPos.containing(x + sx, y + sy + 2, z + sz))).getBlock() == Blocks.BIRCH_LOG
									&& (world.getBlockState(BlockPos.containing(x + sx, y + sy + 3, z + sz))).getBlock() == Blocks.BIRCH_LOG && (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).getBlock() == Blocks.BIRCH_LOG
									&& (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 2, z + sz))).getBlock() == Blocks.BIRCH_LOG && (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 3, z + sz))).getBlock() == Blocks.BIRCH_LOG
									&& number == 4) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx), (y + sy), ((z + sz) - 1)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"setblock ~ ~ ~ birch_log[axis=z]");
							} else {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx), (y + sy), ((z + sz) - 1)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"setblock ~ ~ ~ glow_lichen[south=true]");
							}
						} else if (world.isEmptyBlock(BlockPos.containing(x + sx, y + sy, z + sz + 1)) && world.isEmptyBlock(BlockPos.containing(x + sx, (y + sy) - 1, z + sz + 1))
								&& world.isEmptyBlock(BlockPos.containing((x + sx) - 1, y + sy, z + sz + 1)) && world.isEmptyBlock(BlockPos.containing(x + sx + 1, y + sy, z + sz + 1)) && (number >= 9 && number <= 10 || number == 1)) {
							if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.BIRCH_LOG && (world.getBlockState(BlockPos.containing(x + sx, y + sy + 2, z + sz))).getBlock() == Blocks.BIRCH_LOG
									&& (world.getBlockState(BlockPos.containing(x + sx, y + sy + 3, z + sz))).getBlock() == Blocks.BIRCH_LOG && (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).getBlock() == Blocks.BIRCH_LOG
									&& (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 2, z + sz))).getBlock() == Blocks.BIRCH_LOG && (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 3, z + sz))).getBlock() == Blocks.BIRCH_LOG
									&& number == 9) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx), (y + sy), (z + sz + 1)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"setblock ~ ~ ~ birch_log[axis=z]");
							} else {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx), (y + sy), (z + sz + 1)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"setblock ~ ~ ~ glow_lichen[north=true]");
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.DARK_OAK_LOG || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.DARK_OAK_WOOD
							|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.OAK_LOG) {
						if (world.isEmptyBlock(BlockPos.containing(x + sx + 1, y + sy, z + sz)) && world.isEmptyBlock(BlockPos.containing(x + sx + 1, (y + sy) - 1, z + sz)) && world.isEmptyBlock(BlockPos.containing(x + sx + 1, y + sy, z + sz + 1))
								&& world.isEmptyBlock(BlockPos.containing(x + sx + 1, y + sy, (z + sz) - 1)) && (number >= 1 || number <= 3)) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx + 1), (y + sy), (z + sz)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"setblock ~ ~ ~ vine[west=true]");
						} else if (world.isEmptyBlock(BlockPos.containing((x + sx) - 1, y + sy, z + sz)) && world.isEmptyBlock(BlockPos.containing((x + sx) - 1, y + sy + 1, z + sz))
								&& world.isEmptyBlock(BlockPos.containing((x + sx) - 1, y + sy, z + sz + 1)) && world.isEmptyBlock(BlockPos.containing((x + sx) - 1, y + sy, (z + sz) - 1)) && number >= 4 && number <= 6) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(((x + sx) - 1), (y + sy), (z + sz)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"setblock ~ ~ ~ vine[east=true]");
						} else if (world.isEmptyBlock(BlockPos.containing(x + sx, y + sy, (z + sz) - 1)) && world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, (z + sz) - 1))
								&& world.isEmptyBlock(BlockPos.containing((x + sx) - 1, y + sy, (z + sz) - 1)) && world.isEmptyBlock(BlockPos.containing(x + sx + 1, y + sy, (z + sz) - 1)) && number >= 7 && number <= 8) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx), (y + sy), ((z + sz) - 1)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"setblock ~ ~ ~ vine[south=true]");
						} else if (world.isEmptyBlock(BlockPos.containing(x + sx, y + sy, z + sz + 1)) && world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz + 1))
								&& world.isEmptyBlock(BlockPos.containing((x + sx) - 1, y + sy, z + sz + 1)) && world.isEmptyBlock(BlockPos.containing(x + sx + 1, y + sy, z + sz + 1)) && number >= 9 && number <= 10) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx), (y + sy), (z + sz + 1)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"setblock ~ ~ ~ vine[north=true]");
						}
					} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SPRUCE_LOG) {
						if (world.isEmptyBlock(BlockPos.containing(x + sx + 1, y + sy, z + sz)) && world.isEmptyBlock(BlockPos.containing(x + sx + 1, (y + sy) - 1, z + sz)) && world.isEmptyBlock(BlockPos.containing(x + sx + 1, y + sy, z + sz + 1))
								&& world.isEmptyBlock(BlockPos.containing(x + sx + 1, y + sy, (z + sz) - 1)) && number == 1) {
							if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SPRUCE_LOG && (world.getBlockState(BlockPos.containing(x + sx, y + sy + 2, z + sz))).getBlock() == Blocks.SPRUCE_LOG
									&& (world.getBlockState(BlockPos.containing(x + sx, y + sy + 3, z + sz))).getBlock() == Blocks.SPRUCE_LOG && (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).getBlock() == Blocks.SPRUCE_LOG
									&& (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 2, z + sz))).getBlock() == Blocks.SPRUCE_LOG
									&& (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 3, z + sz))).getBlock() == Blocks.SPRUCE_LOG) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx + 1), (y + sy), (z + sz)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"setblock ~ ~ ~ spruce_log[axis=x]");
							}
						} else if (world.isEmptyBlock(BlockPos.containing((x + sx) - 1, y + sy, z + sz)) && world.isEmptyBlock(BlockPos.containing((x + sx) - 1, (y + sy) - 1, z + sz))
								&& world.isEmptyBlock(BlockPos.containing((x + sx) - 1, y + sy, z + sz + 1)) && world.isEmptyBlock(BlockPos.containing((x + sx) - 1, y + sy, (z + sz) - 1)) && number == 2) {
							if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SPRUCE_LOG && (world.getBlockState(BlockPos.containing(x + sx, y + sy + 2, z + sz))).getBlock() == Blocks.SPRUCE_LOG
									&& (world.getBlockState(BlockPos.containing(x + sx, y + sy + 3, z + sz))).getBlock() == Blocks.SPRUCE_LOG && (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).getBlock() == Blocks.SPRUCE_LOG
									&& (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 2, z + sz))).getBlock() == Blocks.SPRUCE_LOG
									&& (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 3, z + sz))).getBlock() == Blocks.SPRUCE_LOG) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(((x + sx) - 1), (y + sy), (z + sz)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"setblock ~ ~ ~ spruce_log[axis=x]");
							}
						} else if (world.isEmptyBlock(BlockPos.containing(x + sx, y + sy, (z + sz) - 1)) && world.isEmptyBlock(BlockPos.containing(x + sx, (y + sy) - 1, (z + sz) - 1))
								&& world.isEmptyBlock(BlockPos.containing((x + sx) - 1, y + sy, (z + sz) - 1)) && world.isEmptyBlock(BlockPos.containing(x + sx + 1, y + sy, (z + sz) - 1)) && number == 3) {
							if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SPRUCE_LOG && (world.getBlockState(BlockPos.containing(x + sx, y + sy + 2, z + sz))).getBlock() == Blocks.SPRUCE_LOG
									&& (world.getBlockState(BlockPos.containing(x + sx, y + sy + 3, z + sz))).getBlock() == Blocks.SPRUCE_LOG && (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).getBlock() == Blocks.SPRUCE_LOG
									&& (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 2, z + sz))).getBlock() == Blocks.SPRUCE_LOG
									&& (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 3, z + sz))).getBlock() == Blocks.SPRUCE_LOG) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx), (y + sy), ((z + sz) - 1)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"setblock ~ ~ ~ spruce_log[axis=z]");
							}
						} else if (world.isEmptyBlock(BlockPos.containing(x + sx, y + sy, z + sz + 1)) && world.isEmptyBlock(BlockPos.containing(x + sx, (y + sy) - 1, z + sz + 1))
								&& world.isEmptyBlock(BlockPos.containing((x + sx) - 1, y + sy, z + sz + 1)) && world.isEmptyBlock(BlockPos.containing(x + sx + 1, y + sy, z + sz + 1)) && number == 4) {
							if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SPRUCE_LOG && (world.getBlockState(BlockPos.containing(x + sx, y + sy + 2, z + sz))).getBlock() == Blocks.SPRUCE_LOG
									&& (world.getBlockState(BlockPos.containing(x + sx, y + sy + 3, z + sz))).getBlock() == Blocks.SPRUCE_LOG && (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).getBlock() == Blocks.SPRUCE_LOG
									&& (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 2, z + sz))).getBlock() == Blocks.SPRUCE_LOG
									&& (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 3, z + sz))).getBlock() == Blocks.SPRUCE_LOG) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx), (y + sy), (z + sz + 1)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"setblock ~ ~ ~ spruce_log[axis=z]");
							}
						}
					}
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:rootable")))
							&& (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))
							&& ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _getep200
									? (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getValue(_getep200).toString()
									: "").equals("y")) {
						TreeRootSpreadProcedure.execute(world, x + sx, (y + sy) - 1, z + sz);
						DownRootProcedure.execute(world, x + sx, (y + sy) - 1, z + sz);
					}
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.MUSHROOM_STEM
							&& (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
						ShroomPatchProcedure.execute(world, x + sx, (y + sy) - 1, z + sz);
					}
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:slaby"))) && world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz))) {
						SlabAdditionsProcedure.execute(world, x + sx, y + sy, z + sz);
					}
					if (world.getBiome(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz))
							.is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:podzol_floor")))) {
						if (Math.random() < 0.04 && (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.GRASS_BLOCK) {
							if (Math.random() < 0.7) {
								PodzolSmallSpreaderProcedure.execute(world, x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz);
							} else {
								CoarseSmallSpreaderProcedure.execute(world, x + sx, z + sz);
							}
						}
					}
					if (world.getBiome(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz))
							.is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:coarse_floor")))) {
						if (Math.random() < 0.04
								&& ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.GRASS_BLOCK || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.MYCELIUM)) {
							CoarseSmallSpreaderProcedure.execute(world, x + sx, z + sz);
						}
					}
					if (world.getBiome(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:mud_floor")))) {
						if (Math.random() < 0.04 && (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.GRASS_BLOCK) {
							MudSmallSpreaderProcedure.execute(world, x + sx, z + sz);
						}
					}
					if (world.getBiome(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz))
							.is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:gravel_floor")))) {
						if (Math.random() < 0.04 && (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.GRASS_BLOCK
								&& !world.isEmptyBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)) - 1, z + sz))) {
							GravelSmallSpreaderProcedure.execute(world, x + sx, z + sz);
						}
					}
					if (world.getBiome(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz))
							.is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:shroom_floor")))) {
						if ((world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest")) && Math.random() < 0.005
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("mushroom_fields")) && Math.random() < 0.01)
								&& ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.GRASS_BLOCK || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.MYCELIUM)) {
							ShroomPatchProcedure.execute(world, x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz);
						}
					}
					if (world.getBiome(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:moss_floor")))) {
						if (Math.random() < 0.04 && ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SAND || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.MUD
								|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.DIRT)) {
							MossSmallSpreaderProcedure.execute(world, x + sx, z + sz);
						}
					}
					if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("minecraft:is_ocean")))) {
						if (((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.GRAVEL || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SAND) && Math.random() < 0.06) {
							WaterRockGenConditionProcedure.execute(world, x + sx, y + sy, z + sz);
						}
					} else {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable"))) && Math.random() < 0.06) {
							RockGenConditionProcedure.execute(world, x + sx, y + sy, z + sz);
						}
						if (Math.random() < 0.3
								&& (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("windswept_forest"))
										|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("windswept_forest")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("windswept_hills")))
								&& ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.GRAVEL || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SAND)
								&& world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz))) {
							RockGenConditionProcedure.execute(world, x + sx, y + sy, z + sz);
						}
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.WATER && (world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.AIR && !ocean
								&& Math.random() < 0.02) {
							world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.LILY_PAD.defaultBlockState(), 3);
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
