
package net.mcreator.plantsandrocks.world.features;

import net.minecraft.world.level.levelgen.feature.configurations.SimpleRandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.SimpleRandomSelectorFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

import net.mcreator.plantsandrocks.procedures.MushroomTreeGenProcedure;

public class GiantBrownMushroomFeature extends SimpleRandomSelectorFeature {
	public GiantBrownMushroomFeature() {
		super(SimpleRandomFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<SimpleRandomFeatureConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!MushroomTreeGenProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}
