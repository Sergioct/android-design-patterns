package com.juangabrielgomila.criteriapattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JuanGabriel on 8/10/17.
 */

public class VegetarianFilter implements Filter {


    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredients) {

        List<Ingredient> vegetarian = new ArrayList<Ingredient>();

        for (Ingredient i: ingredients) {
            if (i.isVegetarian()){
                vegetarian.add(i);
            }
        }

        return vegetarian;
    }
}
