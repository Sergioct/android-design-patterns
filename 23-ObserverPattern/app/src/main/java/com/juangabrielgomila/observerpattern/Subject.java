package com.juangabrielgomila.observerpattern;

/**
 * Created by JuanGabriel on 12/11/17.
 */

public interface Subject {

    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();

    boolean getReady();
    void setReady(boolean b);


}
