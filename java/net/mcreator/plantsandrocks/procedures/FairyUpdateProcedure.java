package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.plantsandrocks.PlantsAndRocksMod;

import java.util.List;
import java.util.Comparator;

public class FairyUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState FairyType = Blocks.AIR.defaultBlockState();
		if ((world.getBlockState(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 3)), z + 3))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))) {
			FairyType = (world.getBlockState(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 3)), z + 3)));
			if ((world.getBlockState(BlockPos.containing(x + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z + 3)) + 0, z + 3))).getBlock() == FairyType.getBlock()
					&& (world.getBlockState(BlockPos.containing(x - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z + 3)) + 0, z + 3))).getBlock() == FairyType.getBlock()
					&& (world.getBlockState(BlockPos.containing(x + 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) z) + 0, z))).getBlock() == FairyType.getBlock()
					&& (world.getBlockState(BlockPos.containing(x + 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) (z - 1)) + 0, z - 1))).getBlock() == FairyType.getBlock()
					&& (world.getBlockState(BlockPos.containing(x + 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) (z + 1)) + 0, z + 1))).getBlock() == FairyType.getBlock()
					&& (world.getBlockState(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 3)) + 0, z - 3))).getBlock() == FairyType.getBlock()
					&& (world.getBlockState(BlockPos.containing(x + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z - 3)) + 0, z - 3))).getBlock() == FairyType.getBlock()
					&& (world.getBlockState(BlockPos.containing(x - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z - 3)) + 0, z - 3))).getBlock() == FairyType.getBlock()
					&& (world.getBlockState(BlockPos.containing(x - 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) z) + 0, z))).getBlock() == FairyType.getBlock()
					&& (world.getBlockState(BlockPos.containing(x - 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) (z + 1)) + 0, z + 1))).getBlock() == FairyType.getBlock()
					&& (world.getBlockState(BlockPos.containing(x - 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) (z - 1)) + 0, z - 1))).getBlock() == FairyType.getBlock()
					&& (world.getBlockState(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - 2)) + 0, z - 2))).getBlock() == FairyType.getBlock()
					&& (world.getBlockState(BlockPos.containing(x + 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) (z + 2)) + 0, z + 2))).getBlock() == FairyType.getBlock()
					&& (world.getBlockState(BlockPos.containing(x + 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) (z - 2)) + 0, z - 2))).getBlock() == FairyType.getBlock()
					&& (world.getBlockState(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z + 2)) + 0, z + 2))).getBlock() == FairyType.getBlock()) {
				if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 21, 21, 21), e -> true).isEmpty()) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 4, 8); index0++) {
						if (world instanceof ServerLevel _level)
							_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 2));
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.illusioner.cast_spell")), SoundSource.NEUTRAL, 1,
									(float) Mth.nextDouble(RandomSource.create(), 0.8, 1.2));
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.illusioner.cast_spell")), SoundSource.NEUTRAL, 1, (float) Mth.nextDouble(RandomSource.create(), 0.8, 1.2), false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SOUL, (x + 3), y, z, 4, 0.1, 0.1, 0.1, 0.1);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SOUL, (x + 3), y, (z - 1), 4, 0.1, 0.1, 0.1, 0.1);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SOUL, (x + 3), y, (z + 1), 4, 0.1, 0.1, 0.1, 0.1);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SOUL, (x - 3), y, z, 4, 0.1, 0.1, 0.1, 0.1);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SOUL, (x - 3), y, (z - 1), 4, 0.1, 0.1, 0.1, 0.1);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SOUL, (x - 3), y, (z + 1), 4, 0.1, 0.1, 0.1, 0.1);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SOUL, x, y, (z + 3), 4, 0.1, 0.1, 0.1, 0.1);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SOUL, (x + 1), y, (z + 3), 4, 0.1, 0.1, 0.1, 0.1);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SOUL, (x - 1), y, (z + 3), 4, 0.1, 0.1, 0.1, 0.1);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SOUL, x, y, (z - 3), 4, 0.1, 0.1, 0.1, 0.1);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SOUL, (x + 1), y, (z - 3), 4, 0.1, 0.1, 0.1, 0.1);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SOUL, (x - 1), y, (z - 3), 4, 0.1, 0.1, 0.1, 0.1);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SOUL, (x + 2), y, (z - 2), 4, 0.1, 0.1, 0.1, 0.1);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SOUL, (x - 2), y, (z + 2), 4, 0.1, 0.1, 0.1, 0.1);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SOUL, (x - 2), y, (z - 2), 4, 0.1, 0.1, 0.1, 0.1);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SOUL, (x + 2), y, (z + 2), 4, 0.1, 0.1, 0.1, 0.1);
					if (Blocks.BROWN_MUSHROOM == FairyType.getBlock() || Blocks.RED_MUSHROOM == FairyType.getBlock()) {
						PlantsAndRocksMod.queueServerWork(10, () -> {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.ALLAY.spawn(_level, BlockPos.containing(x + 0.5, y, z + 0.5), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
								}
							}
						});
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.allay.ambient_with_item")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.allay.ambient_with_item")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					} else if (Blocks.CRIMSON_FUNGUS == FairyType.getBlock() || Blocks.WARPED_FUNGUS == FairyType.getBlock()) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(21 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								entityiterator.igniteForSeconds(6);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.vex.ambient")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.vex.ambient")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					} else if (Blocks.WITHER_ROSE == FairyType.getBlock()) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(21 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, Mth.nextInt(RandomSource.create(), 60, 120), 0));
							}
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = EntityType.VEX.spawn(_level, BlockPos.containing(x + 0.5, y, z + 0.5), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.vex.ambient")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.vex.ambient")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					} else if (Blocks.DANDELION == FairyType.getBlock() || Blocks.BLUE_ORCHID == FairyType.getBlock()) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(21 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.SATURATION, Mth.nextInt(RandomSource.create(), 1200, 3600), 0));
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.allay.ambient_with_item")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.allay.ambient_with_item")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					} else if (Blocks.POPPY == FairyType.getBlock() || Blocks.TORCHFLOWER == FairyType.getBlock()) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(21 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, Mth.nextInt(RandomSource.create(), 1200, 3600), 0));
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.allay.ambient_with_item")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.allay.ambient_with_item")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					} else if (Blocks.ALLIUM == FairyType.getBlock()) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(21 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, Mth.nextInt(RandomSource.create(), 1200, 3600), 0));
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.allay.ambient_with_item")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.allay.ambient_with_item")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					} else if (Blocks.AZURE_BLUET == FairyType.getBlock()) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(21 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, Mth.nextInt(RandomSource.create(), 120, 360), 0));
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.vex.ambient")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.vex.ambient")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					} else if (Blocks.RED_TULIP == FairyType.getBlock() || Blocks.ORANGE_TULIP == FairyType.getBlock() || Blocks.WHITE_TULIP == FairyType.getBlock() || Blocks.PINK_TULIP == FairyType.getBlock()) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(21 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, Mth.nextInt(RandomSource.create(), 1200, 3600), 0));
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.vex.ambient")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.vex.ambient")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					} else if (Blocks.OXEYE_DAISY == FairyType.getBlock()) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(21 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, Mth.nextInt(RandomSource.create(), 120, 360), 0));
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.allay.ambient_with_item")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.allay.ambient_with_item")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					} else if (Blocks.CORNFLOWER == FairyType.getBlock()) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(21 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, Mth.nextInt(RandomSource.create(), 1200, 3600), 0));
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.allay.ambient_with_item")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.allay.ambient_with_item")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					} else if (Blocks.LILY_OF_THE_VALLEY == FairyType.getBlock()) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(21 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.POISON, Mth.nextInt(RandomSource.create(), 120, 360), 0));
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.vex.ambient")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.vex.ambient")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
				}
			}
		} else if (!((world.getBlockState(BlockPos.containing(x + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z + 3)) + 0, z + 3))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))
				|| (world.getBlockState(BlockPos.containing(x - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z + 3)) + 0, z + 3))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))
				|| (world.getBlockState(BlockPos.containing(x + 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) (z - 1)) + 0, z - 1))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))
				|| (world.getBlockState(BlockPos.containing(x + 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) z) + 0, z))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))
				|| (world.getBlockState(BlockPos.containing(x + 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) (z + 1)) + 0, z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))
				|| (world.getBlockState(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 3)) + 0, z - 3))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))
				|| (world.getBlockState(BlockPos.containing(x + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z - 3)) + 0, z - 3))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))
				|| (world.getBlockState(BlockPos.containing(x - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z - 3)) + 0, z - 3))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))
				|| (world.getBlockState(BlockPos.containing(x - 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) z) + 0, z))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))
				|| (world.getBlockState(BlockPos.containing(x - 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) (z + 1)) + 0, z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))
				|| (world.getBlockState(BlockPos.containing(x - 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) (z - 1)) + 0, z - 1))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))
				|| (world.getBlockState(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - 2)) + 0, z - 2))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))
				|| (world.getBlockState(BlockPos.containing(x + 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) (z + 2)) + 0, z + 2))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))
				|| (world.getBlockState(BlockPos.containing(x + 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) (z - 2)) + 0, z - 2))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable")))
				|| (world.getBlockState(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z + 2)) + 0, z + 2))).is(BlockTags.create(ResourceLocation.parse("forge:fairy_summonable"))))) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("ambient.soul_sand_valley.mood")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("ambient.soul_sand_valley.mood")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SOUL_FIRE_FLAME, x, y, z, 12, 2, 2, 2, 0.1);
		}
	}
}
