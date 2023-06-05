package com.juangabrielgomila.library;

import android.util.Log;

/**
 * Created by JuanGabriel on 4/12/17.
 */

public class SelectedBook extends Book {

    private static final String TAG = "SelectedBook";

    @Override
    protected void rating() {
        Log.d(TAG, "4 estrellas");
    }
}
