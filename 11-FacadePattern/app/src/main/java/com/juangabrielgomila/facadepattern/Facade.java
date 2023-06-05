package com.juangabrielgomila.facadepattern;

/**
 * Created by JuanGabriel on 8/10/17.
 */

public class Facade {

    private Product apple, coke, crisps, juice;


    public Facade(){
        apple = new Apple();
        coke = new Coke();
        crisps = new Crisps();
        juice = new Juice();
    }

    public int dispenseApple(){
        return apple.dispense();
    }

    public int dispenseCoke(){
        return coke.dispense();
    }

    public int dispenseCrisps(){
        return crisps.dispense();
    }

    public int dispenseJuice(){
        return juice.dispense();
    }

}
