package com.example.myfunction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText a;
    EditText b;
    EditText c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = (EditText) findViewById(R.id.editText);
        b = (EditText) findViewById(R.id.editText2);
        c = (EditText) findViewById(R.id.editText3);
    }

    public void move(View view) {
        Intent g = new Intent(this, calcFormula.class);
        g.putExtra("a", a.getText().toString());
        g.putExtra("b", b.getText().toString());
        g.putExtra("c", c.getText().toString());
        startActivity(g);
    }


}
