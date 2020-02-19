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
        urls[2] ="";
        urls[3] ="";
        urls[4] ="";
        urls[5] ="";

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

                }
            }

        });
    }


}