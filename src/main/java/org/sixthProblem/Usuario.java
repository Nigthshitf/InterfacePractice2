package org.sixthProblem;

public class Usuario {

    public void solicitarViaje(TransportePublico carrito,String origen, String destino){
        System.out.println("El usuario solicito un viaje");
        carrito.iniciarViaje(origen, destino);
        System.out.println("Calculando la tarifa : Bs" + carrito.calcularTarifa());
    }
}
