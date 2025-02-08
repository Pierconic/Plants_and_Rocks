package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

public class RoyalAbsorbtionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double flowers = 0;
		double hives = 0;
		sx = -3;
		flowers = 0;
		hives = 4800;
		for (int index0 = 0; index0 < 7; index0++) {
			sy = -3;
			for (int index1 = 0; index1 < 7; index1++) {
				sz = -3;
				for (int index2 = 0; index2 < 7; index2++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("minecraft:flowers")))) {
						flowers = flowers + 1;
					} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("minecraft:beehives")))) {
						hives = hives + 600;
					}
					if (hives > 16800) {
						hives = 16800;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (flowers >= 90) {
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.ABSORPTION) ? _livEnt.getEffect(MobEffects.ABSORPTION).getAmplifier() : 0) < 4
					|| (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.ABSORPTION) ? _livEnt.getEffect(MobEffects.ABSORPTION).getDuration() : 0) < hives - 40) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FALLING_HONEY, (x + 0.5), (y + 1.5), (z + 0.5), 15, 0.3, 0.3, 0.3, 0.1);
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, (int) hives, 4, false, false));
				if (Math.random() < 0.1) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.honeycomb.wax_on")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.honeycomb.wax_on")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if (entity instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("plants_and_rocks:genuine_royalty"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		} else if (flowers >= 40) {
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.ABSORPTION) ? _livEnt.getEffect(MobEffects.ABSORPTION).getAmplifier() : 0) < 3
					|| (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.ABSORPTION) ? _livEnt.getEffect(MobEffects.ABSORPTION).getDuration() : 0) < hives - 40) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FALLING_HONEY, (x + 0.5), (y + 1.5), (z + 0.5), 15, 0.3, 0.3, 0.3, 0.1);
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, (int) hives, 3, false, false));
				if (Math.random() < 0.1) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.honeycomb.wax_on")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.honeycomb.wax_on")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			}
		} else if (flowers >= 20) {
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.ABSORPTION) ? _livEnt.getEffect(MobEffects.ABSORPTION).getAmplifier() : 0) < 2
					|| (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.ABSORPTION) ? _livEnt.getEffect(MobEffects.ABSORPTION).getDuration() : 0) < hives - 40) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FALLING_HONEY, (x + 0.5), (y + 1.5), (z + 0.5), 15, 0.3, 0.3, 0.3, 0.1);
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, (int) hives, 2, false, false));
				if (Math.random() < 0.1) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.honeycomb.wax_on")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.honeycomb.wax_on")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			}
		} else if (flowers >= 6) {
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.ABSORPTION) ? _livEnt.getEffect(MobEffects.ABSORPTION).getAmplifier() : 0) < 1
					|| (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.ABSORPTION) ? _livEnt.getEffect(MobEffects.ABSORPTION).getDuration() : 0) < hives - 40) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FALLING_HONEY, (x + 0.5), (y + 1.5), (z + 0.5), 15, 0.3, 0.3, 0.3, 0.1);
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, (int) hives, 1, false, false));
				if (Math.random() < 0.1) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.honeycomb.wax_on")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.honeycomb.wax_on")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			}
		} else if (flowers >= 2) {
			if (!(entity instanceof LivingEntity _livEnt25 && _livEnt25.hasEffect(MobEffects.ABSORPTION))
					|| (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.ABSORPTION) ? _livEnt.getEffect(MobEffects.ABSORPTION).getDuration() : 0) < hives - 40) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FALLING_HONEY, (x + 0.5), (y + 1.5), (z + 0.5), 15, 0.3, 0.3, 0.3, 0.1);
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, (int) hives, 0, false, false));
				if (Math.random() < 0.1) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.honeycomb.wax_on")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.honeycomb.wax_on")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			}
		}
	}
}
