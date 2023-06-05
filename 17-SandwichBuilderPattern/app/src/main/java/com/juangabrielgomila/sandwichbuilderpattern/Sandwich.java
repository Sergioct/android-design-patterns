package com.juangabrielgomila.sandwichbuilderpattern;

import com.juangabrielgomila.sandwichbuilderpattern.ingredient.Ingredient;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JuanGabriel on 14/10/17.
 */

public class Sandwich {

    private List<Ingredient> ingredients = new ArrayList<Ingredient>();


    public void addIngredient(Ingredient i){
        ingredients.add(i);
    }


    public String getSandwich(){

        StringBuilder builder = new StringBuilder();

        for (Ingredient i :ingredients) {
            builder.append(i.description()).append(" ");
        }

        return builder.toString();
    }


    public int getKcal(){

        int kcal=0;

        for (Ingredient i: ingredients) {
            kcal += i.kcal();
        }

        return kcal;
    }






}
