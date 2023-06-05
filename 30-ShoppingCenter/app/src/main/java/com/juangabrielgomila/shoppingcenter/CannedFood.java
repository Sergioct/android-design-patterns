package com.juangabrielgomila.shoppingcenter;

/**
 * Created by JuanGabriel on 7/12/17.
 */

public class CannedFood implements Item {

    private int cost;
    private String name;

    public CannedFood(int cost, String name){
        this.cost = cost;
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }


    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
