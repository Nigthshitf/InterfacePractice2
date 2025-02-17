package org.fourthProblem;

public class Compra {




    public void compra(String articulo){
        System.out.println("Su compra es" + articulo);
    }

    public void Facturando(String tipoFactura,Facturable factura){
        switch (tipoFactura.toLowerCase()){
            case "factura electronica":
            case "factura fisica":
                factura.generarFactura();
                break;
            default:
                System.out.println("No podemos facturar de otra manera casero!!");
        }
    }
    public void pagando(String tipoPago, MetodoPago platita, double monto){
        switch (tipoPago.toLowerCase()){
            case "tarjeta de credito":
            case "paypal":
            case "transferencia bancaria":
                platita.procesarPago(monto);
                break;
            default:
                System.out.println("No hay otra manera de pago!!");
        }
    }
}
