package com.example.malibu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class productoCrud extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_crud);
    }


    public void registrarProducto(View view){
        Intent i = new Intent(this,agregarProducto.class);
        startActivity(i);
    }
}