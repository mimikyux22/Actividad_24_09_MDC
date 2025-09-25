package com.example.actividad_24_09_mdc;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    public Button btnCrearFoto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        btnCrearFoto = findViewById(R.id.btnCrearFoto);

        btnCrearFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sIntent = new Intent(MainActivity.this, InicioActivity.class);
                startActivity(sIntent);
            }
        });
    }

    public void CambiarVistaMainAInicio(View view){
                Intent sIntent = new Intent(MainActivity.this, InicioActivity.class);
                startActivity(sIntent);
            }
        }

