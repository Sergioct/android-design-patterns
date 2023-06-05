package com.juangabrielgomila.prototypepattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1, t2, t3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (TextView) findViewById(R.id.text_view_1);
        t2 = (TextView) findViewById(R.id.text_view_2);
        t3 = (TextView) findViewById(R.id.text_view_3);


        SequenceCache.loadCache();

        Sequence prime = (Sequence) SequenceCache.getSequence("1");
        t1.setText(new StringBuilder()
                    .append("El número primo 10.000ésimo es: ")
                    .append(prime.getResult())
                    .toString());


        Sequence fibonacci = (Sequence) SequenceCache.getSequence("2");
        t2.setText(new StringBuilder()
                    .append("El número de Fibonacci 1.000ésimo es: ")
                    .append(fibonacci.getResult())
                    .toString());



        Sequence clone = (Fibonacci) new Fibonacci().clone();
        long result = clone.getResult()/5;

        t3.setText(new StringBuilder()
                    .append("El número de Fibonacci clonado y dividido por 5 da")
                    .append(result)
                    .toString());


    }
}
