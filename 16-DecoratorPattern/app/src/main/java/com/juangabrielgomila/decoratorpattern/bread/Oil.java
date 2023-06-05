package com.juangabrielgomila.decoratorpattern.bread;

/**
 * Created by JuanGabriel on 13/10/17.
 */



public class Oil extends BreadDecorator{
    private Bread bread;

    public Oil(Bread bread){
        this.bread = bread;
    }


    @Override
    public String getDescription() {
        return bread.getDescription() + " con Aceite";
    }

    @Override
    public int getKcal() {
        return bread.getKcal() + 60;
    }
}