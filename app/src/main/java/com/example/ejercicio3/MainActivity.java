package com.example.ejercicio3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView panelRojo,panelVerde,panelAzul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        panelRojo = findViewById(R.id.panel_rojo);
        panelAzul = findViewById(R.id.panel_azul);
        panelVerde = findViewById(R.id.panel_verde);

        panelVerde.setOnClickListener(this);
        panelAzul.setOnClickListener(this);
        panelRojo.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int[] colorRojo = {R.color.rojo_1,R.color.rojo_2,R.color.rojo_3,R.color.rojo_4,R.color.rojo_5,R.color.rojo_6};
        int[] colorVerde = {R.color.verde_1,R.color.verde_2,R.color.verde_3,R.color.verde_4,R.color.verde_5,R.color.verde_6};
        int[] colorAzul = {R.color.azul_1,R.color.azul_2,R.color.azul_3,R.color.azul_4,R.color.azul_5,R.color.azul_6};
        switch (v.getId()){
            case R.id.panel_rojo:
                panelRojo.setBackgroundColor(getResources().getColor(colorRojo[(int)Math.floor(Math.random()*6)]));
                break;
            case R.id.panel_azul:
                panelAzul.setBackgroundColor(getResources().getColor(colorAzul[(int)Math.floor(Math.random()*6)]));
                break;
            case R.id.panel_verde:
                panelVerde.setBackgroundColor(getResources().getColor(colorVerde[(int)Math.floor(Math.random()*6)]));
                break;
        }
    }
}
