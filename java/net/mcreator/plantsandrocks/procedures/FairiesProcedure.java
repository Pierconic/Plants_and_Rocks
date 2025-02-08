package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.plantsandrocks.init.PlantsAndRocksModBlocks;

public class FairiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState type = Blocks.AIR.defaultBlockState();
		boolean found = false;
		double number = 0;
		double size = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		if (Math.random() < 0.65) {
			type = Blocks.BROWN_MUSHROOM.defaultBlockState();
		} else {
			type = Blocks.RED_MUSHROOM.defaultBlockState();
		}
		if (Math.random() < 0.75) {
			world.setBlock(BlockPos.containing(x, y, z), PlantsAndRocksModBlocks.FAIRY_CENTER.get().defaultBlockState(), 3);
			size = 0;
		} else {
			world.setBlock(BlockPos.containing(x, y, z), PlantsAndRocksModBlocks.FAIRY_CENTER_2.get().defaultBlockState(), 3);
			size = 1;
		}
		if ((world.getBlockState(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z), z))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
			world.setBlock(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z), z), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) z), z))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
			world.setBlock(BlockPos.containing(x + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) z), z), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) z), z))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
			world.setBlock(BlockPos.containing(x - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) z), z), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 1)), z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
			world.setBlock(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 1)), z + 1), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 1)), z - 1))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
			world.setBlock(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 1)), z - 1), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z + 1)), z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
			world.setBlock(BlockPos.containing(x + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z + 1)), z + 1), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z - 1)), z - 1))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
			world.setBlock(BlockPos.containing(x + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z - 1)), z - 1), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z + 1)), z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
			world.setBlock(BlockPos.containing(x - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z + 1)), z + 1), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z - 1)), z - 1))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
			world.setBlock(BlockPos.containing(x - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z - 1)), z - 1), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x + 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) z), z))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
			world.setBlock(BlockPos.containing(x + 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) z), z), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x + 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) (z + 1)), z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
			world.setBlock(BlockPos.containing(x + 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) (z + 1)), z + 1), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x + 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) (z - 1)), z - 1))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
			world.setBlock(BlockPos.containing(x + 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) (z - 1)), z - 1), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) z), z))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
			world.setBlock(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) z), z), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z + 1)), z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
			world.setBlock(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z + 1)), z + 1), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - 1)), z - 1))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
			world.setBlock(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - 1)), z - 1), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 2)), z - 2))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
			world.setBlock(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 2)), z - 2), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z - 2)), z - 2))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
			world.setBlock(BlockPos.containing(x - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z - 2)), z - 2), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z - 2)), z - 2))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
			world.setBlock(BlockPos.containing(x + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z - 2)), z - 2), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 2)), z + 2))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
			world.setBlock(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 2)), z + 2), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z + 2)), z + 2))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
			world.setBlock(BlockPos.containing(x - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z + 2)), z + 2), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z + 2)), z + 2))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
			world.setBlock(BlockPos.containing(x + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z + 2)), z + 2), Blocks.AIR.defaultBlockState(), 3);
		}
		if (size == 0) {
			if ((world.getBlockState(BlockPos.containing(x + 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) z) - 1, z))).is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
				world.setBlock(BlockPos.containing(x + 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) z) - 1, z), Blocks.PODZOL.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) z), z), type, 3);
				world.setBlock(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z), z), PlantsAndRocksModBlocks.FAIRY_CENTER.get().defaultBlockState(), 3);
				if (Math.random() < 0.75 && (world.getBlockState(BlockPos.containing(x + 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) (z - 1)) - 1, z - 1)))
						.is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 3), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) (z - 1))), (z - 1)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 3), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) (z - 1))), (z - 1)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if ((world.getBlockState(BlockPos.containing(x - 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) (z - 0)) - 1, z - 0))).is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 3), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) z)), z), Vec2.ZERO, _level,
								4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 3), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) z)), z), Vec2.ZERO, _level,
								4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if (Math.random() < 0.75 && (world.getBlockState(BlockPos.containing(x - 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) (z + 1)) - 1, z + 1)))
						.is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 3), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) (z + 1))), (z + 1)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 3), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) (z + 1))), (z + 1)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if (Math.random() < 0.75 && (world.getBlockState(BlockPos.containing(x - 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) (z + 1)) - 1, z + 1)))
						.is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 3), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) (z - 1))), (z - 1)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 3), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) (z - 1))), (z - 1)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if ((world.getBlockState(BlockPos.containing(x - 0, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 0), (int) (z + 3)) - 1, z + 3))).is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 3))), (z + 3)), Vec2.ZERO, _level,
								4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 3))), (z + 3)), Vec2.ZERO, _level,
								4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if (Math.random() < 0.75 && (world.getBlockState(BlockPos.containing(x + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z + 3)) - 1, z + 3)))
						.is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 1), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z + 3))), (z + 3)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 1), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z + 3))), (z + 3)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if (Math.random() < 0.75 && (world.getBlockState(BlockPos.containing(x - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z + 3)) - 1, z + 3)))
						.is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 1), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z + 3))), (z + 3)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 1), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z + 3))), (z + 3)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if ((world.getBlockState(BlockPos.containing(x - 0, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 0), (int) (z - 3)) - 1, z - 3))).is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 3))), (z - 3)), Vec2.ZERO, _level,
								4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 3))), (z - 3)), Vec2.ZERO, _level,
								4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if (Math.random() < 0.75 && (world.getBlockState(BlockPos.containing(x + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z - 3)) - 1, z - 3)))
						.is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 1), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z - 3))), (z - 3)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 1), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z - 3))), (z - 3)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if (Math.random() < 0.75 && (world.getBlockState(BlockPos.containing(x - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z - 3)) - 1, z - 3)))
						.is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 1), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z - 3))), (z - 3)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 1), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z - 3))), (z - 3)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if (Math.random() < 0.75 && (world.getBlockState(BlockPos.containing(x + 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) (z + 2)) - 1, z + 2)))
						.is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 2), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) (z + 2))), (z + 2)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 2), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) (z + 2))), (z + 2)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if (Math.random() < 0.75 && (world.getBlockState(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z + 2)) - 1, z + 2)))
						.is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 2), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z + 2))), (z + 2)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 2), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z + 2))), (z + 2)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if (Math.random() < 0.75 && (world.getBlockState(BlockPos.containing(x + 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) (z + 2)) - 1, z + 2)))
						.is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 2), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) (z - 2))), (z - 2)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 2), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) (z - 2))), (z - 2)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if (Math.random() < 0.75 && (world.getBlockState(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - 2)) - 1, z - 2)))
						.is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 2), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - 2))), (z - 2)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 2), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - 2))), (z - 2)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
			}
		} else {
			if ((world.getBlockState(BlockPos.containing(x - 0, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 0), (int) (z + 3)), z + 3))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
				world.setBlock(BlockPos.containing(x - 0, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 0), (int) (z + 3)), z + 3), Blocks.AIR.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z + 3)), z + 3))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
				world.setBlock(BlockPos.containing(x + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z + 3)), z + 3), Blocks.AIR.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z + 3)), z + 3))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
				world.setBlock(BlockPos.containing(x - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z + 3)), z + 3), Blocks.AIR.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x - 0, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 0), (int) (z - 3)), z - 3))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
				world.setBlock(BlockPos.containing(x - 0, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 0), (int) (z - 3)), z - 3), Blocks.AIR.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z - 3)), z - 3))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
				world.setBlock(BlockPos.containing(x + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z - 3)), z - 3), Blocks.AIR.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z - 3)), z - 3))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
				world.setBlock(BlockPos.containing(x - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z - 3)), z - 3), Blocks.AIR.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x - 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) (z + 0)), z + 0))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
				world.setBlock(BlockPos.containing(x - 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) (z + 0)), z + 0), Blocks.AIR.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x - 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) (z + 1)), z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
				world.setBlock(BlockPos.containing(x - 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) (z + 1)), z + 1), Blocks.AIR.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x - 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) (z - 1)), z - 1))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
				world.setBlock(BlockPos.containing(x - 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) (z - 1)), z - 1), Blocks.AIR.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x + 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) (z + 0)), z + 0))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
				world.setBlock(BlockPos.containing(x + 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) (z + 0)), z + 0), Blocks.AIR.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x + 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) (z + 1)), z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
				world.setBlock(BlockPos.containing(x + 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) (z + 1)), z + 1), Blocks.AIR.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x + 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) (z - 1)), z - 1))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
				world.setBlock(BlockPos.containing(x + 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) (z - 1)), z - 1), Blocks.AIR.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x + 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) (z + 2)), z + 2))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
				world.setBlock(BlockPos.containing(x + 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) (z + 2)), z + 2), Blocks.AIR.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x + 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) (z - 2)), z - 2))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
				world.setBlock(BlockPos.containing(x + 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) (z - 2)), z - 2), Blocks.AIR.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z + 2)), z + 2))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
				world.setBlock(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z + 2)), z + 2), Blocks.AIR.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - 2)), z - 2))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
				world.setBlock(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - 2)), z - 2), Blocks.AIR.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x + 4, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 4), (int) (z - 0)) - 1, z - 0))).is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 4), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 4), (int) (z - 0))), (z - 0)), Vec2.ZERO,
							_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 4), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 4), (int) (z - 0))), (z - 0)), Vec2.ZERO,
							_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				world.setBlock(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z), z), PlantsAndRocksModBlocks.FAIRY_CENTER_2.get().defaultBlockState(), 3);
				if (Math.random() < 0.75 && (world.getBlockState(BlockPos.containing(x + 4, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 4), (int) (z - 1)) - 1, z - 1)))
						.is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 4), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 4), (int) (z - 1))), (z - 1)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 4), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 4), (int) (z - 1))), (z - 1)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if ((world.getBlockState(BlockPos.containing(x - 4, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 4), (int) (z - 0)) - 1, z - 0))).is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 4), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 4), (int) (z - 0))), (z - 0)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 4), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 4), (int) (z - 0))), (z - 0)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if (Math.random() < 0.75 && (world.getBlockState(BlockPos.containing(x - 4, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 4), (int) (z + 1)) - 1, z + 1)))
						.is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 4), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 4), (int) (z + 1))), (z + 1)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 4), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 4), (int) (z + 1))), (z + 1)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if (Math.random() < 0.75 && (world.getBlockState(BlockPos.containing(x - 4, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 4), (int) (z - 1)) - 1, z - 1)))
						.is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 4), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 4), (int) (z - 1))), (z - 1)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 4), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 4), (int) (z - 1))), (z - 1)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if ((world.getBlockState(BlockPos.containing(x - 0, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 0), (int) (z + 4)) - 1, z + 4))).is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 0), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 0), (int) (z + 4))), (z + 4)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 0), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 0), (int) (z + 4))), (z + 4)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if (Math.random() < 0.75 && (world.getBlockState(BlockPos.containing(x + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z + 4)) - 1, z + 4)))
						.is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 1), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z + 4))), (z + 4)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 1), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z + 4))), (z + 4)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if (Math.random() < 0.75 && (world.getBlockState(BlockPos.containing(x - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z + 4)) - 1, z + 4)))
						.is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 1), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z + 4))), (z + 4)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 1), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z + 4))), (z + 4)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if ((world.getBlockState(BlockPos.containing(x - 0, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 0), (int) (z - 4)) - 1, z - 4))).is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 0), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 0), (int) (z - 4))), (z - 4)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 0), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 0), (int) (z - 4))), (z - 4)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if (Math.random() < 0.75 && (world.getBlockState(BlockPos.containing(x + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z - 4)) - 1, z - 4)))
						.is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 1), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z - 4))), (z - 4)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 1), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z - 4))), (z - 4)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if (Math.random() < 0.75 && (world.getBlockState(BlockPos.containing(x - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z - 4)) - 1, z - 4)))
						.is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 1), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z - 4))), (z - 4)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 1), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z - 4))), (z - 4)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if (Math.random() < 0.75 && (world.getBlockState(BlockPos.containing(x + 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) (z + 3)) - 1, z + 3)))
						.is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 3), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) (z + 3))), (z + 3)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 3), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) (z + 3))), (z + 3)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if (Math.random() < 0.75 && (world.getBlockState(BlockPos.containing(x - 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) (z + 3)) - 1, z + 3)))
						.is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 3), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) (z + 3))), (z + 3)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 3), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) (z + 3))), (z + 3)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if (Math.random() < 0.75 && (world.getBlockState(BlockPos.containing(x + 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) (z - 3)) - 1, z - 3)))
						.is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 3), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) (z - 3))), (z - 3)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 3), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) (z - 3))), (z - 3)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if (Math.random() < 0.75 && (world.getBlockState(BlockPos.containing(x - 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) (z - 3)) - 1, z - 3)))
						.is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 3), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) (z - 3))), (z - 3)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 3), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) (z - 3))), (z - 3)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if (Math.random() < 0.75 && (world.getBlockState(BlockPos.containing(x + 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) (z + 3)) - 1, z + 3)))
						.is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 2), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) (z + 3))), (z + 3)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 2), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) (z + 3))), (z + 3)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if (Math.random() < 0.75 && (world.getBlockState(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z + 3)) - 1, z + 3)))
						.is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 2), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z + 3))), (z + 3)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 2), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z + 3))), (z + 3)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if (Math.random() < 0.75 && (world.getBlockState(BlockPos.containing(x + 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) (z - 3)) - 1, z - 3)))
						.is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 2), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) (z - 3))), (z - 3)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 2), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) (z - 3))), (z - 3)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if (Math.random() < 0.75 && (world.getBlockState(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - 3)) - 1, z - 3)))
						.is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 2), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - 3))), (z - 3)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 2), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - 3))), (z - 3)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if (Math.random() < 0.75 && (world.getBlockState(BlockPos.containing(x + 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) (z + 2)) - 1, z + 2)))
						.is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 3), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) (z + 2))), (z + 2)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 3), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) (z + 2))), (z + 2)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if (Math.random() < 0.75 && (world.getBlockState(BlockPos.containing(x - 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) (z + 2)) - 1, z + 2)))
						.is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 3), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) (z + 2))), (z + 2)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 3), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) (z + 2))), (z + 2)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if (Math.random() < 0.75 && (world.getBlockState(BlockPos.containing(x + 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) (z - 2)) - 1, z - 2)))
						.is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 3), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) (z - 2))), (z - 2)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 3), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) (z - 2))), (z - 2)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
				if (Math.random() < 0.75 && (world.getBlockState(BlockPos.containing(x - 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) (z - 2)) - 1, z - 2)))
						.is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 3), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) (z - 2))), (z - 2)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~-1 ~ podzol");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 3), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) (z - 2))), (z - 2)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ brown_mushroom");
				}
			}
		}
		if (type.getBlock() == Blocks.RED_MUSHROOM) {
			sx = -6;
			found = false;
			for (int index0 = 0; index0 < 12; index0++) {
				sz = -6;
				for (int index1 = 0; index1 < 12; index1++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz))).getBlock() == Blocks.BROWN_MUSHROOM) {
						{
							BlockPos _bp = BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz);
							BlockState _bs = Blocks.RED_MUSHROOM.defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					sz = sz + 1;
				}
				sx = sx + 1;
			}
		}
	}
}
