package com.juangabrielgomila.compositepattern;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JuanGabriel on 15/10/17.
 */

public class Composite implements Component {

    private static final String TAG = "Composite";

    private String name;

    private List<Component> components = new ArrayList<Component>();

    public Composite(String name){
        this.name = name;
    }

    @Override
    public void add(Component c) {
        components.add(c);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void inflate() {
        Log.d(TAG, "inflate: "+getName());

        for (Component c: components) {
            c.inflate();
        }
    }
}
