package com.juangabrielgomila.criteriapattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JuanGabriel on 8/10/17.
 */

public class AndCriteria implements Filter {

    Filter criteria1, criteria2;

    public AndCriteria(Filter f1, Filter f2){
        this.criteria1 = f1;
        this.criteria2 = f2;
    }


    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredients) {

        List<Ingredient> firstIngredients = criteria1.meetCriteria(ingredients);
        List<Ingredient> secondIngredients = criteria2.meetCriteria(firstIngredients);

        return secondIngredients;
    }
}
