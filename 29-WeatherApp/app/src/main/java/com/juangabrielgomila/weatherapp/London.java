package com.juangabrielgomila.weatherapp;

/**
 * Created by JuanGabriel on 7/12/17.
 */

public class London implements Strategy {
    @Override
    public String reportCurrentWeather() {
        return "Terriblemente frío y húmedo";
    }
}
