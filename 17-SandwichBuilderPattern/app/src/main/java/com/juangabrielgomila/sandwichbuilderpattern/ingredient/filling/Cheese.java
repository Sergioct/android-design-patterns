package com.juangabrielgomila.sandwichbuilderpattern.ingredient.filling;

/**
 * Created by JuanGabriel on 14/10/17.
 */

public class Cheese extends Filling {
    @Override
    public String description() {
        return "Queso";
    }

    @Override
    public int kcal() {
        return 78;
    }
}
