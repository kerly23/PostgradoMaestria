package com.example.pregradomestria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Facultades extends AppCompatActivity {
    Button sistemas;
    Button mecanica;
    Button industrial;
    Button electrica;
    Button civil;
    Button ciencias;

    String[] urls = new String[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facultades);


    }
    public void Sistemas(View view){
        Intent sistemas = new Intent(this, Fsistemas.class);
        startActivity(sistemas);
    }

    public void Mecanica (View view){
        Intent mecanica = new Intent(this, fmecanica.class);
        startActivity(mecanica);
    }

    public void Industrial (View view){
        Intent industrial = new Intent(this, findustrial.class);
        startActivity(industrial);
    }

}
