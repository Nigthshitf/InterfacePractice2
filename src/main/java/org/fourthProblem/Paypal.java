package org.fourthProblem;

public class Paypal implements MetodoPago{
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pagando" + monto);
    }
}
