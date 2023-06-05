package com.juangabriel.builderpattern;

/**
 * Created by JuanGabriel on 6/9/17.
 */

public abstract class Bread implements Ingredient{
    @Override
    public abstract String name();

    @Override
    public abstract int calories();

    @Override
    public abstract String description();

    @Override
    public abstract String image();
}

