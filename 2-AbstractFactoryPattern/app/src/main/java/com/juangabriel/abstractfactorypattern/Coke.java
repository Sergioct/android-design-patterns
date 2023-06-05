package com.juangabriel.abstractfactorypattern;

public class Coke implements Drink{

    @Override
    public String name() {
        return "Coca cola";
    }

    @Override
    public String calories() {
        return " : 140 kcal";
    }
}
