package com.juangabrielgomila.observerpatternjava;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by JuanGabriel on 12/11/17.
 */

public class Order implements Observer {

    private String update;

    public String getUpdate(){
        return this.update;
    }


    @Override
    public void update(Observable observable, Object o) {

        Sandwich sandwich = (Sandwich) observable;

        if (sandwich.getReady()){
            sandwich.deleteObserver(this);
            update = "El bocadillo está listo para ser recogido";
        } else {
            update = "El bocadillo todavía no está listo. Le queda poco!";
        }


    }
}
