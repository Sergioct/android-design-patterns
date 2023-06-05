package com.juangabrielgomila.criteriapattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by JuanGabriel on 8/10/17.
 */

public class LocalFilter implements Filter {
    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredients) {
        List<Ingredient> local = new ArrayList<Ingredient>();

        for (Ingredient i: ingredients ) {
            if (Objects.equals(i.getLocal(), "Producto Local")){
                local.add(i);
            }
        }

        return local;
    }
}
