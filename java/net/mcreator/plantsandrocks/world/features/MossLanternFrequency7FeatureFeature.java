
package net.mcreator.plantsandrocks.world.features;

import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

import net.mcreator.plantsandrocks.world.features.configurations.StructureFeatureConfiguration;
import net.mcreator.plantsandrocks.procedures.MossLanternConditionProcedure;

public class MossLanternFrequency7FeatureFeature extends StructureFeature {
	public MossLanternFrequency7FeatureFeature() {
		super(StructureFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<StructureFeatureConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!MossLanternConditionProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}
