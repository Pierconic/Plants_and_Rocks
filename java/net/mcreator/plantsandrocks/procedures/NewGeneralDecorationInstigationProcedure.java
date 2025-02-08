package net.mcreator.plantsandrocks.procedures;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

public class NewGeneralDecorationInstigationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
			GeneralDecorationProcedure.execute(world, x, y, z);
			CaveSpreaderProcedure.execute(world, x, y, z);
		} else if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER) {
			NetherSpreaderProcedure.execute(world, x, y, z);
		}
	}
}
