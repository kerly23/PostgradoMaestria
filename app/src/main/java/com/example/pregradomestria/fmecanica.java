package com.example.pregradomestria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class fmecanica extends AppCompatActivity {
    ListView listpostgrados;
    ArrayList <String> names;
    String[] urls = new String[6];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fmecanica);

        listpostgrados = (ListView) findViewById(R.id.listpostgrados);
        names = new ArrayList<String>();
        names.add("Postgrado en Ingeniería de Planta");
        names.add("Postgrado en Mantenimiento de Plantas");

        names.add("Maestría en Ciencias de la Ingeniería Mecánica con Especialización");
        names.add("Maestría en Energías Renovables y Ambiente");
        names.add("Maestría en Ingeniería de Planta");
        names.add("Maestría en Mantenimiento de Plantas");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        listpostgrados.setAdapter(adapter);

        urls[0] ="http://www.fim.utp.ac.pa/maestria-en-ciencias-de-la-ingenieria-mecanica";
        urls[1] ="http://www.fii.utp.ac.pa/dual-master-georgia-tech-utp-admission-process";
        urls[2] ="http://www.fim.utp.ac.pa/maestria-en-ciencias-de-la-ingenieria-mecanica";
        urls[3] ="http://www.fim.utp.ac.pa/postgrado-y-maestr%C3%ADa-en-energ%C3%ADas-renovables-y-ambiente";
        urls[4] ="http://www.fim.utp.ac.pa/maestria-en-ciencias-de-la-ingenieria-mecanica";
        urls[5] ="http://www.fim.utp.ac.pa/maestria-en-ciencias-de-la-ingenieria-mecanica";

        listpostgrados.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getApplicationContext(),webfacultades.class);
                        intent.putExtra("links",urls[0]);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent i = new Intent(getApplicationContext(),webfacultades.class);
                        i.putExtra("links",urls[1]);
                        startActivity(i);
                        break;
                    case 2:
                        Intent intent1 = new Intent(getApplicationContext(),webfacultades.class);
                        intent1.putExtra("links",urls[2]);
                        startActivity(intent1);
                        break;
                    case 3:
                        Intent intent2 = new Intent(getApplicationContext(),webfacultades.class);
                        intent2.putExtra("links",urls[3]);
                        startActivity(intent2);
                        break;
                    case 4:
                        Intent intent3 = new Intent(getApplicationContext(),webfacultades.class);
                        intent3.putExtra("links",urls[4]);
                        startActivity(intent3);
                        break;
                    case 5:
                        Intent intent4 = new Intent(getApplicationContext(),webfacultades.class);
                        intent4.putExtra("links",urls[5]);
                        startActivity(intent4);
                        break;

                }
            }

        });
    }
}