package com.juangabrielgomila.criteriapattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv = (TextView) findViewById(R.id.text_view);

        List<Ingredient> ingredients = new ArrayList<Ingredient>();

        ingredients.add(new Ingredient("Queso", "Producto Local", true));
        ingredients.add(new Ingredient("Tomate", "Valencia", true));
        ingredients.add(new Ingredient("Jamón York", "Salamanca", false));
        ingredients.add(new Ingredient("Pavo", "Producto Local", false));
        ingredients.add(new Ingredient("Lechuga", "Producto Local", true));
        ingredients.add(new Ingredient("Chorizo", "Perú", false));



        Filter vegetarian = new VegetarianFilter();
        Filter local = new LocalFilter();
        Filter nonLocal = new NonLocalFilter();
        Filter localAndVegetarian = new AndCriteria(local, vegetarian);
        Filter localOrVegetarian = new OrCriteria(local, vegetarian);



        printIngredients(local.meetCriteria(ingredients), "LOCAL");
        printIngredients(nonLocal.meetCriteria(ingredients), "\nNON LOCAL");
        printIngredients(vegetarian.meetCriteria(ingredients), "\nVEGETARIAN");
        printIngredients(localAndVegetarian.meetCriteria(ingredients), "\nLOCAL AND VEGETARIAN");
        printIngredients(localOrVegetarian.meetCriteria(ingredients), "\nENVIRONMENTALLY FRIENDLY");

    }



    public void printIngredients(List<Ingredient> ingredients, String header){
        tv.append(header+"\n");

        for (Ingredient i : ingredients){
            tv.append(new StringBuilder()
                    .append(i.getName())
                    .append(" ")
                    .append(i.getLocal())
                    .append("\n")
                    .toString()
            );
        }
    }
}
