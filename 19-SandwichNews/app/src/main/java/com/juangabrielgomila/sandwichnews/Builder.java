package com.juangabrielgomila.sandwichnews;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by JuanGabriel on 15/10/17.
 */

public class Builder {

    Context context;
    Component header, headline;

    public Builder(Context context){
        this.context = context;
        init();
    }

    public void init(){
        header = new ImageLeaf(new ImageView(context), R.drawable.bocadillo0);
        headline = new TextLeaf(new TextView(context), R.string.headline);
    }


    public Component headerGroup(){
        Component c = new CompositeImage(new ImageView(context), R.drawable.bocadillo0);
        c.add(headline);
        return c;
    }

    public TextLeaf setText(int t){
        TextLeaf leaf = new TextLeaf(new TextView(context), t);
        return leaf;
    }

    public ImageLeaf setImage(int i){
        ImageLeaf leaf = new ImageLeaf(new ImageView(context), i);
        return leaf;
    }



    Component sandwichArray(){
        Component c = new CompositeShell();

        c.add(setImage(R.drawable.bocadillo1));
        c.add(setImage(R.drawable.bocadillo2));
        c.add(setImage(R.drawable.bocadillo3));

        return c;
    }


    Component sandwichLayout(){
        Component c = new CompositeLayout(new LinearLayout(context), R.color.colorAccent);
        c.add(sandwichArray());
        return c;
    }


    Component storyline(){
        Component c = new CompositeImage(new ImageView(context), R.drawable.bocadillo2);
        c.add(setText(R.string.greetings));
        return c;
    }


}
