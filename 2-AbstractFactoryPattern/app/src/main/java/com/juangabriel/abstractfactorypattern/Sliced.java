package com.juangabriel.abstractfactorypattern;

public class Sliced implements Bread {

    @Override
    public String name() {
        return "Pan de molde";
    }

    @Override
    public String calories() {
        return " : 80 kcal";
    }
}
