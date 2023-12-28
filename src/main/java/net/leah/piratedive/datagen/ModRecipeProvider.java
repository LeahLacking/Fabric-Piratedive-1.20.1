package net.leah.piratedive.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.leah.piratedive.block.ModBlocks;
import net.leah.piratedive.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {


   public static final List<ItemConvertible> PIRATE_GOLD_SMELTABLES = List.of(ModItems.RAW_PIRATE_GOLD_ORE,
           ModBlocks.PIRATE_GOLD_ORE, ModBlocks.DEEPSLATE_PIRATE_GOLD_ORE); //Item list for smeltable blocks

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, PIRATE_GOLD_SMELTABLES, RecipeCategory.MISC, ModItems.PIRATE_GOLD_INGOT,
                0.7f, 200, "pirate_gold");
        offerBlasting(exporter, PIRATE_GOLD_SMELTABLES, RecipeCategory.MISC, ModItems.PIRATE_GOLD_INGOT,
                0.7f, 100, "pirate_gold"); //smelting properties


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DABLOON, 2)
                .pattern("   ")
                .pattern("  P")
                .pattern("  P")
                .input('P', ModItems.PIRATE_GOLD_INGOT)
                .criterion(hasItem(ModItems.PIRATE_GOLD_INGOT), conditionsFromItem(ModItems.PIRATE_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DABLOON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DIAMOND_PIRATE_TOOTH, 1)
                .pattern("DDD")
                .pattern("DPD")
                .pattern("DDD")
                .input('D', Items.DIAMOND)
                .input('P', ModItems.PIRATE_TOOTH)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(ModItems.PIRATE_TOOTH), conditionsFromItem(ModItems.PIRATE_TOOTH))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DIAMOND_PIRATE_TOOTH)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EYE_OF_THE_STORM, 1)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('I', ModItems.IDLE_EYE_OF_THE_STORM)
                .input('P', ModItems.PIRATE_GOLD_INGOT)
                .criterion(hasItem(ModItems.PIRATE_GOLD_INGOT), conditionsFromItem(ModItems.PIRATE_GOLD_INGOT))
                .criterion(hasItem(ModItems.IDLE_EYE_OF_THE_STORM), conditionsFromItem(ModItems.IDLE_EYE_OF_THE_STORM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EYE_OF_THE_STORM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ANCHOR_HEAD, 1)
                .pattern("EIE")
                .pattern("NIN")
                .pattern("III")
                .input('I', Items.IRON_BLOCK)
                .input('E', Items.IRON_INGOT)
                .input('N', Items.IRON_NUGGET)
                .criterion(hasItem(Items.IRON_BLOCK), conditionsFromItem(Items.IRON_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ANCHOR_HEAD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_DOOR, 3)
                .pattern("  PP")
                .pattern("  PP")
                .pattern("  PP")
                .input('P', ModBlocks.PALM_PLANKS)
                .criterion(hasItem(ModBlocks.PALM_PLANKS), conditionsFromItem(ModBlocks.PALM_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PALM_PLANKS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_SLAB, 6)
                .pattern("    ")
                .pattern("    ")
                .pattern(" PPP")
                .input('P', ModBlocks.PALM_PLANKS)
                .criterion(hasItem(ModBlocks.PALM_PLANKS), conditionsFromItem(ModBlocks.PALM_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PALM_SLAB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_TRAPDOOR, 2)
                .pattern("    ")
                .pattern(" PPP")
                .pattern(" PPP")
                .input('P', ModBlocks.PALM_PLANKS)
                .criterion(hasItem(ModBlocks.PALM_PLANKS), conditionsFromItem(ModBlocks.PALM_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PALM_TRAPDOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_FENCE, 2)
                .pattern("   ")
                .pattern("PSP")
                .pattern("PSP")
                .input('P', ModBlocks.PALM_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.PALM_PLANKS), conditionsFromItem(ModBlocks.PALM_FENCE_GATE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PALM_FENCE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_FENCE, 2)
                .pattern("   ")
                .pattern("SPS")
                .pattern("SPS")
                .input('P', ModBlocks.PALM_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.PALM_PLANKS), conditionsFromItem(ModBlocks.PALM_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PALM_FENCE_GATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ACACIA_CLOCK_BLOCK, 3)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('I', ModBlocks.CLOCK_BLOCK)
                .input('P', Blocks.ACACIA_PLANKS)
                .criterion(hasItem(ModBlocks.CLOCK_BLOCK), conditionsFromItem(Blocks.ACACIA_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ACACIA_CLOCK_BLOCK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BAMBOO_CLOCK_BLOCK, 3)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('I', ModBlocks.CLOCK_BLOCK)
                .input('P', Blocks.BAMBOO_PLANKS)
                .criterion(hasItem(ModBlocks.CLOCK_BLOCK), conditionsFromItem(Blocks.BAMBOO_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BAMBOO_CLOCK_BLOCK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BIRCH_CLOCK_BLOCK, 3)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('I', ModBlocks.CLOCK_BLOCK)
                .input('P', Blocks.BIRCH_PLANKS)
                .criterion(hasItem(ModBlocks.CLOCK_BLOCK), conditionsFromItem(Blocks.BIRCH_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BIRCH_CLOCK_BLOCK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MANGROVE_CLOCK_BLOCK, 3)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('I', ModBlocks.CLOCK_BLOCK)
                .input('P', Blocks.MANGROVE_PLANKS)
                .criterion(hasItem(ModBlocks.CLOCK_BLOCK), conditionsFromItem(Blocks.MANGROVE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MANGROVE_CLOCK_BLOCK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DARK_OAK_CLOCK_BLOCK, 3)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('I', ModBlocks.CLOCK_BLOCK)
                .input('P', Blocks.DARK_OAK_PLANKS)
                .criterion(hasItem(ModBlocks.CLOCK_BLOCK), conditionsFromItem(Blocks.DARK_OAK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DARK_OAK_CLOCK_BLOCK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.JUNGLE_CLOCK_BLOCK, 3)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('I', ModBlocks.CLOCK_BLOCK)
                .input('P', Blocks.JUNGLE_PLANKS)
                .criterion(hasItem(ModBlocks.CLOCK_BLOCK), conditionsFromItem(Blocks.JUNGLE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.JUNGLE_CLOCK_BLOCK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CRIMSON_CLOCK_BLOCK, 3)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('I', ModBlocks.CLOCK_BLOCK)
                .input('P', Blocks.CRIMSON_PLANKS)
                .criterion(hasItem(ModBlocks.CLOCK_BLOCK), conditionsFromItem(Blocks.CRIMSON_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CRIMSON_CLOCK_BLOCK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SPRUCE_CLOCK_BLOCK, 3)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('I', ModBlocks.CLOCK_BLOCK)
                .input('P', Blocks.SPRUCE_PLANKS)
                .criterion(hasItem(ModBlocks.CLOCK_BLOCK), conditionsFromItem(Blocks.SPRUCE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SPRUCE_CLOCK_BLOCK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.WARPED_CLOCK_BLOCK, 3)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('I', ModBlocks.CLOCK_BLOCK)
                .input('P', Blocks.WARPED_PLANKS)
                .criterion(hasItem(ModBlocks.CLOCK_BLOCK), conditionsFromItem(Blocks.WARPED_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WARPED_CLOCK_BLOCK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PALM_CLOCK_BLOCK, 3)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('I', ModBlocks.CLOCK_BLOCK)
                .input('P', ModBlocks.PALM_PLANKS)
                .criterion(hasItem(ModBlocks.CLOCK_BLOCK), conditionsFromItem(ModBlocks.PALM_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PALM_CLOCK_BLOCK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.OAK_CLOCK_BLOCK, 3)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('I', ModBlocks.CLOCK_BLOCK)
                .input('P', Blocks.OAK_PLANKS)
                .criterion(hasItem(ModBlocks.CLOCK_BLOCK), conditionsFromItem(Blocks.OAK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.OAK_CLOCK_BLOCK)));






    }
}