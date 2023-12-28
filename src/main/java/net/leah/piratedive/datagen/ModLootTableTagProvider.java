package net.leah.piratedive.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.leah.piratedive.block.ModBlocks;
import net.leah.piratedive.item.ModItems;
import software.bernie.shadowed.eliotlash.mclib.math.functions.classic.Mod;

public class ModLootTableTagProvider extends FabricBlockLootTableProvider {
    public ModLootTableTagProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.PIRATE_GOLD_ORE, oreDrops(ModBlocks.PIRATE_GOLD_ORE, ModItems.RAW_PIRATE_GOLD_ORE)); //pirate gold ore drops Raw Pirate gold
        addDrop(ModBlocks.DEEPSLATE_PIRATE_GOLD_ORE, oreDrops(ModBlocks.DEEPSLATE_PIRATE_GOLD_ORE, ModItems.RAW_PIRATE_GOLD_ORE)); //deepslate pirate gold ore drops Raw Pirate gold
        addDrop(ModBlocks.PALM_PLANKS, drops(ModBlocks.PALM_PLANKS));
        addDrop(ModBlocks.PALM_LOG, drops(ModBlocks.PALM_LOG));
        addDrop(ModBlocks.PALM_LOG_WOOD, drops(ModBlocks.PALM_LOG_WOOD));
        addDrop(ModBlocks.STRIPPED_PALM_LOG, drops(ModBlocks.STRIPPED_PALM_LOG));
        addDrop(ModBlocks.STRIPPED_PALM_WOOD, drops(ModBlocks.STRIPPED_PALM_WOOD));
        addDrop(ModBlocks.PALM_DOOR, drops(ModBlocks.PALM_DOOR));
        addDrop(ModBlocks.PALM_TRAPDOOR, drops(ModBlocks.PALM_TRAPDOOR));
        addDrop(ModBlocks.PALM_FENCE, drops(ModBlocks.PALM_FENCE));
        addDrop(ModBlocks.PALM_FENCE_GATE, drops(ModBlocks.PALM_FENCE_GATE));
        addDrop(ModBlocks.PALM_STAIRS, drops(ModBlocks.PALM_STAIRS));
        addDrop(ModBlocks.PALM_SLAB, drops(ModBlocks.PALM_SLAB));
        addDrop(ModBlocks.PALM_PRESSURE_PLATE, drops(ModBlocks.PALM_PRESSURE_PLATE));
        addDrop(ModBlocks.PALM_BUTTON, drops(ModBlocks.PALM_BUTTON));
        addDrop(ModBlocks.PIRATE_GOLD_BLOCK, drops(ModBlocks.PIRATE_GOLD_BLOCK));
        addDrop(ModBlocks.RAW_PIRATE_GOLD_ORE_BLOCK, drops(ModBlocks.RAW_PIRATE_GOLD_ORE_BLOCK));

        // Clocks

        addDrop(ModBlocks.CLOCK_BLOCK, drops(ModBlocks.CLOCK_BLOCK));
        addDrop(ModBlocks.ACACIA_CLOCK_BLOCK, drops(ModBlocks.ACACIA_CLOCK_BLOCK));
        addDrop(ModBlocks.BAMBOO_CLOCK_BLOCK, drops(ModBlocks.BAMBOO_CLOCK_BLOCK));
        addDrop(ModBlocks.BIRCH_CLOCK_BLOCK, drops(ModBlocks.BIRCH_CLOCK_BLOCK));
        addDrop(ModBlocks.CRIMSON_CLOCK_BLOCK, drops(ModBlocks.CRIMSON_CLOCK_BLOCK));
        addDrop(ModBlocks.DARK_OAK_CLOCK_BLOCK, drops(ModBlocks.DARK_OAK_CLOCK_BLOCK));
        addDrop(ModBlocks.JUNGLE_CLOCK_BLOCK, drops(ModBlocks.JUNGLE_CLOCK_BLOCK));
        addDrop(ModBlocks.MANGROVE_CLOCK_BLOCK, drops(ModBlocks.MANGROVE_CLOCK_BLOCK));
        addDrop(ModBlocks.OAK_CLOCK_BLOCK, drops(ModBlocks.OAK_CLOCK_BLOCK));
        addDrop(ModBlocks.PALM_CLOCK_BLOCK, drops(ModBlocks.PALM_CLOCK_BLOCK));
        addDrop(ModBlocks.SPRUCE_CLOCK_BLOCK, drops(ModBlocks.SPRUCE_CLOCK_BLOCK));
        addDrop(ModBlocks.WARPED_CLOCK_BLOCK, drops(ModBlocks.WARPED_CLOCK_BLOCK));


    }
}
