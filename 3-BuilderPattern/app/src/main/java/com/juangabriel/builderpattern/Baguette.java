package com.juangabriel.builderpattern;

public class Baguette extends Bread {

    @Override
    public String name() {
        return "Baguette";
    }

    @Override
    public int calories() {
        return 250;
    }

    @Override
    public String description() {
        return "Un baguette recien hecha y muy crujiente";
    }

    @Override
    public String image() {
        return "R.drawable.baguette";
    }
}
