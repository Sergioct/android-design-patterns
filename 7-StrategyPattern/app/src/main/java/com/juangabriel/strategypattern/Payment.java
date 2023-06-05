package com.juangabriel.strategypattern;

/**
 * Created by JuanGabriel on 27/9/17.
 */

public class Payment {

    private Strategy strategy;

    public Payment(Strategy s){
        this.strategy = s;
    }

    public String employStrategy(float f){
        return this.strategy.processPayment(f);
    }


}
