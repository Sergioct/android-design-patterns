package com.juangabrielgomila.library;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ReadingMaterial document = new SelectedBook();
        document.fetchDocument();


        Log.d("", "==============================");

        ReadingMaterial document2 = new SelectedMagazine();
        document2.fetchDocument();


    }
}
