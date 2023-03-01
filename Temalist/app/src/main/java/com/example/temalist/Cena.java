package com.example.temalist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Cena extends AppCompatActivity {

    private ListView lstOpciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cena);

        final String[] datos = new String[]{"Pavo","Pollo","Mangu y Salami","Yuca y queso"};

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,datos);

        lstOpciones = findViewById(R.id.LstOpciones);

        lstOpciones.setAdapter(adaptador);

        lstOpciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                // Obtener el elemento que fue clickeado
                Object item = adapterView.getItemAtPosition(position);

                // Crear un Intent para iniciar la actividad deseada
                if (item == "Pavo") {
                    Intent intent = new Intent(Cena.this, Pavo.class);
                    startActivity(intent);
                } else if (item == "Pollo") {
                    Intent intent = new Intent(Cena.this, Pollo.class);
                    startActivity(intent);
                } else if (item == "Mangu y Salami") {
                    Intent intent = new Intent(Cena.this, Mangu.class);
                    startActivity(intent);
                } else if (item == "Yuca y queso") {
                    Intent intent = new Intent(Cena.this, Yuca.class);
                    startActivity(intent);
                }
            }
        });
    }
}
