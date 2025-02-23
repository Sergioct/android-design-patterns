package com.juangabrielgomila.reminders;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onCreateClick(View v){
        Intent intent = new Intent(MainActivity.this, Reminder.class);
        startService(intent);
    }

    public void onCancelClick(View v){
        Intent intent = new Intent(MainActivity.this, Reminder.class);
        stopService(intent);
    }
}
