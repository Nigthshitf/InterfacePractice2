package org.sixthProblem;

public class Taxi implements TransportePublico, Conductor{
    @Override
    public void iniciarViaje(String origen, String destino) {
        System.out.println("Iniciando viaje desde" + origen + " hasta" + destino);
    }

    @Override
    public double calcularTarifa() {
        return 10.0;
    }

    @Override
    public void aceptarPasajero() {
        System.out.println("Aceptando pasajero");
    }

    @Override
    public void finalizarViaje() {
        System.out.println("Finalizando viaje, dejando a pasajero en su destino");
    }
}
