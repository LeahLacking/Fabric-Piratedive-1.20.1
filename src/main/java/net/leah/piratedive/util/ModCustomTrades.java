package net.leah.piratedive.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.leah.piratedive.block.ModBlocks;
import net.leah.piratedive.item.ModItems;
import net.leah.piratedive.villager.ModVillagers;
import net.minecraft.item.ItemStack;
import net.minecraft.village.TradeOffer;

public class ModCustomTrades {

    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(ModVillagers.PIRATE_TRADER, 1,
                factories -> {
                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.DABLOON, 2),
                        new ItemStack(ModBlocks.PIRATE_GOLD_ORE, 1),
                        6, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DABLOON, 2),
                            new ItemStack(ModBlocks.DEEPSLATE_PIRATE_GOLD_ORE, 1),
                            6, 5, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.PIRATE_TRADER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DABLOON, 4),
                            new ItemStack(ModBlocks.PALM_LOG, 4),
                            8, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DABLOON, 4),
                            new ItemStack(ModBlocks.STRIPPED_PALM_LOG, 4),
                            8, 5, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.PIRATE_TRADER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DABLOON, 2),
                            new ItemStack(ModBlocks.PALM_STAIRS, 6),
                            12, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DABLOON, 2),
                            new ItemStack(ModBlocks.PALM_SLAB, 6),
                            12, 5, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.PIRATE_TRADER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DABLOON, 2),
                            new ItemStack(ModBlocks.PALM_DOOR, 6),
                            12, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DABLOON, 2),
                            new ItemStack(ModBlocks.PALM_TRAPDOOR, 6),
                            12, 5, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.PIRATE_TRADER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DABLOON, 2),
                            new ItemStack(ModBlocks.PALM_FENCE, 6),
                            12, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DABLOON, 2),
                            new ItemStack(ModBlocks.PALM_FENCE_GATE, 6),
                            12, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DABLOON, 2),
                            new ItemStack(ModBlocks.PALM_PRESSURE_PLATE, 6),
                            12, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DABLOON, 2),
                            new ItemStack(ModBlocks.PALM_BUTTON, 6),
                            12, 5, 0.05f));
                });
    }
}
