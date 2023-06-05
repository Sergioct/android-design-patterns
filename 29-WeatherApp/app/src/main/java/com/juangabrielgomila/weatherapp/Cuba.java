package com.juangabrielgomila.weatherapp;

/**
 * Created by JuanGabriel on 7/12/17.
 */

public class Cuba implements Strategy {
    @Override
    public String reportCurrentWeather() {
        return "Mucho sol y mucha playa";
    }
}
