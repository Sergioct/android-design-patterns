package com.juangabrielgomila.decoratorpattern.bread;

/**
 * Created by JuanGabriel on 13/10/17.
 */

public abstract class BreadDecorator extends Bread {

    public abstract String getDescription();

    public abstract int getKcal();

}
