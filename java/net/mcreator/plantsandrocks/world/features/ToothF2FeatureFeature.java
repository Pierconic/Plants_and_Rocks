
package net.mcreator.plantsandrocks.world.features;

import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

import net.mcreator.plantsandrocks.world.features.configurations.StructureFeatureConfiguration;
import net.mcreator.plantsandrocks.procedures.BoneStumpConditionProcedure;

public class ToothF2FeatureFeature extends StructureFeature {
	public ToothF2FeatureFeature() {
		super(StructureFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<StructureFeatureConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!BoneStumpConditionProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}
