package com.juangabrielgomila.sandwichbuilderpattern.ingredient.bread;

import com.juangabrielgomila.sandwichbuilderpattern.ingredient.Ingredient;

/**
 * Created by JuanGabriel on 14/10/17.
 */

public abstract class Bread implements Ingredient {

    String decoration;
    int decorationKcal;

    public String getDecoration(){
        return decoration;
    }

    public int getDecorationKcal(){
        return decorationKcal;
    }

}
