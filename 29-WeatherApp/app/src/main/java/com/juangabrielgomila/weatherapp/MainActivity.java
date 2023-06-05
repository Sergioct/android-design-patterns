package com.juangabrielgomila.weatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Location location;

        String locationName = "Cuba";

        switch (locationName){
            case "London":
                location = new Location(new London());
                break;

            case "Cuba":
                location = new Location(new Cuba());
                break;

            case "Egypt":
                location = new Location(new Egypt());
                break;

            default:
                location = new Location(new London());
                break;
        }

        location.executeStrategy(this);


    }
}
