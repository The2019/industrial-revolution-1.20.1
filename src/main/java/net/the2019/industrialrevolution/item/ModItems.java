package net.the2019.industrialrevolution.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.the2019.industrialrevolution.IndustrialRevolution;
import net.the2019.industrialrevolution.item.custom.KnifeItem;
import net.the2019.industrialrevolution.item.custom.ToolRepairKitItem;
import net.the2019.industrialrevolution.util.ModFoodComponents;

public class ModItems {

    //Materials
    public static final Item RAW_NECRONIUM = registerItem("raw_necronium", new Item(new FabricItemSettings()));
    public static final Item NECRONIUM_INGOT = registerItem("necronium_ingot", new Item(new FabricItemSettings()));
    public static final Item COMPRESSED_COAL = registerItem("compressed_coal", new Item(new FabricItemSettings()));
    public static final Item INDUSTRIAL_METAL_INGOT = registerItem("industrial_metal_ingot", new Item(new FabricItemSettings()));

    //Food
    public static final Item SALMON_FILET = registerItem("salmon_filet", new Item(new FabricItemSettings().food(ModFoodComponents.SALMON_FILET)));

    //Tools
    public static final Item INDUSTRIAL_METAL_KNIFE = registerItem("industrial_metal_knife", new KnifeItem(new FabricItemSettings().maxCount(1).maxDamage(3)));
    public static final Item DIAMOND_KNIFE = registerItem("diamond_knife", new KnifeItem(new FabricItemSettings().maxCount(1).maxDamage(3)));
    public static final Item IRON_KNIFE = registerItem("iron_knife", new KnifeItem(new FabricItemSettings().maxCount(1).maxDamage(3)));
    public static final Item STONE_KNIFE = registerItem("stone_knife", new KnifeItem(new FabricItemSettings().maxCount(1).maxDamage(3)));
    public static final Item TOOL_REPAIR_KIT = registerItem("tool_repair_kit", new ToolRepairKitItem(new FabricItemSettings().maxCount(1)));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(IndustrialRevolution.MOD_ID, name), item);
    }

    public static void registerModItems(){
        IndustrialRevolution.LOGGER.info("Registering Mod Items for " + IndustrialRevolution.MOD_ID);
    }
}
