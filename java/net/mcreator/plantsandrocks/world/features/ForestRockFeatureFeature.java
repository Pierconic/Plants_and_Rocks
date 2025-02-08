
package net.mcreator.plantsandrocks.world.features;

import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.RandomSelectorFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

import net.mcreator.plantsandrocks.procedures.ForestBoulderConditionProcedure;

public class ForestRockFeatureFeature extends RandomSelectorFeature {
	public ForestRockFeatureFeature() {
		super(RandomFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomFeatureConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!ForestBoulderConditionProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}
