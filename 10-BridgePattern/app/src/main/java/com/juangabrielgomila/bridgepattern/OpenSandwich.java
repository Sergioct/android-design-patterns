package com.juangabrielgomila.bridgepattern;

import android.util.Log;

/**
 * Created by JuanGabriel on 8/10/17.
 */

public class OpenSandwich implements SandwichInterface {

    private static final String TAG = "OpenSandwich";


    @Override
    public void makeSandwich(String filling1, String filling2) {
        Log.d(TAG, "Open Sandwich: "+filling1 + " "+filling2);
    }
}



