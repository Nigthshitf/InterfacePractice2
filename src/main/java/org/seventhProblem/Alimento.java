package org.seventhProblem;

import java.time.LocalDate;

public class Alimento implements Almacenable, Producto{

    LocalDate fechaCaducidad;

    @Override
    public void guardarEnBodega() {
        System.out.println("Alimento guardado en bodega");
    }

    public boolean retirarDeBodega() {
        if (LocalDate.now().isAfter(fechaCaducidad)) {
            System.out.println("El alimento ha caducado y no se puede retirar.");
            return false;
        } else {
            System.out.println("Alimento retirado de la bodega.");
            return true;
        }
    }

    @Override
    public double obtenerPrecio() {
        return 30.0;
    }

    @Override
    public double obtenerStock() {
        return 100.0;
    }
}
