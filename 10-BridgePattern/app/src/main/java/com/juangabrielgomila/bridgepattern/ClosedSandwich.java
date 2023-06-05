package com.juangabrielgomila.bridgepattern;

import android.util.Log;

/**
 * Created by JuanGabriel on 8/10/17.
 */

public class ClosedSandwich implements SandwichInterface {

    private static final String TAG = "ClosedSandwich";

    @Override
    public void makeSandwich(String filling1, String filling2) {
        Log.d(TAG, " Closed Sandwich: " + filling1 + " "+filling2);
    }
}
