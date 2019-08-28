package com.example.subasta;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import static com.example.subasta.MainActivity.subas;


public class ListarOfertantes extends Fragment {


    RecyclerView rp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_listar_ofertantes, container, false);

        rp = v.findViewById(R.id.listaofer);
        rp.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        Log.d("debugMode", "The application stopped after this");

        AdaptadorOfer adapter = new AdaptadorOfer(subas.ofer);
        rp.setAdapter(adapter);

        return v;
    }


}
