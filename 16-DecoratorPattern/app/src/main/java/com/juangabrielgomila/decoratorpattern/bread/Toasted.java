package com.juangabrielgomila.decoratorpattern.bread;

/**
 * Created by JuanGabriel on 13/10/17.
 */



public class Toasted extends BreadDecorator{
    private Bread bread;

    public Toasted(Bread bread){
        this.bread = bread;
    }


    @Override
    public String getDescription() {
        return bread.getDescription() + " Tostado";
    }

    @Override
    public int getKcal() {
        return bread.getKcal() + 0;
    }
}