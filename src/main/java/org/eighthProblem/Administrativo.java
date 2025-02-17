package org.eighthProblem;

public class Administrativo implements Empleado{
    double salarioBase;

    public Administrativo(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public String obtenerCargo() {
        return "Administrativo";
    }
}
