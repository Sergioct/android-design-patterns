package com.juangabrielgomila.shoppingcenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Item[] items = new Item[]{
                new CannedFood(120, "Coca cola"),
                new FreshFood(60, 2, "Plátanos"),
                new FreshFood(55, 4, "Tomates"),
                new CannedFood(185, "Caja de Leche"),
                new SpecialOffer(220, 8, "Hierbas Dulces", 2)
        };

        int total = totalCost(items);

        Log.d(TAG, "Precio final de la compra: "+total);




    }




    private int totalCost(Item[] items){
        Visitor visitor = new Checkout();
        int total = 0;
        for (Item i : items){
            System.out.println();
            total += i.accept(visitor);
        }

        return  total;
    }
}
