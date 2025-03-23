package com.inventario;

public class Alimento extends Producto {
    private String fechaCaducidad;

    public Alimento(int id, String nombre, double precio, int cantidad, String fechaCaducidad) {
        super(id, nombre, precio, cantidad);
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public double calcularPrecioTotal() {
        return getPrecio() * getCantidad();
    }
}