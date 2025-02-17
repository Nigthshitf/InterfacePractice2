package org.secondProblem;

public class PedidoEnDomicilio implements Pedido{
    private String direccion;
    private Repartidor repartidor;

    public PedidoEnDomicilio(String direccion, Repartidor repartidor) {
        this.direccion = direccion;
        this.repartidor = repartidor;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pedido para domicilio en " + direccion);
    }

    @Override
    public void entregar() {
        System.out.println("Pedido para domicilio en " + direccion + " está listo.");
        repartidor.repartir();
    }
}
