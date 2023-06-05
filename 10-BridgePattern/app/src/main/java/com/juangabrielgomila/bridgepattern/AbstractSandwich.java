package com.juangabrielgomila.bridgepattern;

/**
 * Created by JuanGabriel on 8/10/17.
 */

public abstract class AbstractSandwich {

    protected SandwichInterface sandwichInterface;

    protected AbstractSandwich(SandwichInterface sandwichInterface){
        this.sandwichInterface = sandwichInterface;
    }

    public abstract void make();

}
