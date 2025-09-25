package com.example.actividad_24_09_mdc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class VistaFoto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_foto);

        TextView textView2 = findViewById(R.id.textView2);
        Intent intent = getIntent();
        if (intent.hasExtra("nombre_usuario")) {
            String nombreUsuario = intent.getStringExtra("nombre_usuario");
            textView2.setText("Hola, " + nombreUsuario);
        }
    }
}
