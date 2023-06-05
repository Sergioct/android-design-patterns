package com.juangabrielgomila.weatherapp;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;

/**
 * Created by JuanGabriel on 7/12/17.
 */

public class Location {

    private  Strategy strategy;

    public Location(Strategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(Context context){
        TextView textView = (TextView) ((Activity) context).findViewById(R.id.text_view);

        textView.setText(strategy.reportCurrentWeather());
    }

}
