package com.juangabrielgomila.templatepattern;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by JuanGabriel on 26/11/17.
 */

public class News extends Story {

    TextView textTitle;
    TextView textContent;
    ImageView imageView;


    @Override
    protected void init(Context context) {
        source = "Noticias";
        textTitle = (TextView) ((Activity) context).findViewById(R.id.text_view_title);
        textContent = (TextView) ((Activity) context).findViewById(R.id.text_view_content);
        imageView = (ImageView) ((Activity) context).findViewById(R.id.image_view_content);
    }

    @Override
    protected void setTitle(Context context) {
        textTitle.setText(context.getString(R.string.news_title));
    }

    @Override
    protected void setImage(Context context) {
        imageView.setImageResource(R.drawable.bitcoin);
    }

    @Override
    protected void setText(Context context) {
        textContent.setText(context.getString(R.string.news_content));
    }
}
