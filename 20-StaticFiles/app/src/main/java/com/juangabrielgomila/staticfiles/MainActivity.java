package com.juangabrielgomila.staticfiles;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView = (TextView) findViewById(R.id.textview);
        String data = readFile(this, R.raw.sandwich);

        textView.setText(data);

    }



    public static String readFile(Context context, int resID){
        InputStream stream = context.getResources().openRawResource(resID);

        InputStreamReader inputReader = new InputStreamReader(stream);

        BufferedReader bufferedReader = new BufferedReader(inputReader);

        String currentLine;

        StringBuilder builder = new StringBuilder();

        try {
            while ((currentLine = bufferedReader.readLine()) != null)
            {
                builder.append(currentLine).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return builder.toString();

    }
}
