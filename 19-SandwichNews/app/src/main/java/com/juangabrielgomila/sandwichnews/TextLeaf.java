package com.juangabrielgomila.sandwichnews;

import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by JuanGabriel on 15/10/17.
 */

public class TextLeaf implements Component {

    public TextView textView;

    public TextLeaf(TextView textView, int id){
        this.textView = textView;
        setContent(id);
    }


    @Override
    public void add(Component component) {

    }

    @Override
    public void setContent(int id) {
        textView.setText(id);

        textView.setPadding(dp(24), dp(0), dp(0), dp(16));

        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);

        textView.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        ));

    }

    @Override
    public void inflate(ViewGroup layout) {
        layout.addView(textView);
    }


    private int dp(int px){
        float scale = textView.getResources().getDisplayMetrics().density;
        return (int) (scale * px + 0.5f);
    }
}
