package com.juangabrielgomila.bridgepattern;

import android.util.Log;

public class DoubleSandwich implements SandwichInterface {

    private static final String TAG = "DoubleSandwich";


    @Override
    public void makeSandwich(String filling1, String filling2) {
        Log.d(TAG, "Double Sandwich: "+filling1 + " "+filling2);
    }
}
