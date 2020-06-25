package fr.formation.recipes.services;

import fr.formation.recipes.dtos.RecipeDto;
import fr.formation.recipes.entities.Recipe;
import fr.formation.recipes.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

@Service
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public void create(RecipeDto dto) {
        Recipe recipe = new Recipe();
        populateAndSave(dto, recipe);
    }

    private void populateAndSave(RecipeDto dto, Recipe recipe){


    }
}