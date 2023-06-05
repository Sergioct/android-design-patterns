package com.juangabrielgomila.templatepattern;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by JuanGabriel on 26/11/17.
 */

public class Sports extends Story {
    TextView textTitle;
    TextView textContent;
    ImageView imageView;


    @Override
    protected void init(Context context) {
        source = "Deportes";
        textTitle = (TextView) ((Activity) context).findViewById(R.id.text_view_title);
        textContent = (TextView) ((Activity) context).findViewById(R.id.text_view_content);
        imageView = (ImageView) ((Activity) context).findViewById(R.id.image_view_content);
    }

    @Override
    protected void setTitle(Context context) {
        textTitle.setText(context.getString(R.string.sports_title));
    }

    @Override
    protected void setImage(Context context) {
        imageView.setImageResource(R.drawable.hamilton);
    }

    @Override
    protected void setText(Context context) {
        textContent.setText(context.getString(R.string.sports_content));
    }
}
