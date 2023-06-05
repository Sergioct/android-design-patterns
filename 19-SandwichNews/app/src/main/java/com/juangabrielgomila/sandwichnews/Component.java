package com.juangabrielgomila.sandwichnews;

import android.view.ViewGroup;

/**
 * Created by JuanGabriel on 15/10/17.
 */

public interface Component {


    void add(Component component);

    void setContent(int id);

    void inflate(ViewGroup layout);


}
