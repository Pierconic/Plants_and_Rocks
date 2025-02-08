package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class VineSpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double number = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -6;
		for (int index0 = 0; index0 < 12; index0++) {
			sy = -6;
			for (int index1 = 0; index1 < 12; index1++) {
				sz = -6;
				for (int index2 = 0; index2 < 12; index2++) {
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
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
	}
}
