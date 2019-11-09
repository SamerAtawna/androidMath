package com.example.myfunction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class calcFormula extends AppCompatActivity {
    String a, b, c;
    TextView x1;
    TextView x2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_formula);
        Intent intent = getIntent();
        x1 = (TextView) findViewById(R.id.textView4);
        x2 = (TextView) findViewById(R.id.textView5);
        a = intent.getStringExtra("a");
        b = intent.getStringExtra("b");
        c = intent.getStringExtra("c");


        double a = Integer.parseInt(this.a);
        double b = Integer.parseInt(this.b);
        double c = Integer.parseInt(this.c);

        Log.d("a", String.valueOf(a));
        Log.d("b", String.valueOf(b));
        Log.d("c", String.valueOf(c));
        double res1 = (-b + (Math.sqrt(Math.pow(b, 2) +( - 4 * a * c)))) / (2 * a);
        double res2 = (-b - (Math.sqrt(Math.pow(b, 2) +( - 4 * a * c)))) / (2 * a);



        x1.setText(String.valueOf((float) res1));
        x2.setText(String.valueOf((float) res2));
    }


}
