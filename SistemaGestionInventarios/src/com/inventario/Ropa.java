package com.inventario;

public class Ropa extends Producto implements Descuento {
    private String talla;

    public Ropa(int id, String nombre, double precio, int cantidad, String talla) {
        super(id, nombre, precio, cantidad);
        this.talla = talla;
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
