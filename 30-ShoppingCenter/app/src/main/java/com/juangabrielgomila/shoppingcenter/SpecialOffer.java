package com.juangabrielgomila.shoppingcenter;

/**
 * Created by JuanGabriel on 7/12/17.
 */

public class SpecialOffer implements Item {

    private int baseCost;
    private int quantity;
    private String name;

    private int discount;

    public SpecialOffer(int baseCost, int quantity, String name, int discount){
        this.baseCost = baseCost;
        this.quantity = quantity;
        this.name = name;
        this.discount = discount;
    }

    public int getBaseCost() {
        return baseCost;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
