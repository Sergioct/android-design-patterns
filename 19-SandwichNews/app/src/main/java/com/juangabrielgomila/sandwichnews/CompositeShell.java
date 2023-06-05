package com.juangabrielgomila.sandwichnews;

import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JuanGabriel on 15/10/17.
 */

public class CompositeShell implements Component {

    List<Component> components = new ArrayList<>();


    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void setContent(int id) {

    }

    @Override
    public void inflate(ViewGroup layout) {
        for (Component c : components){
            c.inflate(layout);
        }
    }
}
