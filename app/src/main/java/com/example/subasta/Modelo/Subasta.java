package com.example.subasta.Modelo;

import java.util.ArrayList;


public class Subasta {

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
}
