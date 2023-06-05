package com.juangabrielgomila.sandwichbuilderpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

import com.juangabrielgomila.sandwichbuilderpattern.ingredient.bread.Bagel;
import com.juangabrielgomila.sandwichbuilderpattern.ingredient.bread.Baguette;
import com.juangabrielgomila.sandwichbuilderpattern.ingredient.bread.Bread;
import com.juangabrielgomila.sandwichbuilderpattern.ingredient.bread.decorator.Toasted;
import com.juangabrielgomila.sandwichbuilderpattern.ingredient.filling.Cheese;
import com.juangabrielgomila.sandwichbuilderpattern.ingredient.filling.Ham;
import com.juangabrielgomila.sandwichbuilderpattern.ingredient.Salt;

public class MainActivity extends AppCompatActivity {

    public SandwichBuilder builder;
    public Sandwich sandwich;
    public Bread bread;

    public RadioButton bagel, baguette;
    public CheckBox ham, cheese;
    public Switch salt, toasted;

    public TextView order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bagel = (RadioButton) findViewById(R.id.radio_bgel);
        baguette = (RadioButton) findViewById(R.id.radio_baguette);

        ham = (CheckBox) findViewById(R.id.check_ham);
        cheese = (CheckBox) findViewById(R.id.check_cheese);

        salt = (Switch) findViewById(R.id.switch_salt);
        toasted = (Switch) findViewById(R.id.switch_toasted);

        order = (TextView) findViewById(R.id.text_view_order);

    }




    public void actionOkClicked(View view){

        builder = new SandwichBuilder();
        sandwich = new Sandwich();

        if (bagel.isChecked()){
            sandwich = builder.build(sandwich, new Bagel());
        } else if(baguette.isChecked()){
            sandwich = builder.build(sandwich, new Baguette());
        }


        if(ham.isChecked()){
            sandwich = builder.build(sandwich, new Ham());
        }

        if(cheese.isChecked()){
            sandwich = builder.build(sandwich, new Cheese());
        }


        if(salt.isChecked()){
            sandwich = builder.build(sandwich, new Salt());
        }


        String toast = "";
        int extraKcal=0;
        if (toasted.isChecked()){
            Toasted t = new Toasted(bread);
            toast = t.getDecoration();
            extraKcal = t.kcal();
        }


        order.setText(new StringBuilder()
                    .append(toast  + " ")
                    .append(sandwich.getSandwich())
                    .append("\n")
                    .append(sandwich.getKcal()+extraKcal)
                    .append(" kcal")
                    .toString());

    }
}
