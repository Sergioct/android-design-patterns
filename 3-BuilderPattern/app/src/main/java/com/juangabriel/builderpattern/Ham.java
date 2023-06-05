package com.juangabriel.builderpattern;

public class Ham extends Filling {

    @Override
    public String name() {
        return "Jamón";
    }

    @Override
    public int calories() {
        return 194 ;
    }

    @Override
    public String description() {
        return "Una loncha de jamón serrano";
    }

    @Override
    public String image() {
        return "R.drawable.ham";
    }
}
