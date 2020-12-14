package com.example.malibu.CapaDatos;

public class Producto {

    private Integer idProducto;
    private String nombre;
    private String descripcion;
    private Double precio;
    private Double precioRebajadado;

    Producto(){}

    public Producto(Integer idProducto, String nombre, String descripcion, Double precio, Double precioRebajadado) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.precioRebajadado = precioRebajadado;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getPrecioRebajadado() {
        return precioRebajadado;
    }

    public void setPrecioRebajadado(Double precioRebajadado) {
        this.precioRebajadado = precioRebajadado;
    }
}
