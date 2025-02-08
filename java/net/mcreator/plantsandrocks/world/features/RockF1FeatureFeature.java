
package net.mcreator.plantsandrocks.world.features;

import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

import net.mcreator.plantsandrocks.world.features.configurations.StructureFeatureConfiguration;
import net.mcreator.plantsandrocks.procedures.NetherRockGenProcedure;

public class RockF1FeatureFeature extends StructureFeature {
	public RockF1FeatureFeature() {
		super(StructureFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<StructureFeatureConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!NetherRockGenProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}
