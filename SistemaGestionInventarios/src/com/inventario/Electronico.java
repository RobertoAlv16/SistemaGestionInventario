package com.inventario;

public class Electronico extends Producto implements Descuento {
    private String marca;

    public Electronico(int id, String nombre, double precio, int cantidad, String marca) {
        super(id, nombre, precio, cantidad);
        this.marca = marca;
    }

    @Override
    public double calcularPrecioTotal() {
        return getPrecio() * getCantidad();
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        return calcularPrecioTotal() * (1 - porcentaje / 100);
    }
}