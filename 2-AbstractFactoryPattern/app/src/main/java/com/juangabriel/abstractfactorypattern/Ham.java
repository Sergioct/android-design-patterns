package com.juangabriel.abstractfactorypattern;

public class Ham implements Filling {

    @Override
    public String name() {
        return "Jamón";
    }

    @Override
    public String calories() {
        return " : 194 kcal";
    }
}
