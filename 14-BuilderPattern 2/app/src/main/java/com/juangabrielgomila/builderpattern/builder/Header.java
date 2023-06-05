package com.juangabrielgomila.builderpattern.builder;

/**
 * Created by JuanGabriel on 12/10/17.
 */

public abstract class Header implements LayoutView {

    @Override
    public Shading shading() {
        return new HeaderShading();
    }
}


