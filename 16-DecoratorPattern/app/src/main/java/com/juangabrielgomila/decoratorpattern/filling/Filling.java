package com.juangabrielgomila.decoratorpattern.filling;

/**
 * Created by JuanGabriel on 14/10/17.
 */

public abstract class Filling {
    String description;
    int kcal;

    public String getDescription(){
        return description;
    }

    public int getKcal(){
        return kcal;
    }

}
