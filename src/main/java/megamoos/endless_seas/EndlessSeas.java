package megamoos.endless_seas;

import megamoos.endless_seas.block.ModBlocks;
import megamoos.endless_seas.item.ItemGroups;
import megamoos.endless_seas.item.ModItems;
import megamoos.endless_seas.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EndlessSeas implements ModInitializer {
	public static final String MOD_ID = "endless_seas";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		ModBlocks.registerModBlocks();

		ItemGroups.registerItemGroups();

		ModWorldGeneration.generateModWorld();
	}
}