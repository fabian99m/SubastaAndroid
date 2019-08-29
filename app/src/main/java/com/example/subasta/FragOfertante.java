package com.example.subasta;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.subasta.Datos.Querys;
import com.example.subasta.Modelo.Ofertante;

import static com.example.subasta.MainActivity.subas;


public class FragOfertante extends Fragment implements View.OnClickListener {

    private EditText nombre, cedula, deposito;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_frag_ofertante, container, false);

        nombre = v.findViewById(R.id.etNombre);
        cedula = v.findViewById(R.id.etCedula);
        deposito = v.findViewById(R.id.etDeposito);

        Button b = v.findViewById(R.id.bt1);
        b.setOnClickListener(this);

        return v;
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.bt1) {
            GuardarOfertante();
        }
    }

    public void GuardarOfertante() {
        if (nombre.getText().toString().isEmpty() || nombre.getText().toString().trim().equals("")) {
            Toast.makeText(getActivity(), "Ingrese un nombre de ofertante!!", Toast.LENGTH_SHORT).show();
        } else if (cedula.getText().toString().isEmpty() || nombre.getText().toString().trim().equals("")) {
            Toast.makeText(getActivity(), "Ingrese un número de cédula!!", Toast.LENGTH_SHORT).show();
        } else if (deposito.getText().toString().isEmpty() || nombre.getText().toString().trim().equals("")) {
            Toast.makeText(getActivity(), "Ingrese deposito!!", Toast.LENGTH_SHORT).show();
        } else {
            subas.ofer.add(new Ofertante(nombre.getText().toString(), Integer.parseInt(cedula.getText().toString()), Float.parseFloat(deposito.getText().toString())));
            Toast.makeText(getActivity(), "Ofertante guardado con éxito!", Toast.LENGTH_SHORT).show();

            Querys.GuardaOferBD(getActivity(), nombre, cedula, deposito);
            nombre.setText("");
            cedula.setText("");
            deposito.setText("");
        }
    }


}


