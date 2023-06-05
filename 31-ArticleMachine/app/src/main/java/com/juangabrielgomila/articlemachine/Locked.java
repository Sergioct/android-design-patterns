package com.juangabrielgomila.articlemachine;


import java.util.Objects;

/**
 * Created by JuanGabriel on 7/12/17.
 */

public class Locked implements State {
    @Override
    public void execute(Context context, String input) {

        if (Objects.equals(input, "coin")){
            Output.setOutput("Por favor, tira de la palanca");
            context.setState(new Unlocked());
        }else {
            Output.setOutput("Inserta una moneda para jugar");
        }


    }
}
