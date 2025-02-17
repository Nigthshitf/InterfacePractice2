package org.fourthProblem;

public class TarjetaDeCredito implements MetodoPago{
    @Override
    public void procesarPago(double monto) {
        System.out.println("debitando " + monto + " de la tarjeta");
    }
}
