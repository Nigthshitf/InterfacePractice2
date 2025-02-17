package org.firstProblem;

public class pelicula implements Reproducible{
    int duracionPelicula;

    @Override
    public void reproducir() {
        System.out.println("La pelicula esta en reproduccion!!");
    }

    @Override
    public void pausar() {
        System.out.println("La pelicula esta pausada!!");
    }

    @Override
    public void detener() {
        System.out.println("La pelicula esta detenida!!");
    }
}
