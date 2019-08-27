package com.example.subasta.Modelo;

public class Ofertante {

   private String nombre;
    private int cedula;
    private  float deposito;


    public Ofertante() {

    }

    public Ofertante(String nombre, int cedula, float deposito) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.deposito = deposito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public float getDeposito() {
        return deposito;
    }

    public void setDeposito(float deposito) {
        this.deposito = deposito;
    }
}
