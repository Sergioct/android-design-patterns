package com.juangabrielgomila.builderpattern.builder;

import android.view.ViewGroup;

/**
 * Created by JuanGabriel on 12/10/17.
 */

public interface LayoutView {

    int textSize();
    int content();
    Shading shading();
    int[] padding();

    ViewGroup.LayoutParams layoutparams();


}
