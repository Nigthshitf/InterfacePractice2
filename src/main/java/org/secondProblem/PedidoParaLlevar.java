package org.secondProblem;

public class PedidoParaLlevar implements Pedido{
    String cliente;
    public PedidoParaLlevar(String cliente) {
        this.cliente = cliente;
    }


    public void preparar() {
        System.out.println("Preparando pedido para llevar de " + cliente);
    }

    @Override
    public void entregar() {
        System.out.println("Pedido para llevar de " + cliente + " está listo para recoger.");
    }
}
