package com.example.subasta.Modelo;

import java.util.ArrayList;
import java.util.List;



public class Subasta {

    public List<Ofertante> ofer ;


    public Subasta() {
    }

    public Subasta(List<Ofertante> ofer) {
        this.ofer = ofer;
    }

    public List<Ofertante> getOfer() {
        return ofer;
    }


    public void setOfer(List<Ofertante> ofer) {
        this.ofer = ofer;
    }
}
