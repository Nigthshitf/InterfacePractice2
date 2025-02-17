package org.fourthProblem;

public class main {
    public static void main(String[] args) {


        Compra comprita = new Compra();
        TarjetaDeCredito bisita = new TarjetaDeCredito();

        comprita.compra(" PlayStation 5!!!");
        comprita.pagando("tarjeta de credito", bisita, 5000);
    }
}
