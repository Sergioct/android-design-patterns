package com.juangabriel.builderpattern;

public class Tomato extends Filling{

    @Override
    public String name() {
        return "Tomate";
    }

    @Override
    public int calories() {
        return 20;
    }

    @Override
    public String description() {
        return "Frescos y recién cogidos del huerto";
    }

    @Override
    public String image() {
        return "R.drawable.tomato";
    }
}
