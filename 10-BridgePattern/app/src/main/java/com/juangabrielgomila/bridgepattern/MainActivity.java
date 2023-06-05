package com.juangabrielgomila.bridgepattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        AbstractSandwich openSandwich = new Sandwich("Jamón", "Queso", new OpenSandwich());
        openSandwich.make();

        AbstractSandwich closedSanwich = new Sandwich("Jamón", "Queso", new ClosedSandwich());
        closedSanwich.make();

        AbstractSandwich doubleSandwich = new Sandwich("Jamón", "Queso", new DoubleSandwich());
        doubleSandwich.make();

    }
}
