package com.example.pregradomestria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
    }
}
