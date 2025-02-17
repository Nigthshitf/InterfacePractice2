package org.fourthProblem;

public class FacturaElectronica implements Facturable{
    @Override
    public void generarFactura() {
        System.out.println("La factura llegara a su Email!!");
    }
}
