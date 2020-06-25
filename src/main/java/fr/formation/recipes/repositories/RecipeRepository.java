package fr.formation.recipes.repositories;

import fr.formation.recipes.entities.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}