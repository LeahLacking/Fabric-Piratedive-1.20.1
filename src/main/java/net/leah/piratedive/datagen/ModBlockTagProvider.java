package net.leah.piratedive.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.leah.piratedive.block.ModBlocks;
import net.minecraft.block.LadderBlock;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE) //all blocks mineable by a pickaxe
                .add(ModBlocks.PIRATE_GOLD_ORE)
                .add(ModBlocks.DEEPSLATE_PIRATE_GOLD_ORE)
                .add(ModBlocks.CLOCK_BLOCK)
                .add(ModBlocks.PIRATE_GOLD_BLOCK)
                .add(ModBlocks.RAW_PIRATE_GOLD_ORE_BLOCK);


        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE) //all blocks mineable by axe
                .add(ModBlocks.CRIMSON_CLOCK_BLOCK)
                .add(ModBlocks.ACACIA_CLOCK_BLOCK)
                .add(ModBlocks.BAMBOO_CLOCK_BLOCK)
                .add(ModBlocks.BIRCH_CLOCK_BLOCK)
                .add(ModBlocks.DARK_OAK_CLOCK_BLOCK)
                .add(ModBlocks.JUNGLE_CLOCK_BLOCK)
                .add(ModBlocks.MANGROVE_CLOCK_BLOCK)
                .add(ModBlocks.OAK_CLOCK_BLOCK)
                .add(ModBlocks.PALM_CLOCK_BLOCK)
                .add(ModBlocks.SPRUCE_CLOCK_BLOCK)
                .add(ModBlocks.WARPED_CLOCK_BLOCK)
                .add(ModBlocks.PALM_LOG)
                .add(ModBlocks.PALM_LOG_WOOD)
                .add(ModBlocks.PALM_PLANKS)
                .add(ModBlocks.STRIPPED_PALM_LOG)
                .add(ModBlocks.STRIPPED_PALM_WOOD)
                .add(ModBlocks.PALM_FENCE_GATE)
                .add(ModBlocks.PALM_FENCE)
                .add(ModBlocks.PALM_DOOR)
                .add(ModBlocks.PALM_TRAPDOOR)
                .add(ModBlocks.PALM_STAIRS)
                .add(ModBlocks.PALM_SLAB)
                .add(ModBlocks.PALM_BUTTON)
                .add(ModBlocks.PALM_PRESSURE_PLATE);



        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL) //all blocks needing a iron tool
                .add(ModBlocks.PIRATE_GOLD_ORE)
                .add(ModBlocks.DEEPSLATE_PIRATE_GOLD_ORE)
                .add(ModBlocks.PIRATE_GOLD_BLOCK)
                .add(ModBlocks.RAW_PIRATE_GOLD_ORE_BLOCK);
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL); //all blocks needing a diamond tool


        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL); //all blocks needing a stone tool


        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.PALM_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.PALM_FENCE_GATE);
    }
}
