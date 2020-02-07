package com.example.pregradomestria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fsistemas extends AppCompatActivity {

    Button pauditoria;
    Button pinformatica;
    Button ping;
    Button predes;
    Button mauditoria;
    Button minformatica;
    Button ming;
    Button mredes;
    Button mseguridad;
    Button mciencias;

    String[] urls = new String[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fsistemas);

        pauditoria = findViewById(R.id.btnpauditoria);
        pinformatica = findViewById(R.id.btnpinformatica);
        ping = findViewById(R.id.btnping);
        predes= findViewById(R.id.btnpredes);

        mauditoria = findViewById(R.id. btnmauditoria);
        minformatica= findViewById(R.id.btnminformatica);
        ming= findViewById(R.id.btnming);
        mredes=findViewById(R.id.btnmredes);
        mseguridad= findViewById(R.id.btnmseguridad);
        mciencias = findViewById(R.id.btnmciencias);


        urls[0] ="http://www.fisc.utp.ac.pa/maestria-y-postgrado-en-auditoria-de-sistemas-y-evaluacion-de-control-informatico";
        urls[1]="http://www.fisc.utp.ac.pa/maestria-y-postgrado-en-informatica-educativa";
        urls[2]="http://www.fisc.utp.ac.pa/maestria-y-postgrado-en-ingenieria-de-software";
        urls[3]="http://www.fisc.utp.ac.pa/ofertas-academicas/maestrias-y-postgrados/maestria-y-postgrado-en-redes-de-comunicacion-de-datos";

        urls[4]="http://www.fisc.utp.ac.pa/maestria-y-postgrado-en-auditoria-de-sistemas-y-evaluacion-de-control-informatico";
        urls[5]="http://www.fisc.utp.ac.pa/maestria-y-postgrado-en-informatica-educativa";
        urls[6]="http://www.fisc.utp.ac.pa/maestria-y-postgrado-en-ingenieria-de-software";
        urls[7]="http://www.fisc.utp.ac.pa/ofertas-academicas/maestrias-y-postgrados/maestria-y-postgrado-en-redes-de-comunicacion-de-datos";
        urls[8]="http://www.fisc.utp.ac.pa/maestria-en-seguridad-informatica";
        urls[9]="http://www.fisc.utp.ac.pa/maestria-en-ciencias-de-tecnologia-de-la-informacion-y-comunicacion";

        pauditoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),webfacultades.class);
                intent.putExtra("links",urls[0]);
                startActivity(intent);
            }
        });

        pinformatica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),webfacultades.class);
                intent.putExtra("links",urls[1]);
                startActivity(intent);
            }
        });

        ping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),webfacultades.class);
                intent.putExtra("links",urls[2]);
                startActivity(intent);
            }
        });

        predes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),webfacultades.class);
                intent.putExtra("links",urls[3]);
                startActivity(intent);
            }
        });


        mauditoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),webfacultades.class);
                intent.putExtra("links",urls[4]);
                startActivity(intent);
            }
        });

        minformatica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),webfacultades.class);
                intent.putExtra("links",urls[5]);
                startActivity(intent);
            }
        });

        ming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),webfacultades.class);
                intent.putExtra("links",urls[6]);
                startActivity(intent);
            }
        });

        mredes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),webfacultades.class);
                intent.putExtra("links",urls[7]);
                startActivity(intent);
            }
        });

        mseguridad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),webfacultades.class);
                intent.putExtra("links",urls[8]);
                startActivity(intent);
            }
        });

        mciencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),webfacultades.class);
                intent.putExtra("links",urls[9]);
                startActivity(intent);
            }
        });
    }
}
