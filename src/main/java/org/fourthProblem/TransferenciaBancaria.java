package org.fourthProblem;

public class TransferenciaBancaria implements MetodoPago{
    @Override
    public void procesarPago(double monto) {
        System.out.println("Transferncia de " + monto + " Completada");
    }
}
