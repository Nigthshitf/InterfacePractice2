package org.firstProblem;

public class serie implements Reproducible{

    int cantidadEpisodios;
    @Override
    public void reproducir() {
        System.out.println("La serie esta reproduciendose");
    }

    @Override
    public void pausar() {
        System.out.println("La serie esta pausada");
    }

    @Override
    public void detener() {
        System.out.println("La serie esta detenida");
    }
}
