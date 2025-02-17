package org.secondProblem;

public class Motorizado implements Repartidor{
    private String nombre;

    public Motorizado(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void repartir() {
        System.out.println("Motorizado " + nombre + " está repartiendo el pedido.");
    }
}
