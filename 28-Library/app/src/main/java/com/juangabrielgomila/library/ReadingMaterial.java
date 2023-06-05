package com.juangabrielgomila.library;

import android.util.Log;

/**
 * Created by JuanGabriel on 4/12/17.
 */

public abstract class ReadingMaterial {

    private static final String TAG = "ReadingMaterial";
    Document d;

    public void fetchDocument(){
        init();
        title();
        genre();
        id();
        date();

    }

    private void init(){
        d = new Document();
    }

    private void title(){
        Log.d(TAG, "Title: " + d.title);
    }

    private void genre(){
        Log.d(TAG, "Genre: "+d.genre);
    }

    protected abstract void id();

    protected abstract void date();

    protected void edition(){
        Log.d(TAG, "Edition: " + d.edition);
    }
}
