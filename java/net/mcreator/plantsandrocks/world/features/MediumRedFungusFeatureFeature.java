
package net.mcreator.plantsandrocks.world.features;

import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

import net.mcreator.plantsandrocks.world.features.configurations.StructureFeatureConfiguration;
import net.mcreator.plantsandrocks.procedures.SmallPatchGenConditionProcedure;

public class MediumRedFungusFeatureFeature extends StructureFeature {
	public MediumRedFungusFeatureFeature() {
		super(StructureFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<StructureFeatureConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!SmallPatchGenConditionProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}
