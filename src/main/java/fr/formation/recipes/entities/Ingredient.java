package fr.formation.recipes.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ingredients")
public class Ingredient {

    @Id
    @Column(name = "id_ingredient")
    private Long id;

    @Id
    @Column(name = "id_recipe", nullable = false)
    private Recipe recipe;

    @Column(name = "ingredient_wording", unique = true)
    private String ingredientWording;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
