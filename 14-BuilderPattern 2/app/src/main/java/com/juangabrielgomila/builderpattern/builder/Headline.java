package com.juangabrielgomila.builderpattern.builder;

import android.view.View;
import android.view.ViewGroup;

import com.juangabrielgomila.builderpattern.R;

/**
 * Created by JuanGabriel on 12/10/17.
 */

public class Headline extends Header {
    @Override
    public int textSize() {
        return 24;
    }

    @Override
    public int content() {
        return R.string.headline;
    }

    @Override
    public int[] padding() {
        return new int[]{24,16,16,0};
    }

    @Override
    public ViewGroup.LayoutParams layoutparams() {
        final int width = ViewGroup.LayoutParams.MATCH_PARENT;
        final int height = ViewGroup.LayoutParams.WRAP_CONTENT;
        return new ViewGroup.LayoutParams(width, height);
    }
}




