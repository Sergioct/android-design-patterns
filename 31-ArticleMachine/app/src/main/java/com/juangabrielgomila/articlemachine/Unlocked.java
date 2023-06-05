package com.juangabrielgomila.articlemachine;

import java.util.Objects;

/**
 * Created by JuanGabriel on 7/12/17.
 */

public class Unlocked implements State {
    @Override
    public void execute(Context context, String input) {
        if (Objects.equals(input,"coin")){
            Output.setOutput("Ya has pagado la tirada!");
        } else {
            Output.setOutput("Gracias por jugar");
            context.setState(new Locked());
        }
    }
}
