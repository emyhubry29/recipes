package fr.formation.recipes.dtos;

import javax.validation.constraints.*;

public class RecipeDto {

    @NotBlank
    @Size(min= 3, max= 100)
    private String recipeName;

    @NotNull
    @Min(1)
    @Max(120)
    private int preparingTimeMinutes;

    @Min(1)
    @Max(240)
    private int cookingTimeMinutes;

    @NotNull
    @Min(1)
    @Max(10)
    private int servings;

    @NotBlank
    @Size(min= 7, max = 2500)
    private String dishImageUrl;

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public int getPreparingTimeMinutes() {
        return preparingTimeMinutes;
    }

    public void setPreparingTimeMinutes(int preparingTimeMinutes) {
        this.preparingTimeMinutes = preparingTimeMinutes;
    }

    public int getCookingTimeMinutes() {
        return cookingTimeMinutes;
    }

    public void setCookingTimeMinutes(int cookingTimeMinutes) {
        this.cookingTimeMinutes = cookingTimeMinutes;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public String getDishImageUrl() {
        return dishImageUrl;
    }

    public void setDishImageUrl(String dishImageUrl) {
        this.dishImageUrl = dishImageUrl;
    }
}
