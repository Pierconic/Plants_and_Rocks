package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class StemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:lush_destruction")))) {
			{
				BlockPos _bp = BlockPos.containing(x + 1, y + 1, z + 1);
				BlockState _bs = Blocks.OAK_WOOD.defaultBlockState();
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
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z + 1))).is(BlockTags.create(ResourceLocation.parse("minecraft:moss_replaceable")))) {
			{
				BlockPos _bp = BlockPos.containing(x + 1, y + 1, z + 1);
				BlockState _bs = Blocks.ROOTED_DIRT.defaultBlockState();
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
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:lush_destruction")))) {
			{
				BlockPos _bp = BlockPos.containing(x + 1, y, z + 1);
				BlockState _bs = Blocks.OAK_WOOD.defaultBlockState();
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
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).is(BlockTags.create(ResourceLocation.parse("minecraft:moss_replaceable")))) {
			{
				BlockPos _bp = BlockPos.containing(x + 1, y, z + 1);
				BlockState _bs = Blocks.ROOTED_DIRT.defaultBlockState();
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
		if ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:lush_destruction")))) {
			{
				BlockPos _bp = BlockPos.containing(x + 1, y - 1, z + 1);
				BlockState _bs = Blocks.OAK_WOOD.defaultBlockState();
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
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z + 1))).is(BlockTags.create(ResourceLocation.parse("minecraft:moss_replaceable")))) {
			{
				BlockPos _bp = BlockPos.containing(x + 1, y - 1, z + 1);
				BlockState _bs = Blocks.ROOTED_DIRT.defaultBlockState();
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
		if ((world.getBlockState(BlockPos.containing(x + 1, y - 2, z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:lush_destruction")))) {
			{
				BlockPos _bp = BlockPos.containing(x + 1, y - 2, z + 1);
				BlockState _bs = Blocks.OAK_WOOD.defaultBlockState();
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
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y - 2, z + 1))).is(BlockTags.create(ResourceLocation.parse("minecraft:moss_replaceable")))) {
			{
				BlockPos _bp = BlockPos.containing(x + 1, y - 2, z + 1);
				BlockState _bs = Blocks.ROOTED_DIRT.defaultBlockState();
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
		if ((world.getBlockState(BlockPos.containing(x + 1, y - 3, z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:lush_destruction")))) {
			{
				BlockPos _bp = BlockPos.containing(x + 1, y - 3, z + 1);
				BlockState _bs = Blocks.OAK_WOOD.defaultBlockState();
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
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y - 3, z + 1))).is(BlockTags.create(ResourceLocation.parse("minecraft:moss_replaceable")))) {
			{
				BlockPos _bp = BlockPos.containing(x + 1, y - 3, z + 1);
				BlockState _bs = Blocks.ROOTED_DIRT.defaultBlockState();
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
		if ((world.getBlockState(BlockPos.containing(x + 1, y - 4, z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:lush_destruction")))) {
			{
				BlockPos _bp = BlockPos.containing(x + 1, y - 4, z + 1);
				BlockState _bs = Blocks.OAK_WOOD.defaultBlockState();
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
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y - 4, z + 1))).is(BlockTags.create(ResourceLocation.parse("minecraft:moss_replaceable")))) {
			{
				BlockPos _bp = BlockPos.containing(x + 1, y - 4, z + 1);
				BlockState _bs = Blocks.ROOTED_DIRT.defaultBlockState();
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
