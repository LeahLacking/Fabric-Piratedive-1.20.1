package net.leah.piratedive;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.leah.piratedive.datagen.*;
import net.leah.piratedive.world.ModConfiguredFeatures;
import net.minecraft.data.DataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class PirateDiveDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();


		pack.addProvider(ModBlockTagProvider :: new);
		pack.addProvider(ModItemTagProvider :: new);
		pack.addProvider(ModLootTableTagProvider :: new);
		pack.addProvider(ModModelProvider :: new);
		pack.addProvider(ModRecipeProvider :: new);
		pack.addProvider(ModWorldGenerator::new);
		pack.addProvider(ModPoiTagProvider::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
	}
}
