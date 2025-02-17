package org.firstProblem;

public class documental implements Reproducible{

    String tema;
    @Override
    public void reproducir() {
        System.out.println("El documental esta reproduciendose");
    }

    @Override
    public void pausar() {
        System.out.println("El documental esta pausado");
    }

    @Override
    public void detener() {
        System.out.println("El documental esta detenido");
    }
}
