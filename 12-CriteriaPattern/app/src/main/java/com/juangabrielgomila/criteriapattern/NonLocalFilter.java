package com.juangabrielgomila.criteriapattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JuanGabriel on 8/10/17.
 */

public class NonLocalFilter implements Filter {
    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredients) {
        List<Ingredient> nonLocal = new ArrayList<Ingredient>();

        for (Ingredient i:ingredients) {
            if (i.getLocal() != "Producto Local"){
                nonLocal.add(i);
            }
        }

        return nonLocal;
    }
}
