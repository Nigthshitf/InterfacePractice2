package org.firstProblem;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;


public class usuario {

    List<String> favoritos = new ArrayList<>();

    public void agregarFavoritos (String contenido){
        favoritos.add(contenido);
    }
    public void reproducirFavoritos() {
        if (favoritos.isEmpty()) {
            System.out.println("No hay favoritos para reproducir.");
        }else {
            System.out.println("Reproduciendo favoritos:");
            for (String contenido : favoritos) {
                System.out.println("Reproduciendo: " + contenido);
            }
        }
    }
}
