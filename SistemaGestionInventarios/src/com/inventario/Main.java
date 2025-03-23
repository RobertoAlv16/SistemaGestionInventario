package com.inventario;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de las subclases
        Producto telefono = new Electronico(1, "Smartphone", 500.0, 10, "Samsung");
        Producto manzana = new Alimento(2, "Manzana", 1.5, 50, "2023-12-31");
        Producto camiseta = new Ropa(3, "Camiseta", 20.0, 100, "M");

        // Demostrar polimorfismo
        System.out.println("Precio total del teléfono: " + telefono.calcularPrecioTotal());
        System.out.println("Precio total de las manzanas: " + manzana.calcularPrecioTotal());
        System.out.println("Precio total de las camisetas: " + camiseta.calcularPrecioTotal());

        // Aplicar descuento a productos que lo soportan
        if (telefono instanceof Descuento) {
            System.out.println("Precio con descuento del teléfono: " + ((Descuento) telefono).aplicarDescuento(10));
        }
        if (camiseta instanceof Descuento) {
            System.out.println("Precio con descuento de la camiseta: " + ((Descuento) camiseta).aplicarDescuento(20));
        }
    }
}
