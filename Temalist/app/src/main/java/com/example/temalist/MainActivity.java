package com.example.temalist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private Spinner v;
    private ArrayAdapter adaptador;
    String[] datos={"Desayuno","Merienda","Comida","Snack","Cena"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        v=findViewById(R.id.CmbOpciones);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,datos);


        v.setAdapter(adaptador);



        Spinner spinner = (Spinner) findViewById(R.id.CmbOpciones);
    // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
    // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }
    // Implementa el método onItemSelected
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // Código para cuando se selecciona un elemento del AdapterView
        String selectedItem1 = parent.getItemAtPosition(position).toString();
        if (selectedItem1.equals("Desayuno")) {
            Intent i = new Intent(MainActivity.this, Desayuno.class);
            startActivity(i);
        } else if (selectedItem1.equals("Merienda")) {
            Intent i = new Intent(MainActivity.this, Merienda.class);
            startActivity(i);

        } else if (selectedItem1.equals("Comida")) {
            Intent i = new Intent(MainActivity.this, Comida.class);
            startActivity(i);

        } else if (selectedItem1.equals("Snack")) {
            Intent i = new Intent(MainActivity.this, Snack.class);
            startActivity(i);

        } else if (selectedItem1.equals("Cena")) {
            Intent i = new Intent(MainActivity.this, Cena.class);
            startActivity(i);

        }
    }

    // Implementa el método onNothingSelected
    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Código para cuando no se ha seleccionado ningún elemento del AdapterView

    }

    public void GoActividad4 (View view){

        Intent i = new Intent( MainActivity.this, Desayuno.class);
        startActivity(i);
    }

}