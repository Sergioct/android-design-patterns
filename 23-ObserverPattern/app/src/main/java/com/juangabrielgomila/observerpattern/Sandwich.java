package com.juangabrielgomila.observerpattern;

import java.util.ArrayList;

/**
 * Created by JuanGabriel on 12/11/17.
 */

public class Sandwich implements Subject {


    public boolean isReady;

    private ArrayList<Observer> orders = new ArrayList<Observer>();


    @Override
    public void register(Observer o) {
        orders.add(o);
    }

    @Override
    public void unregister(Observer o) {
        orders.remove(o);
    }


    @Override
    public void notifyObservers(){
        for (Observer o : orders){
            o.update();
        }
    }

    @Override
    public boolean getReady() {
        return isReady;
    }

    @Override
    public void setReady(boolean b) {
        this.isReady = b;
    }




}
