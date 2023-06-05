package com.juangabrielgomila.articlemachine;

/**
 * Created by JuanGabriel on 7/12/17.
 */

public class Context {

    private State state;

    public Context(){
        setState(new Locked());
    }


    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }


    public void execute(String input){
        this.state.execute(this, input);
    }
}
