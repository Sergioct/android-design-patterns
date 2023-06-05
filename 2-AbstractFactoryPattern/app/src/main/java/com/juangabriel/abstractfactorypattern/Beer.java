package com.juangabriel.abstractfactorypattern;

public class Beer implements  Drink{

    @Override
    public String name() {
        return "Cerveza";
    }

    @Override
    public String calories() {
        return " : 155 kcal";
    }
}
