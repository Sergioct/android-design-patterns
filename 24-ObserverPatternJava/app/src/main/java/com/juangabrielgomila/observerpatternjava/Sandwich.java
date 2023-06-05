package com.juangabrielgomila.observerpatternjava;

import java.util.Observable;

/**
 * Created by JuanGabriel on 12/11/17.
 */

public class Sandwich extends Observable {

    private boolean isReady;

    public Sandwich(boolean b){
        this.isReady = b;
    }

    public boolean getReady(){
        return isReady;
    }


    public void setReady(boolean newReady){
        this.isReady = newReady;

        setChanged();
        notifyObservers();

    }

}
