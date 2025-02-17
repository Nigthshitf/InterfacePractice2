package org.seventhProblem;

public class Electronico implements Producto{
    @Override
    public double obtenerPrecio( ) {
        return 100.0;
    }

    @Override
    public double obtenerStock() {
        return 40.0;
    }
}
