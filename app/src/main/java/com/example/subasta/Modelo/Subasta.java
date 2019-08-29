package com.example.subasta.Modelo;

import java.io.Serializable;
import java.util.ArrayList;


public class Subasta implements Serializable {

    public ArrayList<Ofertante> ofer;


    public Subasta() {
    }


    public Subasta(ArrayList<Ofertante> ofer) {
        this.ofer = ofer;
    }

    public ArrayList<Ofertante> getOfer() {
        return ofer;
    }

    public void setOfer(ArrayList<Ofertante> ofer) {
        this.ofer = ofer;
    }

    public Boolean estaVacia() {
        if (ofer.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
