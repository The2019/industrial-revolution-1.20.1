package net.the2019.industrialrevolution.recipe;


import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.the2019.industrialrevolution.IndustrialRevolution;

public class ModRecipes {
    public static void registerRecipes(){
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(IndustrialRevolution.MOD_ID, SmelterRecipe.Serializer.ID), SmelterRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(IndustrialRevolution.MOD_ID, SmelterRecipe.Type.ID), SmelterRecipe.Type.INSTANCE);

        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(IndustrialRevolution.MOD_ID, CrushingRecipe.Serializer.ID), CrushingRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(IndustrialRevolution.MOD_ID, CrushingRecipe.Type.ID), CrushingRecipe.Type.INSTANCE);
    }
}
