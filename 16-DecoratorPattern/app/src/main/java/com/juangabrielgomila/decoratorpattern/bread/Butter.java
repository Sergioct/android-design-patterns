package com.juangabrielgomila.decoratorpattern.bread;

/**
 * Created by JuanGabriel on 13/10/17.
 */

public class Butter extends BreadDecorator {

    private Bread bread;

    public Butter(Bread bread){
        this.bread = bread;
    }


    @Override
    public String getDescription() {
        return bread.getDescription() + " con Mantequilla";
    }

    @Override
    public int getKcal() {
        return bread.getKcal() + 80;
    }
}

