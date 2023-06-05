package com.juangabrielgomila.builderpattern.builder;

import android.view.ViewGroup;

import com.juangabrielgomila.builderpattern.R;

public class SubHeadline extends Header {
    @Override
    public int textSize() {
        return 18;
    }

    @Override
    public int content() {
        return R.string.subheadline;
    }

    @Override
    public int[] padding() {
        return new int[]{32,8,16,8};
    }

    @Override
    public ViewGroup.LayoutParams layoutparams() {
        final int width = ViewGroup.LayoutParams.MATCH_PARENT;
        final int height = ViewGroup.LayoutParams.WRAP_CONTENT;
        return new ViewGroup.LayoutParams(width, height);
    }
}
