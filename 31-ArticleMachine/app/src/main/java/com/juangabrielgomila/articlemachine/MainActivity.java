package com.juangabrielgomila.articlemachine;

import android.content.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tv;
    Button buttonCoin, buttonPush;

    Context context = new Context();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.textView);
        buttonCoin = (Button) findViewById(R.id.button_coin);
        buttonPush = (Button) findViewById(R.id.button_push);

        buttonCoin.setOnClickListener(this);
        buttonPush.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_coin:
                context.execute("coin");
                break;
            case R.id.button_push:
                context.execute("push");
                break;
        }

        tv.setText(Output.getOutput());
    }
}
