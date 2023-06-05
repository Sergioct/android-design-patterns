package com.juangabrielgomila.decoratorpattern.bread;

/**
 * Created by JuanGabriel on 13/10/17.
 */



public class LowFatButter extends BreadDecorator{
    private Bread bread;

    public LowFatButter(Bread bread){
        this.bread = bread;
    }


    @Override
    public String getDescription() {
        return bread.getDescription() + " con Margarina";
    }

    @Override
    public int getKcal() {
        return bread.getKcal() + 5;
    }
}


