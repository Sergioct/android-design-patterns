package com.juangabrielgomila.articlemachine;

/**
 * Created by JuanGabriel on 7/12/17.
 */

public interface State {

    void execute(Context context, String input);

}
