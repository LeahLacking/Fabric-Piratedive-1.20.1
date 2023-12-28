package net.leah.piratedive.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.leah.piratedive.block.ModBlocks;
import net.leah.piratedive.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) { //generates the Block models and textures
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PIRATE_GOLD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_PIRATE_GOLD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_PIRATE_GOLD_ORE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PIRATE_GOLD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLOCK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ACACIA_CLOCK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BAMBOO_CLOCK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BIRCH_CLOCK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRIMSON_CLOCK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DARK_OAK_CLOCK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JUNGLE_CLOCK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MANGROVE_CLOCK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OAK_CLOCK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PALM_CLOCK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WARPED_CLOCK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SPRUCE_CLOCK_BLOCK);

        BlockStateModelGenerator.BlockTexturePool palmPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PALM_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.PALM_LOG).log(ModBlocks.PALM_LOG).wood(ModBlocks.PALM_LOG_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_PALM_LOG).log(ModBlocks.STRIPPED_PALM_LOG).wood(ModBlocks.STRIPPED_PALM_WOOD);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PALM_LEAVES);

        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.PALM_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);


        palmPool.stairs(ModBlocks.PALM_STAIRS);
        palmPool.slab(ModBlocks.PALM_SLAB);
        palmPool.fence(ModBlocks.PALM_FENCE);
        palmPool.fenceGate(ModBlocks.PALM_FENCE_GATE);
        palmPool.button(ModBlocks.PALM_BUTTON);
        palmPool.pressurePlate(ModBlocks.PALM_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.PALM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PALM_TRAPDOOR);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) { //generates the item models
        itemModelGenerator.register(ModItems.RAW_PIRATE_GOLD_ORE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DABLOON, Models.GENERATED);
        itemModelGenerator.register(ModItems.IDLE_EYE_OF_THE_STORM, Models.GENERATED);
        itemModelGenerator.register(ModItems.EYE_OF_THE_STORM, Models.GENERATED);
        itemModelGenerator.register(ModItems.PIRATE_GOLD_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PIRATE_TOOTH, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_PIRATE_TOOTH, Models.GENERATED);
        itemModelGenerator.register(ModItems.PIRATE_GOLD_CUTLASS, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_CUTLASS, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ANCHOR_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.WELLERMAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.PIRATE_CLOTH, Models.GENERATED);
        itemModelGenerator.register(ModItems.OXYGEN_TANK, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DIVING_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DIVING_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DIVING_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DIVING_BOOTS));


        itemModelGenerator.register(ModItems.PIRATE_HAT, Models.GENERATED);

    }
}
