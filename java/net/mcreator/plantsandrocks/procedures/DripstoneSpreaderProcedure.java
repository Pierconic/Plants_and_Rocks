package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class DripstoneSpreaderProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -5;
		for (int index0 = 0; index0 < 10; index0++) {
			sy = -5;
			for (int index1 = 0; index1 < 10; index1++) {
				sz = -5;
				for (int index2 = 0; index2 < 10; index2++) {
					if (Math.random() < 0.25) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("minecraft:mineable/pickaxe")))
								&& !((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.POINTED_DRIPSTONE)) {
							{
								BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
								BlockState _bs = Blocks.DRIPSTONE_BLOCK.defaultBlockState();
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
							if (Math.random() < 0.6 && world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz))) {
								{
									BlockPos _bp = BlockPos.containing(x + sx, y + sy + 1, z + sz);
									BlockState _bs = Blocks.POINTED_DRIPSTONE.defaultBlockState();
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
