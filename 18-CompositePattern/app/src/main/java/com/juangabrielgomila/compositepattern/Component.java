package com.juangabrielgomila.compositepattern;

/**
 * Created by JuanGabriel on 15/10/17.
 */

public interface Component {

    void add(Component c);
    String getName();
    void inflate();

}
