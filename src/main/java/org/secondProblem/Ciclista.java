package org.secondProblem;

public class Ciclista implements Repartidor{
    private String nombre;

    public Ciclista(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void repartir() {
        System.out.println("Ciclista " + nombre + " está repartiendo el pedido.");
    }
}
