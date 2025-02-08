
package net.mcreator.plantsandrocks.world.features;

import net.minecraft.world.level.levelgen.feature.configurations.DeltaFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.DeltaFeature;
import net.minecraft.world.level.WorldGenLevel;

import net.mcreator.plantsandrocks.procedures.SmallPatchGenConditionProcedure;

public class StonyDeltaFeature extends DeltaFeature {
	public StonyDeltaFeature() {
		super(DeltaFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<DeltaFeatureConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!SmallPatchGenConditionProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}
