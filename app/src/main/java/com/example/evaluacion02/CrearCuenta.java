package com.example.evaluacion02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CrearCuenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);
    }

    public void GoToHome(View view) {
        Intent activity = new Intent(this, Home.class);
        startActivity(activity);
        Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show();
    }

    public void Volver (View view){
        Intent activity=new Intent (this,MainActivity.class);
        startActivity(activity);
    }
}