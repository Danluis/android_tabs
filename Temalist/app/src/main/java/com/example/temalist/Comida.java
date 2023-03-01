package com.example.temalist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Comida extends AppCompatActivity {

    private ListView lstOpciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comida);

        final String[] datos = new String[]{"Arroz con huevo","Spaguetis","Sancocho","Pizza"};

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,datos);

        lstOpciones = findViewById(R.id.LstOpciones);

        lstOpciones.setAdapter(adaptador);

        lstOpciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                // Obtener el elemento que fue clickeado
                Object item = adapterView.getItemAtPosition(position);

                // Crear un Intent para iniciar la actividad deseada
                if (item == "Arroz con huevo") {
                    Intent intent = new Intent(Comida.this, Arroz.class);
                    startActivity(intent);
                } else if (item == "Spaguetis") {
                    Intent intent = new Intent(Comida.this, Spaguetis.class);
                    startActivity(intent);
                } else if (item == "Sancocho") {
                    Intent intent = new Intent(Comida.this, Sancocho.class);
                    startActivity(intent);
                } else if (item == "Pizza") {
                    Intent intent = new Intent(Comida.this, Pizza.class);
                    startActivity(intent);
                }
            }
        });
    }
}
