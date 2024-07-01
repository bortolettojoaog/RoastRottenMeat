package com.bortoletto.joaog.roastrotten.entities;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice.MaterialChoice;
import org.jetbrains.annotations.NotNull;

public class CustomFurnaceRecipe extends FurnaceRecipe {

    public CustomFurnaceRecipe(NamespacedKey key, ItemStack result, MaterialChoice ingredient, float experience, int cookingTime) {
        super(key, result, ingredient, experience, cookingTime);
    }

    @Override
    public @NotNull ItemStack getResult() {
        if (getInputChoice() instanceof MaterialChoice) {
            MaterialChoice ingredientChoice = (MaterialChoice) getInputChoice();
            if (ingredientChoice.getChoices().contains(Material.ROTTEN_FLESH)) {
                ItemStack result = super.getResult();
                result.setType(Material.LEATHER);

                return result;
            }
        }

        return super.getResult();
    }
}
