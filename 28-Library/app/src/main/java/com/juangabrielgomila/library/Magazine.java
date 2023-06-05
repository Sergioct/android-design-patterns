package com.juangabrielgomila.library;

import android.util.Log;

/**
 * Created by JuanGabriel on 4/12/17.
 */

public abstract class Magazine extends ReadingMaterial {

    private static final String TAG = "Magazine";


    @Override
    protected void id() {
        Log.d(TAG, "ISSN: "+d.id);
    }

    @Override
    protected void edition() {
        Log.d(TAG, "Edition: "+d.edition);
    }

    protected abstract void date();


}
