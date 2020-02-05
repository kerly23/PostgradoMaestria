package com.example.pregradomestria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mButton1;
    Button mButton2;
    Button mButton3;

    String[] urls= new String[2];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1= findViewById(R.id.btnoferta);
        mButton2= findViewById(R.id.btnrequesitos);
        mButton3= findViewById(R.id.btnproceso);



        urls[0]= "http://www.utp.ac.pa/admision-los-programas-de-postgrado-maestrias-y-doctorado";
        urls[1]= "http://www.utp.ac.pa/procedimientos-de-administracion-de-postgrado";

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),WebMenu.class);
                intent.putExtra("links",urls[0]);
                startActivity(intent);
            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),WebMenu.class);
                intent.putExtra("links",urls[1]);
                startActivity(intent);

            }
        });


    }
    public void Facultades(View view){
        Intent facultad = new Intent(this, Facultades.class);
        startActivity(facultad);
    }

}
