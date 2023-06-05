package com.juangabrielgomila.templatepattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Story story = new News();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.button_change);
        button.setOnClickListener(this);

        story.publish(this);
    }

    @Override
    public void onClick(View view) {
        if (story.source == "Noticias"){
            story = new Sports();
        } else {
            story = new News();
        }

        story.publish(this);
    }
}
