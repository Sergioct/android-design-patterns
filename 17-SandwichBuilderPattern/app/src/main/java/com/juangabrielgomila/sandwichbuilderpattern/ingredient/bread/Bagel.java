package com.juangabrielgomila.sandwichbuilderpattern.ingredient.bread;

/**
 * Created by JuanGabriel on 14/10/17.
 */

public class Bagel extends Bread {
    @Override
    public String description() {
        return "Rosquilla";
    }

    @Override
    public int kcal() {
        return 280;
    }
}
