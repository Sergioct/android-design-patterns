package com.juangabrielgomila.observerpattern;

/**
 * Created by JuanGabriel on 12/11/17.
 */

public class Order implements Observer {

    private Subject subject = null;

    public Order(Subject s){
        this.subject = s;
    }

    @Override
    public String update() {

        if (subject.getReady()){

            subject.unregister(this);

            return "Tu bocadillo está listo para ser recogido";

        } else{
            return "El bocadillo está cocinándose. Estará listo muy pronto";
        }

    }
}
