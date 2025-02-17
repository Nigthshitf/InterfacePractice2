package org.sixthProblem;

public class BicicletaCompartida implements TransportePublico{
    @Override
    public void iniciarViaje(String origen, String destino) {
        System.out.println("Iniciando viaje desde" + origen + " hasta" + destino);
    }

    @Override
    public double calcularTarifa() {
        return 5.0;
    }
}
