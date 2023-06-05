package com.juangabrielgomila.sandwichbuilderpattern.ingredient.bread;

/**
 * Created by JuanGabriel on 14/10/17.
 */

public class Baguette extends Bread {
    @Override
    public String description() {
        return "Barra de pan";
    }

    @Override
    public int kcal() {
        return 80;
    }
}
