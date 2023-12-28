package net.leah.piratedive;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.leah.piratedive.block.ModBlocks;
import net.leah.piratedive.block.ModFlammableBlockRegistry;
import net.leah.piratedive.item.ModItemGroups;
import net.leah.piratedive.item.ModItems;
import net.leah.piratedive.sound.ModSounds;
import net.leah.piratedive.util.ModCustomTrades;
import net.leah.piratedive.util.ModLootTableModifiers;
import net.leah.piratedive.villager.ModVillagers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PirateDive implements ModInitializer {
	public static final String MOD_ID = "piratedive";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);




	@Override //
	public void onInitialize() {
		ModItemGroups.registerItemGroups();ModItems.registerModItems();ModBlocks.registerModBlock();ModSounds.registerSounds();ModVillagers.registerVillagers();ModCustomTrades.registerCustomTrades();

		ModLootTableModifiers.modifyLootTables();

		ModFlammableBlockRegistry.registerFlammableBlocks();
		StrippableBlockRegistry.register(ModBlocks.PALM_LOG, ModBlocks.STRIPPED_PALM_LOG);
		StrippableBlockRegistry.register(ModBlocks.PALM_LOG_WOOD, ModBlocks.STRIPPED_PALM_WOOD);
	}
}