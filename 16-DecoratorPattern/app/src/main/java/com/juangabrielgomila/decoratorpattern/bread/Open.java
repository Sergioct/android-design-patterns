package com.juangabrielgomila.decoratorpattern.bread;

/**
 * Created by JuanGabriel on 13/10/17.
 */



public class Open extends BreadDecorator{
    private Bread bread;

    public Open(Bread bread){
        this.bread = bread;
    }


    @Override
    public String getDescription() {
        return bread.getDescription() + " Abierto";
    }

    @Override
    public int getKcal() {
        return bread.getKcal()/2;
    }
}