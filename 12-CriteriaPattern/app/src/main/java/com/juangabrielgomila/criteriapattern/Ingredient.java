package com.juangabrielgomila.criteriapattern;

/**
 * Created by JuanGabriel on 8/10/17.
 */

public class Ingredient {
    String name;
    String local;
    boolean vegetarian;


    public Ingredient(String name, String local, boolean vegetarian){
        this.name = name;
        this.local = local;
        this.vegetarian = vegetarian;
    }



    public String getName() {
        return name;
    }

    public String getLocal() {
        return local;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }


}
