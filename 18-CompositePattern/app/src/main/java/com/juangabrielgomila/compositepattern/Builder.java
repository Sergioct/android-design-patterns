package com.juangabrielgomila.compositepattern;

/**
 * Created by JuanGabriel on 15/10/17.
 */

public class Builder {


    Component imageview = new Leaf("image view");
    Component textview = new Leaf("text view");
    Component listview = new Leaf("list view");


    Component layout1(){
        Component c = new Composite("layout1");
        c.add(imageview);
        c.add(textview);
        return c;
    }


    Component layout2(){
        Component c = new Composite("layout2");
        c.add(listview);
        c.add(layout1());
        return c;
    }


    Component layout3(){
        Component c = new Composite("layout3");
        c.add(layout1());
        c.add(layout2());
        return c;
    }

}
