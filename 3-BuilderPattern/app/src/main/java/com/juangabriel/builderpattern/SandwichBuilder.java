package com.juangabriel.builderpattern;

/**
 * Created by JuanGabriel on 10/9/17.
 */

public class SandwichBuilder {


    public static Sandwich cheeseAndHam(){

        Sandwich s = new Sandwich();

        s.addIngredient(new Sliced());
        s.addIngredient(new Ham());
        s.addIngredient(new Cheese());


        return s;
    }


    public static Sandwich build(Sandwich s, Ingredient i){
        s.addIngredient(i);
        return s;
    }



}
