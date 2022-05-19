package com.ironhack;

public class Empresa {
    
    private final String nif;
    private String companyName;
    private int numberOfEmployees;

    public Empresa(String nif, String companyName, int numberOfEmployees) {
        this.nif = nif;
        this.companyName = companyName;
        this.numberOfEmployees = numberOfEmployees;
    }
    
    public String getNif() {
        return nif;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    
    public void mostrarElementos() {
        System.out.println("Una empresa tiene un nif, un nombre y un número de empleados");
    } 
}
