package com.juangabrielgomila.builderpattern.builder;

import com.juangabrielgomila.builderpattern.R;

/**
 * Created by JuanGabriel on 12/10/17.
 */

public class HeaderShading implements Shading {
    @Override
    public int shade() {
        return R.color.text_primary_dark;
    }

    @Override
    public int background() {
        return R.color.text_background;
    }
}
