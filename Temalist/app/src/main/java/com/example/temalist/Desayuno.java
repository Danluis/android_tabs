package com.example.temalist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Desayuno extends AppCompatActivity {

    private ListView lstOpciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desayuno);

        final String[] datos = new String[]{"Panqueques","cereal con leche","sandwich","frutas"};

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,datos);

        lstOpciones = findViewById(R.id.LstOpciones);

        lstOpciones.setAdapter(adaptador);

        lstOpciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                // Obtener el elemento que fue clickeado
                Object item = adapterView.getItemAtPosition(position);

                // Crear un Intent para iniciar la actividad deseada
                if (item == "Panqueques") {
                    Intent intent = new Intent(Desayuno.this, panqueques.class);
                    startActivity(intent);
                } else if (item == "cereal con leche") {
                    Intent intent = new Intent(Desayuno.this, cereal.class);
                    startActivity(intent);
                } else if (item == "sandwich") {
                    Intent intent = new Intent(Desayuno.this, sandwich.class);
                    startActivity(intent);
                } else if (item == "frutas") {
                    Intent intent = new Intent(Desayuno.this, frutas.class);
                    startActivity(intent);
                }
            }
        });
    }
}
