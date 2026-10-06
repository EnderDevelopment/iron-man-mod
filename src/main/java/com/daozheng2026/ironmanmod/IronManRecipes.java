package com.daozheng2026.ironmanmod;

import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public
class IronManRecipes {
    public static void registerRecipes() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(IronManMod.MOD_ID, "iron_man_helmet"), new ShapedRecipe(
        "III",
        "I I",
        Ingredient.ofItems(Items.IRON_INGOT),
        IronManItems.IRON_MAN_HELMET
        ));

        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(IronManMod.MOD_ID, "iron_man_chestplate"), new ShapedRecipe(
        "I I",
        "III",
        "III",
        Ingredient.ofItems(Items.IRON_INGOT),
        IronManItems.IRON_MAN_CHESTPLATE
        ));

        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(IronManMod.MOD_ID, "iron_man_leggings"), new ShapedRecipe(
        "III",
        "I I",
        "I I",
        Ingredient.ofItems(Items.IRON_INGOT),
        IronManItems.IRON_MAN_LEGGINGS
        ));

        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(IronManMod.MOD_ID, "iron_man_boots"), new ShapedRecipe(
        "I I",
        "I I",
        Ingredient.ofItems(Items.IRON_INGOT),
        IronManItems.IRON_MAN_BOOTS
        ));
    }
}
