
package net.mcreator.plantsandrocks.world.features;

import net.minecraft.world.level.levelgen.feature.configurations.SimpleRandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.SimpleRandomSelectorFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

import net.mcreator.plantsandrocks.procedures.BigPlainTalusProcedure;

public class PlainBoulderFeatureFeature extends SimpleRandomSelectorFeature {
	public PlainBoulderFeatureFeature() {
		super(SimpleRandomFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<SimpleRandomFeatureConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!BigPlainTalusProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}
