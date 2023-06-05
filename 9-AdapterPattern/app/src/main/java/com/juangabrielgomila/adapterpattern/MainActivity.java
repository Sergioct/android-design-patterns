package com.juangabrielgomila.adapterpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        OldLocation oldLocation = new CustomerLocation();
        oldLocation.setBuilding("Banco Central de JB");
        oldLocation.setFloor(5);
        oldLocation.setDesk(29);


        TextView t = (TextView) findViewById(R.id.text_view);

        NewLocation newLocation = new Adapter(oldLocation);


        t.setText(new StringBuilder()
                .append(newLocation.getBuilding())
                .append(", piso ")
                .append(newLocation.getFloor())
                .append(", mesa ")
                .append(newLocation.getDesk())
                .toString()
        );

    }
}
