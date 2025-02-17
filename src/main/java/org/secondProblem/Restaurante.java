package org.secondProblem;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private String nombre;
    private List<Pedido> pedidos;

    public Restaurante(String nombre) {
        this.nombre = nombre;
        this.pedidos = new ArrayList<>();
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void procesarPedidos() {
        System.out.println("Procesando pedidos en " + nombre + "...");
        for (Pedido pedido : pedidos) {
            pedido.preparar();
            pedido.entregar();
            System.out.println("----------------------");
        }
        pedidos.clear(); // Se vacía la lista tras procesar los pedidos
    }
}
