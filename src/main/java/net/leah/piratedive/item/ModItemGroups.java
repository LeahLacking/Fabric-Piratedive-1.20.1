package net.leah.piratedive.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.leah.piratedive.PirateDive;
import net.leah.piratedive.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PIRATEDIVE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PirateDive.MOD_ID, "piratedive"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.piratedive"))
                    .icon(() -> new ItemStack(ModItems.RAW_PIRATE_GOLD_ORE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.DABLOON);
                        entries.add(ModItems.PIRATE_GOLD_INGOT);
                        entries.add(ModItems.RAW_PIRATE_GOLD_ORE);
                        entries.add(ModBlocks.RAW_PIRATE_GOLD_ORE_BLOCK);
                        entries.add(ModBlocks.PIRATE_GOLD_BLOCK);
                        entries.add(ModItems.EYE_OF_THE_STORM);
                        entries.add(ModBlocks.CLOCK_BLOCK);
                        entries.add(ModItems.PIRATE_GOLD_CUTLASS);
                        entries.add(ModItems.NETHERITE_CUTLASS);
                        entries.add(ModItems.DIVING_HELMET);
                        entries.add(ModItems.DIVING_CHESTPLATE);
                        entries.add(ModItems.DIVING_LEGGINGS);
                        entries.add(ModItems.DIVING_BOOTS);
                        entries.add(ModItems.OXYGEN_TANK);
                        entries.add(ModItems.WELLERMAN);
                        entries.add(ModItems.PIRATE_HAT);
                        entries.add(ModItems.PIRATE_CLOTH);
                        entries.add(ModBlocks.PIRATE_TRADING_POST);

                        entries.add(ModBlocks.PIRATE_GOLD_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PIRATE_GOLD_ORE);
                        entries.add(ModBlocks.PALM_LOG);
                        entries.add(ModBlocks.PALM_LOG_WOOD);
                        entries.add(ModBlocks.STRIPPED_PALM_LOG);
                        entries.add(ModBlocks.STRIPPED_PALM_WOOD);
                        entries.add(ModBlocks.PALM_PLANKS);
                        entries.add(ModBlocks.PALM_CLOCK_BLOCK);
                        entries.add(ModBlocks.PALM_BUTTON);
                        entries.add(ModBlocks.PALM_PRESSURE_PLATE);
                        entries.add(ModBlocks.PALM_FENCE_GATE);
                        entries.add(ModBlocks.PALM_FENCE);
                        entries.add(ModBlocks.PALM_SLAB);
                        entries.add(ModBlocks.PALM_STAIRS);
                        entries.add(ModBlocks.PALM_TRAPDOOR);
                        entries.add(ModBlocks.PALM_DOOR);

                        entries.add(ModItems.PIRATE_TOOTH);
                        entries.add(ModItems.DIAMOND_PIRATE_TOOTH);
                        entries.add(ModItems.IDLE_EYE_OF_THE_STORM);
                        entries.add(ModItems.STORM_HEART);
                        entries.add(ModItems.ANCHOR_HEAD);
                        entries.add(ModBlocks.ACACIA_CLOCK_BLOCK);
                        entries.add(ModBlocks.BAMBOO_CLOCK_BLOCK);
                        entries.add(ModBlocks.BIRCH_CLOCK_BLOCK);
                        entries.add(ModBlocks.CRIMSON_CLOCK_BLOCK);
                        entries.add(ModBlocks.DARK_OAK_CLOCK_BLOCK);
                        entries.add(ModBlocks.JUNGLE_CLOCK_BLOCK);
                        entries.add(ModBlocks.MANGROVE_CLOCK_BLOCK);
                        entries.add(ModBlocks.SPRUCE_CLOCK_BLOCK);
                        entries.add(ModBlocks.WARPED_CLOCK_BLOCK);



                    }).build());

    public static void registerItemGroups() {
        PirateDive.LOGGER.info("Registering Item Groups for "+PirateDive.MOD_ID);
    }
}
