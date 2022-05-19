package com.ironhack;

public class SociedadAnonima extends Empresa {

    private double valorBorsatil;
    private int numSocios;

    public SociedadAnonima(String nif, String companyName, int numberOfEmployees, double valorBorsatil, int numSocios) {
        super(nif, companyName, numberOfEmployees);
        this.valorBorsatil = valorBorsatil;
        this.numSocios = numSocios;
    }

    public double getValorBorsatil() {
        return valorBorsatil;
    }

    public void setValorBorsatil(double valorBorsatil) {
        this.valorBorsatil = valorBorsatil;
    }

    public int getNumSocios() {
        return numSocios;
    }

    public void setNumSocios(int numSocios) {
        this.numSocios = numSocios;
    }

    @Override
    public void mostrarElementos() {
        System.out.println("Una empresa tiene un nif, " +
                "un nombre, un número de empleados, " +
                "un valor bursatil y el número de socios\n");
        
    }
}
