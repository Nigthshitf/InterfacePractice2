package org.eighthProblem;

public class Tecnico implements Empleado{
    double salarioBase;
    private int horasExtras;
    private double pagoPorHoraExtra;


    public Tecnico(double salarioBase, int horasExtras, double pagoPorHoraExtra) {
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
        this.pagoPorHoraExtra = pagoPorHoraExtra;
    }


    @Override
    public double calcularSalario() {
        return salarioBase + (horasExtras * horasExtras);
    }

    @Override
    public String obtenerCargo() {
        return "Tecnico";
    }
}
