package com.juangabrielgomila.sandwichbuilderpattern.ingredient.bread.decorator;

import com.juangabrielgomila.sandwichbuilderpattern.ingredient.bread.Bread;

/**
 * Created by JuanGabriel on 14/10/17.
 */

public class Toasted extends BreadDecorator {

    private Bread bread;

    public Toasted(Bread bread){
        this.bread = bread;
    }


    @Override
    public String description() {
        return "Tostado";
    }

    @Override
    public int kcal() {
        return 0;
    }

    @Override
    public String getDecoration() {
        return "Tostado";
    }

    @Override
    public int getDecorationKcal() {
        return 0;
    }
}
