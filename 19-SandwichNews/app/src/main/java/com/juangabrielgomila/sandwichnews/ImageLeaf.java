package com.juangabrielgomila.sandwichnews;

import android.media.Image;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by JuanGabriel on 15/10/17.
 */

public class ImageLeaf implements Component {

    private ImageView imageView;

    public ImageLeaf(ImageView imageView, int id){
        this.imageView = imageView;
        setContent(id);
    }


    @Override
    public void add(Component component) {

    }

    @Override
    public void setContent(int id) {


        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);

        imageView.setPadding(dp(4), dp(4), dp(4), dp(4));


        imageView.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                dp(120))
        );



        imageView.setImageResource(id);
    }

    @Override
    public void inflate(ViewGroup layout) {
        layout.addView(imageView);
    }


    private int dp(int px){
        float scale = imageView.getResources().getDisplayMetrics().density;
        return (int) (scale * px + 0.5f);
    }
}
