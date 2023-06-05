package com.juangabrielgomila.criteriapattern;

import java.util.List;

/**
 * Created by JuanGabriel on 8/10/17.
 */

public interface Filter {
    List<Ingredient> meetCriteria(List<Ingredient> ingredients);
}
