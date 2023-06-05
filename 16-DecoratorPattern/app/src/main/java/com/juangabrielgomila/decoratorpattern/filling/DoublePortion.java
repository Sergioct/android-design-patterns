package com.juangabrielgomila.decoratorpattern.filling;

/**
 * Created by JuanGabriel on 14/10/17.
 */

public class DoublePortion extends FillingDecorator {

    private Filling filling;

    public DoublePortion(Filling filling){
        this.filling = filling;
    }


    @Override
    public String getDescription() {
        return " Ración doble " + filling.getDescription();
    }

    @Override
    public int getKcal() {
        return filling.getKcal() * 2;
    }
}
