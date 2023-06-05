package com.juangabrielgomila.decoratorpattern.bread;

/**
 * Created by JuanGabriel on 13/10/17.
 */

public abstract class Bread {

    String description;
    int kcal;

    public String getDescription(){
        return description;
    }

    public int getKcal(){
        return kcal;
    }


}
