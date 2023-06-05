package com.juangabrielgomila.sandwichnews;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);

        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT)
        );
        setContentView(layout);


        Builder builder = new Builder(this);
        //builder.header.inflate(layout);
        //builder.headline.inflate(layout);

        builder.headerGroup().inflate(layout);


        //builder.sandwichArray().inflate(layout);
        builder.sandwichLayout().inflate(layout);

        builder.storyline().inflate(layout);
    }
}
