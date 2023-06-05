package com.juangabrielgomila.observerpatternjava;

import android.app.NotificationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    Sandwich sandwich = new Sandwich(false);
    Order order = new Order();

    int notificationID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void onOrderClick(View v){
        sandwich.addObserver(order);
        sandwich.setReady(false);
        sendNotification(order.getUpdate());
    }

    public void onUpdateClick(View v){
        sandwich.setReady(true);
        sendNotification(order.getUpdate());
    }


    public void sendNotification(String message){
        NotificationCompat.Builder builder =
                (NotificationCompat.Builder) new NotificationCompat.Builder(this)
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setContentTitle("Sandwich Builder")
                        .setContentText(message);

        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        manager.notify(notificationID, builder.build());

        notificationID++;
    }
}
