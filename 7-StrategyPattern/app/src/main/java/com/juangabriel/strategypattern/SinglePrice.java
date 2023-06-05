package com.juangabriel.strategypattern;

/**
 * Created by JuanGabriel on 27/9/17.
 */

public class SinglePrice {

    private static SinglePrice singlePrice = new SinglePrice();

    private float price;


    private SinglePrice (){

    }

    public static SinglePrice getInstance(){
        return singlePrice;
    }

    protected float getPrice(){
        return  price;
    }
    protected void setPrice(float f){
        price = f;
    }

}
