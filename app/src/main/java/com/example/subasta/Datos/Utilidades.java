package com.example.subasta.Datos;

public class Utilidades {

    public final static String TABLA_OFERTANTE = "OFERTANTE";
    public final static String CAMPO_nombre = "nombre";
    public final static String CAMPO_cedula = "cedula";
    public final static String CAMPO_deposito = "deposito";

    public final static String CREAR_TABLA_OFERTANTE = "CREATE TABLE " + TABLA_OFERTANTE + "  (" + CAMPO_nombre + " TEXT , " + CAMPO_cedula + " INTEGER , " + CAMPO_deposito + " REAL)";
}
