package org.eighthProblem;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }


    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println(empleado.obtenerCargo() + " agregado a la empresa.");
    }

    public void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados en la empresa.");
            return;
        }
        System.out.println("Lista de empleados:");
        for (Empleado e : empleados) {
            System.out.println("- Cargo: " + e.obtenerCargo() + ", Salario: $" + e.calcularSalario());
        }
    }
}
