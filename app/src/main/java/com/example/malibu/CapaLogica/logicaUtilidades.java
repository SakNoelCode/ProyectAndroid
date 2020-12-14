package com.example.malibu.CapaLogica;

public class logicaUtilidades {

    //TABLA PRODUCTO
    public static final String TABLA_PRODUCTO = "producto";
    public static final String ID= "idProducto";
    public static final String NOMBRE = "nombreProducto";
    public static final String DESCRIPCION = "descripcionProducto";
    public static final String PRECIO = "precioProducto";
    public static final String PRECIOREBAJADO = "precioOferta";





    //String Create Tables DataBase
    public static final String  CREAR_TABLA_PRODUCTO = "create table "+TABLA_PRODUCTO+" " +
            "( "+ID+" INTEGER PRIMARY KEY, " +
            ""+NOMBRE+" TEXT, " +
            ""+DESCRIPCION+" TEXT, " +
            ""+PRECIO+" DECIMAL(8,2), " +
            ""+PRECIOREBAJADO+" DECIMAL(8,2))";



}
