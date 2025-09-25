package com.example.actividad_24_09_mdc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class InicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        EditText editTextNombre = findViewById(R.id.editTextNombre);
        Button buttonCrear = findViewById(R.id.button);

        buttonCrear.setOnClickListener(v -> {
            String nombre = editTextNombre.getText().toString();
            Intent intent = new Intent(InicioActivity.this, VistaFoto.class);
            intent.putExtra("nombre_usuario", nombre);
            startActivity(intent);
        });
    }
}
