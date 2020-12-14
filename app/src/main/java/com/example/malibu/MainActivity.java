package com.example.malibu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Conexion con = new Conexion(this,"db_Restaurant",null,1);
    }


    public void Producto(View view) {
        Intent i = new Intent(this, productoCrud.class);
        startActivity(i);
    }
}