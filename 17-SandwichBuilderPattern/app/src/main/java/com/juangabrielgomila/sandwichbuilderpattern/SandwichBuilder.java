package com.juangabrielgomila.sandwichbuilderpattern;

import com.juangabrielgomila.sandwichbuilderpattern.ingredient.Ingredient;

/**
 * Created by JuanGabriel on 14/10/17.
 */

public class SandwichBuilder {

    public Sandwich build(Sandwich sandwich, Ingredient ingredient){
        sandwich.addIngredient(ingredient);
        return sandwich;
    }

}
