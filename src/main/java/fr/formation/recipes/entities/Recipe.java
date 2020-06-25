package fr.formation.recipes.entities;


import javax.persistence.*;

@Entity
@Table(name="recipes")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recipe")
    private Long id;

    @Column(name="recipe_name", nullable = false, length = 100)
    private String name;

    @Column(name="preparing_time_minutes", nullable = false, length = 120)
    private int preparingTime;

    @Column(name="cooking_time_minutes", length = 240)
    private int cookingTime;

    @Column(name="servings", length = 10, nullable = false)
    private int serving;

    @Column(name="difficulty", nullable = false)
    private String difficultyLevel;

    @Column(name="dish_image_url", nullable = false, length = 2500)
    private String imageUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPreparingTime() {
        return preparingTime;
    }

    public void setPreparingTime(int preparingTime) {
        this.preparingTime = preparingTime;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public int getServing() {
        return serving;
    }

    public void setServing(int serving) {
        this.serving = serving;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
