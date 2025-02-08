package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class BlackstoneSpreaderProcedure {
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
					if (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz)).canOcclude()) {
						if (Math.random() < 0.7) {
							{
								BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
								BlockState _bs = Blocks.BLACKSTONE.defaultBlockState();
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
							if (Math.random() < 0.3 && world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz))) {
								world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.BASALT.defaultBlockState(), 3);
							}
						} else if (Math.random() < 0.3) {
							{
								BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
								BlockState _bs = Blocks.GILDED_BLACKSTONE.defaultBlockState();
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
						} else if (Math.random() < 0.2) {
							world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.BASALT.defaultBlockState(), 3);
						}
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		sx = -8;
		for (int index3 = 0; index3 < 16; index3++) {
			sy = -8;
			for (int index4 = 0; index4 < 16; index4++) {
				sz = -8;
				for (int index5 = 0; index5 < 16; index5++) {
					if (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz)).canOcclude() && world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz))) {
						if (Math.random() < 0.016) {
							world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.BASALT.defaultBlockState(), 3);
						} else if (Math.random() < 0.04) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.GILDED_BLACKSTONE.defaultBlockState(), 3);
						} else if (Math.random() < 0.08) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.BLACKSTONE.defaultBlockState(), 3);
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
