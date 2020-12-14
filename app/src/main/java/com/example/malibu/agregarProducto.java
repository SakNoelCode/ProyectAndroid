package com.example.malibu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.malibu.CapaLogica.logicaUtilidades;

public class agregarProducto extends AppCompatActivity {

    private EditText nombre,descripcion,precio,precioRebajado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_producto);

        nombre = (EditText)findViewById(R.id.txtNombre);
        descripcion = (EditText)findViewById(R.id.txtDescripcion);
        precio = (EditText)findViewById(R.id.txtPrecio);
        precioRebajado = (EditText)findViewById(R.id.txtPrecioRebajado);
    }

    public void onClickProducto(View view){
        if(validarCampos()){
            addProducto();
            limpiarCampos();
        }else{
            Toast.makeText(this,"Ingrese los datos Correctamente",Toast.LENGTH_SHORT).show();
        }
    }

    private boolean validarCampos() {
        boolean rpta=true;

        if(estaVacio(nombre)){
            rpta = false;
        }else if (estaVacio(descripcion)){
            rpta = false;
        }else if (estaVacio(precio)){
            rpta = false;
        }else {
            if(estaVacio(precioRebajado)){
                rpta = true;
            }else{
                if(Integer.parseInt(precioRebajado.getText().toString()) == 0
                        || Integer.parseInt(precioRebajado.getText().toString()) >= Integer.parseInt(precio.getText().toString())){
                    precioRebajado.isFocusable();
                    precioRebajado.requestFocus();
                    precioRebajado.setText(null);
                    precioRebajado.setHint("Ingrese un valor Correcto");
                    rpta = false;
                }
            }
        }

        return rpta;
    }

    //Metodo para validar si el EditTet esta Vacío
    private boolean estaVacio(EditText campo){
        String dato = campo.getText().toString().trim();
        if(TextUtils.isEmpty(dato)){
            campo.isFocusable();
            campo.requestFocus();
            campo.setText(null);
            campo.setHint("Campo Requerido");
            return true;
        }else{
            return false;
        }
    }

    private void limpiarCampos() {
        nombre.setText("");
        descripcion.setText("");
        precio.setText("");
        precioRebajado.setText("");
    }

    private void addProducto() {
        Conexion con = new Conexion(this,"db_Restaurant",null,1);
        SQLiteDatabase db = con.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(logicaUtilidades.NOMBRE,nombre.getText().toString());
        values.put(logicaUtilidades.DESCRIPCION,descripcion.getText().toString());
        values.put(logicaUtilidades.PRECIO,precio.getText().toString());
        if(precioRebajado.getText().toString().equals("")){
            values.put(logicaUtilidades.PRECIOREBAJADO,"0");
        }else{
            values.put(logicaUtilidades.PRECIOREBAJADO,precioRebajado.getText().toString());
        }

        long resultado = db.insert(logicaUtilidades.TABLA_PRODUCTO,logicaUtilidades.ID,values);

        Toast.makeText(getApplicationContext(),"idRegistro "+ resultado,Toast.LENGTH_SHORT).show();
        con.close();
    }
}