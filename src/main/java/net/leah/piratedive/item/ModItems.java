package net.leah.piratedive.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.leah.piratedive.PirateDive;
import net.leah.piratedive.block.ModBlocks;
import net.leah.piratedive.item.custom.DiamondPirateToothItem;
import net.leah.piratedive.item.custom.ModArmorItem;
import net.leah.piratedive.item.custom.PirateArmorItem;
import net.leah.piratedive.item.custom.StormHeartItem;
import net.leah.piratedive.sound.ModSounds;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item DABLOON = registerItem("dabloon", new Item(new FabricItemSettings()));
    public static final Item RAW_PIRATE_GOLD_ORE = registerItem("raw_pirate_gold_ore",new Item(new FabricItemSettings()));
    public static final Item PIRATE_GOLD_INGOT = registerItem("pirate_gold_ingot",new Item(new FabricItemSettings()));

    public static final Item PIRATE_TOOTH = registerItem("pirate_tooth", new Item(new FabricItemSettings()));

    public static final Item EYE_OF_THE_STORM = registerItem("eye_of_the_storm", new Item(new FabricItemSettings()));

    public static final Item DIAMOND_PIRATE_TOOTH = registerItem("diamond_pirate_tooth", new DiamondPirateToothItem(new FabricItemSettings()));

    public static final Item IDLE_EYE_OF_THE_STORM = registerItem("idle_eye_of_the_storm", new Item(new FabricItemSettings()));

    public static final Item PIRATE_GOLD_CUTLASS = registerItem("pirate_gold_cutlass",
            new SwordItem(ModToolMaterial.PIRATE_GOLD, 1,0.7f, new FabricItemSettings()));
    public static final Item NETHERITE_CUTLASS = registerItem("netherite_cutlass",
            new SwordItem(ModToolMaterial.PIRATE_GOLD, 2,0.7f, new FabricItemSettings()));

    public static final Item STORM_HEART = registerItem("storm_heart",new StormHeartItem(ToolMaterials.NETHERITE, 9 ,-3.7f,new Item.Settings()));
    public  static  final  Item ANCHOR_HEAD = registerItem("anchor_head",
            new Item(new FabricItemSettings()));
    public static final Item DIVING_HELMET = registerItem("diving_helmet",
            new ModArmorItem(ModArmorMaterials.DIVING, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item DIVING_CHESTPLATE = registerItem("diving_chestplate",
            new ModArmorItem(ModArmorMaterials.DIVING, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item DIVING_LEGGINGS = registerItem("diving_leggings",
            new ModArmorItem(ModArmorMaterials.DIVING, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item DIVING_BOOTS = registerItem("diving_boots",
            new ModArmorItem(ModArmorMaterials.DIVING, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item WELLERMAN = registerItem("wellerman",
            new MusicDiscItem(7, ModSounds.WELLERMAN, new  FabricItemSettings().maxCount(1),90));


    public static final Item PIRATE_HAT = registerItem("pirate_hat",
            new PirateArmorItem(ModArmorMaterials.PIRATE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item PIRATE_CLOTH = registerItem("pirate_cloth", new Item(new FabricItemSettings()));

    public static final Item OXYGEN_TANK = registerItem("oxygen_tank", new Item(new FabricItemSettings()));
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(DABLOON);
        entries.add(RAW_PIRATE_GOLD_ORE);
        entries.add(PIRATE_GOLD_INGOT);

    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PirateDive.MOD_ID, name), item);
    }
    public static void registerModItems() {
        PirateDive.LOGGER.info("Registering Mod items for" + PirateDive.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToIngredientItemGroup);

    }
}
