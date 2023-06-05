package com.juangabrielgomila.shoppingcenter;

import android.util.Log;

/**
 * Created by JuanGabriel on 7/12/17.
 */

public class Checkout implements Visitor {

    private static final String TAG = "Checkout";
    
    @Override
    public int visit(CannedFood cannedFood) {
        int cost = cannedFood.getCost();
        String name = cannedFood.getName();
        Log.d(TAG, "Envase: "+name+ ": precio : "+cost);
        return cost;
    }

    @Override
    public int visit(FreshFood freshFood) {
        int cost = freshFood.getCostPerKilo() * freshFood.getWeight();
        String name = freshFood.getName();
        Log.d(TAG, "Comida fresca "+name+", precio: "+cost);
        return cost;
    }

    @Override
    public int visit(SpecialOffer specialOffer) {

        String name = specialOffer.getName();
        int cost = specialOffer.getBaseCost();
        int number = specialOffer.getQuantity();

        cost *= number;

        //50% de descuento
        int discount = specialOffer.getDiscount();

        if (number > 1){
            cost /= discount;
        }

        Log.d(TAG, "Oferta del día: "+name+" al 50%: "+cost);

        return cost;
    }
}
