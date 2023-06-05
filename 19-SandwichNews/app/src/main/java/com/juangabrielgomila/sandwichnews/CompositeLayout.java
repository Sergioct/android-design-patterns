package com.juangabrielgomila.sandwichnews;

import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JuanGabriel on 15/10/17.
 */

public class CompositeLayout implements Component {
    private List<Component> components = new ArrayList<Component>();

    private LinearLayout linearLayout;


    public CompositeLayout(LinearLayout layout, int id){
        this.linearLayout = layout;
        setContent(id);
    }


    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void setContent(int id) {
        //linearLayout.setBackgroundResource(id);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout.setGravity(LinearLayout.TEXT_ALIGNMENT_GRAVITY);
    }

    @Override
    public void inflate(ViewGroup layout) {
        layout.addView(linearLayout);

        for (Component c: components){
            c.inflate(linearLayout);
        }
    }
}
