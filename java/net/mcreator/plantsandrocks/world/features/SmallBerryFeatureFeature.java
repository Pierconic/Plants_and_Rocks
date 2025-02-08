
package net.mcreator.plantsandrocks.world.features;

import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.RandomPatchFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

import net.mcreator.plantsandrocks.procedures.SpruceStructureSpecificationProcedure;

public class SmallBerryFeatureFeature extends RandomPatchFeature {
	public SmallBerryFeatureFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!SpruceStructureSpecificationProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}
