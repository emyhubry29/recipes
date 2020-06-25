package fr.formation.recipes.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "steps")
public class Step {

    @Id
    @Column(name = "id_step")
    private Long id;

    @Id
    @Column(name = "id_recipe", nullable = false)
    private Recipe recipe;

    @Column(name = "step_wording")
    private String stepWording;

    @Column(name = "step_order", unique = true)
    private int stepOrder;
}
