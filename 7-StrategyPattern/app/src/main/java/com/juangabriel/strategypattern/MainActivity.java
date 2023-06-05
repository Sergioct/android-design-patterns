package com.juangabriel.strategypattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public SinglePrice singlePrice = SinglePrice.getInstance();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        singlePrice.setPrice(2.5f);


        Button actionCash = (Button) findViewById(R.id.action_cash);
        Button actionCard = (Button) findViewById(R.id.action_card);
        Button actionCoupon = (Button) findViewById(R.id.action_coupon);

        actionCash.setOnClickListener(this);
        actionCard.setOnClickListener(this);
        actionCoupon.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Payment p;

        switch (view.getId()){

            case R.id.action_card:
                p = new Payment(new Card());
                break;

            case R.id.action_coupon:
                p = new Payment(new Coupon());
                break;

            case R.id.action_cash:

            default:
                p = new Payment(new Cash());
                break;


        }

        String finalPrice = new StringBuilder()
                .append("Precio final: ")
                .append(p.employStrategy(singlePrice.getPrice()))
                .append(" €")
                .toString();

        Toast t = Toast.makeText(this, finalPrice, Toast.LENGTH_LONG);
        t.show();

    }
}
