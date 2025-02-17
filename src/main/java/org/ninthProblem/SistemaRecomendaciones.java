package org.ninthProblem;

import java.util.List;

public class SistemaRecomendaciones {


    public void recomendarProductos(Recomendable usuario, List<Producto> productos) {
        List<String> recomendaciones = usuario.obtenerRecomendaciones(productos);

        if (recomendaciones.isEmpty()) {
            System.out.println("No hay recomendaciones disponibles.");
        } else {
            System.out.println("Recomendaciones para " + usuario.getClass().getSimpleName() + ":");
            for (String producto : recomendaciones) {
                System.out.println("- " + producto);
            }
        }
    }
}
