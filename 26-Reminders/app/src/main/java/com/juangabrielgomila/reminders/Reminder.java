package com.juangabrielgomila.reminders;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by JuanGabriel on 22/11/17.
 */

public class Reminder extends Service {


    private static final String TAG = "Reminder Service";

    NotificationCompat.Builder builder;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        Log.d(TAG, "Servicio creado");
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "Servicio destruido");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Log.d(TAG, "Hemos arrancado el servicio con Start Command");

        builder = new NotificationCompat.Builder(this)
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setContentTitle("Recordatorio")
                        .setContentText("Tu bocadillo está listo para ser recogido");


        new Thread(new Runnable() {
            @Override
            public void run() {

                Timer t = new Timer();
                t.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                        manager.notify(0, builder.build());
                        cancel();
                    }
                }, 1000 * 20);

                //Finaliza y destruye el servicio...
                //stopSelf();

            }
        }).start();


        return Service.START_STICKY;
    }
}
