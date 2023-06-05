package com.juangabrielgomila.secretsandwich;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    String filename = "myFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
    }



    public void saveFile(View v){

        try {
            OutputStreamWriter writer = new OutputStreamWriter(openFileOutput(filename, 0));
            writer.write(editText.getText().toString());
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public void loadFile(View v){

        try{
            InputStream stream = openFileInput(filename);
            if (stream!=null){
                InputStreamReader inputStreamReader = new InputStreamReader(stream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                String line;
                StringBuilder builder = new StringBuilder();

                while ((line = bufferedReader.readLine())!=null){
                    builder.append(line)
                            .append("\n");
                }

                stream.close();
                editText.setText(builder.toString());

            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
