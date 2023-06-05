package com.juangabrielgomila.sandwichbuilderpattern.ingredient.bread.decorator;

import com.juangabrielgomila.sandwichbuilderpattern.ingredient.bread.Bread;

/**
 * Created by JuanGabriel on 14/10/17.
 */

public abstract class BreadDecorator extends Bread {

    public abstract String getDecoration();

    public abstract int getDecorationKcal();
}
