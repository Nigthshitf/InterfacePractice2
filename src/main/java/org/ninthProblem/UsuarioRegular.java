package org.ninthProblem;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRegular implements Recomendable{


    public List<String> obtenerRecomendaciones(List<Producto> productos) {
        List<String> recomendaciones = new ArrayList<>();

        for (Producto producto : productos) {
            if (producto.getPrecio() <= 50) { // Usuarios regulares ven productos económicos
                recomendaciones.add(producto.toString());
            }
        }
        return recomendaciones;
    }
}
