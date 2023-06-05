package com.juangabrielgomila.sandwichbuilderpattern.ingredient;

/**
 * Created by JuanGabriel on 14/10/17.
 */

public class Salt implements Ingredient {
    @Override
    public String description() {
        return "Sal";
    }

    @Override
    public int kcal() {
        return 0;
    }
}
