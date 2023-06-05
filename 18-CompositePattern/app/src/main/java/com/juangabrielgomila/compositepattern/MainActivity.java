package com.juangabrielgomila.compositepattern;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Builder builder = new Builder();

        builder.listview.inflate();

        builder.layout1().inflate();

        builder.layout2().inflate();

        builder.layout3().inflate();


    }
}
