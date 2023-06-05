package com.juangabrielgomila.builderpattern.builder;

import com.juangabrielgomila.builderpattern.R;

/**
 * Created by JuanGabriel on 12/10/17.
 */

public class ContentShading implements Shading {
    @Override
    public int shade() {
        return R.color.text_secondary_dark;
    }

    @Override
    public int background() {
        return R.color.text_content;
    }
}
