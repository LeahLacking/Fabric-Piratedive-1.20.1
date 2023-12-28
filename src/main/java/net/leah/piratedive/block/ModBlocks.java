package net.leah.piratedive.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.leah.piratedive.PirateDive;
import net.leah.piratedive.block.custom.ClockBlock;
import net.leah.piratedive.world.tree.PalmSaplingGenerator;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block PIRATE_GOLD_ORE = registerBlock("pirate_gold_ore", // pirate gold ore block
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block DEEPSLATE_PIRATE_GOLD_ORE = registerBlock("deepslate_pirate_gold_ore", // deepslate pirate gold ore block
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));

    public static final Block RAW_PIRATE_GOLD_ORE_BLOCK = registerBlock("raw_pirate_gold_ore_block", // clock block
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block PIRATE_GOLD_BLOCK = registerBlock("pirate_gold_block", // clock block
            new ClockBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block CLOCK_BLOCK = registerBlock("clock_block", // clock block
            new ClockBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block ACACIA_CLOCK_BLOCK = registerBlock("acacia_clock_block", // clock block
            new ClockBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block BAMBOO_CLOCK_BLOCK = registerBlock("bamboo_clock_block", // clock block
            new ClockBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block BIRCH_CLOCK_BLOCK = registerBlock("birch_clock_block", // clock block
            new ClockBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block CRIMSON_CLOCK_BLOCK = registerBlock("crimson_clock_block", // clock block
            new ClockBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block DARK_OAK_CLOCK_BLOCK = registerBlock("dark_oak_clock_block", // clock block
            new ClockBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block JUNGLE_CLOCK_BLOCK = registerBlock("jungle_clock_block", // clock block
            new ClockBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block MANGROVE_CLOCK_BLOCK = registerBlock("mangrove_clock_block", // clock block
            new ClockBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block OAK_CLOCK_BLOCK = registerBlock("oak_clock_block", // clock block
            new ClockBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block PALM_CLOCK_BLOCK = registerBlock("palm_clock_block", // clock block
            new ClockBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block SPRUCE_CLOCK_BLOCK = registerBlock("spruce_clock_block", // clock block
            new ClockBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block WARPED_CLOCK_BLOCK = registerBlock("warped_clock_block", // clock block
            new ClockBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block PALM_LOG = registerBlock("palm_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4.0f).requiresTool())); // PALM LOG CODE
    public static final Block PALM_LOG_WOOD = registerBlock("palm_log_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4.0f).requiresTool())); // PALM WOOD CODE
    public static final Block STRIPPED_PALM_LOG = registerBlock("stripped_palm_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4.0f).requiresTool())); // STRIPPED PALM LOG CODE
    public static final Block STRIPPED_PALM_WOOD = registerBlock("stripped_palm_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4.0f).requiresTool())); // STRIPPED PALM WOOD CODE
    public static final Block PALM_PLANKS = registerBlock("palm_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4.0f).requiresTool())); // PALM PLANKS CODE
    public static final Block PALM_LEAVES = registerBlock("palm_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4.0f).requiresTool())); // PALM LEAVES CODE
    public static final Block PALM_SAPLING = registerBlock("palm_sapling",
            new SaplingBlock (new PalmSaplingGenerator(),FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(4.0f).requiresTool())); // PALM SAPLING CODE

    public static final Block PIRATE_TRADING_POST = registerBlock("pirate_trading_post",
            new Block(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));

    public static final Block PALM_STAIRS = registerBlock("palm_stairs",
            new StairsBlock(ModBlocks.PALM_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block PALM_SLAB = registerBlock("palm_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block PALM_BUTTON = registerBlock("palm_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.ACACIA, 10, true));
    public static final Block PALM_PRESSURE_PLATE = registerBlock("palm_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.ACACIA));
    public static final Block PALM_FENCE = registerBlock("palm_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block PALM_FENCE_GATE = registerBlock("palm_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.ACACIA));
    public static final Block PALM_DOOR = registerBlock("palm_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.ACACIA));
    public static final Block PALM_TRAPDOOR = registerBlock("palm_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.ACACIA));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(PirateDive.MOD_ID, name), block);
    }
    private static Item registerBlockItem (String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(PirateDive.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlock() {
        PirateDive.LOGGER.info("Registering ModBlocks for "+ PirateDive.MOD_ID);
    }
}
