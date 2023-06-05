package com.juangabrielgomila.decoratorpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.juangabrielgomila.decoratorpattern.bread.Bagel;
import com.juangabrielgomila.decoratorpattern.bread.Bread;
import com.juangabrielgomila.decoratorpattern.bread.LowFatButter;
import com.juangabrielgomila.decoratorpattern.bread.Open;
import com.juangabrielgomila.decoratorpattern.bread.Toasted;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Bread bagel = new Bagel();

        LowFatButter spread = new LowFatButter(bagel);

        Toasted toasted = new Toasted(spread);

        Open open = new Open(toasted);

        Log.d(TAG, open.getDescription() + " : "+open.getKcal());


    }
}
