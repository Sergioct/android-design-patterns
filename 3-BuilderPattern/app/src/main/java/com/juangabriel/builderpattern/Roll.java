package com.juangabriel.builderpattern;

public class Roll extends Bread {

    @Override
    public String name() {
        return "Pan de pita";
    }

    @Override
    public int calories() {
        return 169;
    }

    @Override
    public String description() {
        return "Pan de pita recién horneado";
    }

    @Override
    public String image() {
        return "R.drawable.roll";
    }
}
