package com.juangabrielgomila.shoppingcenter;

/**
 * Created by JuanGabriel on 7/12/17.
 */

public interface Visitor {

    int visit(CannedFood cannedFood);

    int visit(FreshFood freshFood);

    int visit(SpecialOffer specialOffer);

}
