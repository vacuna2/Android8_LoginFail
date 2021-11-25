package com.example.loginfail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void REGISTRARSE(View view) {

        startActivity(new Intent(this,MainActivity2.class));
    }

    public void SALIR(View view) {
        finish();
    }

    public void CALCULAR(View view) {
    }

    public void LIMPIAR(View view) {
    }
}