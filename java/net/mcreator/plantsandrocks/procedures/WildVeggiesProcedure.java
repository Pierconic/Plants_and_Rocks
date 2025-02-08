package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class WildVeggiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		sx = -3;
		for (int index0 = 0; index0 < 6; index0++) {
			sy = -3;
			for (int index1 = 0; index1 < 6; index1++) {
				sz = -3;
				for (int index2 = 0; index2 < 6; index2++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:podzol_replaceable")))
							&& (world.isEmptyBlock(BlockPos.containing(x + sx, y + sy, z + sz)) || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SNOW) && Math.random() < 0.1) {
						if (world.getBiome(BlockPos.containing(x + sx, y + sy, z + sz)).is(ResourceLocation.parse("snowy_taiga")) || world.getBiome(BlockPos.containing(x + sx, y + sy, z + sz)).is(ResourceLocation.parse("grove"))
								|| world.getBiome(BlockPos.containing(x + sx, y + sy, z + sz)).is(ResourceLocation.parse("snowy_plains")) || world.getBiome(BlockPos.containing(x + sx, y + sy, z + sz)).is(ResourceLocation.parse("snowy_slopes"))) {
							world.setBlock(BlockPos.containing(x + sx, (y + sy) - 1, z + sz), Blocks.FARMLAND.defaultBlockState(), 3);
							if (Math.random() < 0.25) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx), (y + sy), (z + sz)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"/setblock ~ ~ ~ beetroots[age=2]");
							} else if (Math.random() < 0.5) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx), (y + sy), (z + sz)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"/setblock ~ ~ ~ beetroots[age=3]");
							} else {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx), (y + sy), (z + sz)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"/setblock ~ ~ ~ beetroots[age=1]");
							}
						} else {
							world.setBlock(BlockPos.containing(x + sx, (y + sy) - 1, z + sz), Blocks.FARMLAND.defaultBlockState(), 3);
							if (Math.random() < 0.25) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx), (y + sy), (z + sz)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"/setblock ~ ~ ~ potatoes[age=7]");
							} else if (Math.random() < 0.5) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx), (y + sy), (z + sz)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"/setblock ~ ~ ~ potatoes[age=5]");
							} else {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx), (y + sy), (z + sz)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"/setblock ~ ~ ~ potatoes[age=3]");
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
