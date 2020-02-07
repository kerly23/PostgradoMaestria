package com.example.pregradomestria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fsistemas extends AppCompatActivity {
    Button auditoria;
    String[] urls = new String[1];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fsistemas);

        auditoria = findViewById(R.id.btnauditoria);

        urls[0] ="http://www.fisc.utp.ac.pa/maestria-y-postgrado-en-auditoria-de-sistemas-y-evaluacion-de-control-informatico";

        auditoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),webfacultades.class);
                intent.putExtra("links",urls[0]);
                startActivity(intent);
            }
        });
    }
}
