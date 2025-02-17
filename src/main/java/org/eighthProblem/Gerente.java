package org.eighthProblem;

public class Gerente implements Empleado, Bonificable{
    double salarioBase;
    double bono;
    public Gerente(double salarioBase, double bono) {
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public String obtenerCargo() {
        return "Gerente";
    }

    @Override
    public double calcularBono() {
        return bono;
    }
}
