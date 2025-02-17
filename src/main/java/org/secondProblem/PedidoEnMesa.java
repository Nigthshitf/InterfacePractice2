package org.secondProblem;

public class PedidoEnMesa implements Pedido{
    private int numeroMesa;

    public PedidoEnMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pedido para la mesa " + numeroMesa);
    }

    @Override
    public void entregar() {
        System.out.println("Entregando pedido en la mesa " + numeroMesa);
    }
}
