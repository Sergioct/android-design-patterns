package com.juangabrielgomila.sandwichbuilderpattern.ingredient.filling;

/**
 * Created by JuanGabriel on 14/10/17.
 */

public class Ham extends Filling {
    @Override
    public String description() {
        return "Jamón York";
    }

    @Override
    public int kcal() {
        return 64;
    }
}
