package com.juangabrielgomila.builderpattern.builder;

import android.view.View;
import android.view.ViewGroup;

import com.juangabrielgomila.builderpattern.R;

/**
 * Created by JuanGabriel on 12/10/17.
 */

public class SimpleContent extends Content {
    @Override
    public int textSize() {
        return 14;
    }

    @Override
    public int content() {
        return R.string.short_text;
    }

    @Override
    public int[] padding() {
        return new int[]{16,16,16,16};
    }

    @Override
    public ViewGroup.LayoutParams layoutparams() {
        final int width = ViewGroup.LayoutParams.MATCH_PARENT;
        final int height = ViewGroup.LayoutParams.MATCH_PARENT;
        return new ViewGroup.LayoutParams(width, height);
    }
}


