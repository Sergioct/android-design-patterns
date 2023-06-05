package com.juangabrielgomila.library;

import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.icu.util.GregorianCalendar;
import android.util.Log;

/**
 * Created by JuanGabriel on 4/12/17.
 */

public class SelectedMagazine extends Magazine {

    private static final String TAG = "SelectedMagazine";
    @Override
    protected void date() {
        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat format = new SimpleDateFormat("d-MM-yyyy");

        format.setTimeZone(calendar.getTimeZone());

        Log.d(TAG, "date: "+ format.format(calendar.getTime()));
    }
}
