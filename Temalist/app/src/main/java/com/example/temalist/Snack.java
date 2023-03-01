package com.example.temalist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Snack extends AppCompatActivity {

    private ListView lstOpciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);

        final String[] datos = new String[]{"Papitas","Chocolates","Batida","Gomitas"};

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,datos);

        lstOpciones = findViewById(R.id.LstOpciones);

        lstOpciones.setAdapter(adaptador);

        lstOpciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                // Obtener el elemento que fue clickeado
                Object item = adapterView.getItemAtPosition(position);

                // Crear un Intent para iniciar la actividad deseada
                if (item == "Papitas") {
                    Intent intent = new Intent(Snack.this, Papitas.class);
                    startActivity(intent);
                } else if (item == "Chocolates") {
                    Intent intent = new Intent(Snack.this, Chocolates.class);
                    startActivity(intent);
                } else if (item == "Batida") {
                    Intent intent = new Intent(Snack.this, Batida.class);
                    startActivity(intent);
                } else if (item == "Gomitas") {
                    Intent intent = new Intent(Snack.this, Gomitas.class);
                    startActivity(intent);
                }
            }
        });
    }
}
