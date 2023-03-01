package com.example.tabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Registro extends Fragment {

    //Variables para el usuario y contraseña
    private final String USUARIO = "admin";
    private final String CONTRASENA = "1234";

    //Declaración de los elementos del formulario
    private EditText etNombre;
    private EditText etUsuario;
    private EditText etContrasena;
    private Button btnRegistrar;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.xml2, container, false);

        //Inicialización de los elementos del formulario
        etNombre = view.findViewById(R.id.et_nombre);
        etUsuario = view.findViewById(R.id.et_usuario);
        etContrasena = view.findViewById(R.id.et_contrasena);
        btnRegistrar = view.findViewById(R.id.btn_registrar);

        //Asignación del evento onClick al botón de registro
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registrarUsuario();
            }
        });

        return view;
    }

    private void registrarUsuario() {
        //Obtención de los valores ingresados por el usuario
        String nombre = etNombre.getText().toString();
        String usuario = etUsuario.getText().toString();
        String contrasena = etContrasena.getText().toString();

        //Validación de que los campos no estén vacíos
        if (nombre.isEmpty() || usuario.isEmpty() || contrasena.isEmpty()) {
            Toast.makeText(getContext(), "Debes llenar todos los campos", Toast.LENGTH_SHORT).show();
            return;
        }

        //Validación de que el usuario y contraseña sean correctos
        if (usuario.equals(USUARIO) && contrasena.equals(CONTRASENA)) {
            //Mostrar mensaje de bienvenida con el nombre ingresado
            Toast.makeText(getContext(), "¡Bienvenido, " + nombre + "!", Toast.LENGTH_SHORT).show();

            //Ocultar los tabs y mostrar el layout de bienvenida
            MainActivity activity = (MainActivity) getActivity();
            if (activity != null) {
                activity.mostrarBienvenida(nombre);
                activity.ocultarTabs();
            }
        } else {
            //Mostrar mensaje de error
            Toast.makeText(getContext(), "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
        }
    }

}
