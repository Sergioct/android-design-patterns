package com.juangabriel.abstractfactorypattern;

public class FillingFactory extends AbstractFactory {

    @Override
    Bread getBread(String breadType) {
        return null;
    }

    @Override
    Filling getFilling(String fillingType) {

        if (fillingType==null) return null;

        if (fillingType == "CHE"){
            return new Cheese();
        } else if(fillingType == "TOM"){
            return new Tomato();
        } else if(fillingType == "HAM"){
            return new Ham();
        }

        return null;
    }

    @Override
    Drink getDrink(String drinkType) {
        return null;
    }
}
