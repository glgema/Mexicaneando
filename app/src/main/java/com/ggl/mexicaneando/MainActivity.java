package com.ggl.mexicaneando;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton historia = findViewById(R.id.ibHistoria);
        historia.setOnClickListener(this);

        ImageButton lugares = findViewById(R.id.ibLugares);
        lugares.setOnClickListener(this);

        ImageButton comida = findViewById(R.id.ibComida);
        comida.setOnClickListener(this);

        ImageButton fiestas = findViewById(R.id.ibFiestas);
        fiestas.setOnClickListener(this);

        ImageButton mapas = findViewById(R.id.ibMapas);
        mapas.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.ibLugares:
                Intent lugares = new Intent(this, LugaresInteres.class);
                startActivity(lugares);
                break;
            case R.id.ibHistoria:
                Intent historia = new Intent(this, Historia.class);
                startActivity(historia);
                break;
            case R.id.ibComida:
                Intent comida = new Intent(this, Comida.class);
                startActivity(comida);
                break;
            case R.id.ibFiestas:
                Intent fiestas = new Intent(this, Fiestas.class);
                startActivity(fiestas);
                break;
            case R.id.ibMapas:
                Intent mapas = new Intent(this, MapsActivity.class);
                startActivity(mapas );
                break;
        }
    }
}
