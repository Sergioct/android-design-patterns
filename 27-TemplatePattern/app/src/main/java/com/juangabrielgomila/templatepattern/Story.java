package com.juangabrielgomila.templatepattern;

import android.app.Activity;
import android.content.Context;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.icu.util.GregorianCalendar;
import android.widget.TextView;

/**
 * Created by JuanGabriel on 26/11/17.
 */

public abstract class Story {

    public String source;

    public void publish(Context context){
        init(context);
        setDate(context);
        setTitle(context);
        setImage(context);
        setText(context);
    }


    protected abstract void init(Context context);
    protected abstract void setTitle(Context context);
    protected abstract void setImage(Context context);
    protected abstract void setText(Context context);


    protected void setDate(Context context){
        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat format = new SimpleDateFormat("MMMM d, yyyy");//a M d, h m s

        format.setTimeZone(calendar.getTimeZone());

        TextView textDate = (TextView) ((Activity) context).findViewById(R.id.text_view_date);
        textDate.setText(format.format(calendar.getTime()));

    }


}
