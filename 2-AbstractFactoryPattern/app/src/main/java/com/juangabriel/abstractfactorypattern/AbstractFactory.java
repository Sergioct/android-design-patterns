package com.juangabriel.abstractfactorypattern;

/**
 * Created by JuanGabriel on 6/9/17.
 */

public abstract class AbstractFactory {

    abstract Bread getBread(String breadType);
    abstract Filling getFilling(String fillingType);
    abstract Drink getDrink(String drinkType);

}

