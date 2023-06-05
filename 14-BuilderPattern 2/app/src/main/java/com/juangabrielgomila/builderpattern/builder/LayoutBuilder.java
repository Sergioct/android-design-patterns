package com.juangabrielgomila.builderpattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JuanGabriel on 12/10/17.
 */

public class LayoutBuilder {

    public List<LayoutView> displaySimple(){

        List<LayoutView> views = new ArrayList<LayoutView>();
        views.add(new Headline());
        views.add(new SimpleContent());

        return views;

    }

    public List<LayoutView> displayDetailed(){

        List<LayoutView> views = new ArrayList<LayoutView>();
        views.add(new Headline());
        views.add(new SubHeadline());
        views.add(new DetailedContent());

        return views;

    }



    public List<LayoutView> displayFullyDetailed(){

        List<LayoutView> views = new ArrayList<LayoutView>();
        views.add(new Headline());
        views.add(new SubHeadline());
        views.add(new SubHeadline());
        views.add(new DetailedContent());

        return views;

    }

}
