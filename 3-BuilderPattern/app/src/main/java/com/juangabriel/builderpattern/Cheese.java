package com.juangabriel.builderpattern;

public class Cheese extends Filling{

    @Override
    public String name() {
        return "Queso";
    }

    @Override
    public int calories() {
        return 52 ;
    }

    @Override
    public String description() {
        return "Una loncha de queso francés";
    }

    @Override
    public String image() {
        return "R.drawable.cheese";
    }
}
