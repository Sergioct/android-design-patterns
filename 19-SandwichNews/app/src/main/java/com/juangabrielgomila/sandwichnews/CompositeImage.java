package com.juangabrielgomila.sandwichnews;

import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JuanGabriel on 15/10/17.
 */

public class CompositeImage implements Component {

    List<Component> components = new ArrayList<>();

    private ImageView imageView;

    public CompositeImage(ImageView imageView, int id){
        this.imageView = imageView;
        setContent(id);
    }


    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void setContent(int id) {
        imageView.setImageResource(id);
    }

    @Override
    public void inflate(ViewGroup layout) {
        layout.addView(imageView);

        for (Component c : components){
            c.inflate(layout);
        }
    }



}
