package org.seventhProblem;

public class Ropa implements Producto{
    @Override
    public double obtenerPrecio() {
        return 200.0;
    }

    @Override
    public double obtenerStock() {
        return 30.0;
    }
}
