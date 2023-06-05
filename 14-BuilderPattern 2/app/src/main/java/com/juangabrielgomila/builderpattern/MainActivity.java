package com.juangabrielgomila.builderpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.juangabrielgomila.builderpattern.builder.LayoutBuilder;
import com.juangabrielgomila.builderpattern.builder.LayoutView;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    TextView textView;
    LinearLayout layout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final int width = ViewGroup.LayoutParams.MATCH_PARENT;
        final int height = ViewGroup.LayoutParams.MATCH_PARENT;

        super.onCreate(savedInstanceState);

        layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setLayoutParams(new ViewGroup.LayoutParams(width, height));

        setContentView(layout);


        LayoutBuilder builder = new LayoutBuilder();
        List<LayoutView> layoutViews = builder.displayFullyDetailed();
        for (LayoutView layoutView : layoutViews){
            ViewGroup.LayoutParams params = layoutView.layoutparams();

            textView = new TextView(this);
            textView.setLayoutParams(params);
            textView.setText(layoutView.content());
            textView.setTextSize(layoutView.textSize());
            textView.setTextColor(layoutView.shading().shade());
            textView.setBackgroundResource(layoutView.shading().background());

            int[] padding = layoutView.padding();
            textView.setPadding(dp(padding[0]), dp(padding[1]), dp(padding[2]), dp(padding[3]));

            layout.addView(textView);
        }

    }


    public int dp(int px){
        final float scaleFactor = getResources().getDisplayMetrics().density;

        int numberOfRealPixels = (int) ( px*scaleFactor + 0.5f);

        Log.d("DP","px"+px+ "dp: "+scaleFactor + " pixeles" + numberOfRealPixels);

        return numberOfRealPixels;

    }
}
