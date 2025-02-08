package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class GravelSmallSpreaderProcedure {
	public static void execute(LevelAccessor world, double x, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -4;
		for (int index0 = 0; index0 < 9; index0++) {
			sz = -4;
			for (int index1 = 0; index1 < 9; index1++) {
				if (Math.random() < 0.7 && Math.abs(sx) < 4 && Math.abs(sz) < 4
						&& (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)) - 1, z + sz))).getBlock() == Blocks.GRASS_BLOCK) {
					world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)) - 1, z + sz), Blocks.GRAVEL.defaultBlockState(), 3);
				} else if (Math.random() < 0.35 && (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)) - 1, z + sz))).getBlock() == Blocks.GRASS_BLOCK) {
					world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)) - 1, z + sz), Blocks.GRAVEL.defaultBlockState(), 3);
					if (Math.random() < 0.045 && world.getBiome(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz)).is(ResourceLocation.parse("cherry_grove"))) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands()
									.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)) + 1), (z + sz)), Vec2.ZERO, _level,
											4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "/place feature minecraft:bamboo_no_podzol ~ ~ ~");
					}
				}
				sz = sz + 1;
			}
			sx = sx + 1;
		}
	}
}
