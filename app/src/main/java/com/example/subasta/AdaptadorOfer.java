package com.example.subasta;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.subasta.Modelo.Ofertante;

import java.util.ArrayList;

public class AdaptadorOfer extends RecyclerView.Adapter<AdaptadorOfer.ViewHolderOfertantes> {

    ArrayList<Ofertante> ofertante;

    public AdaptadorOfer(ArrayList<Ofertante> ofertante) {
        this.ofertante = ofertante;
    }

    @NonNull
    @Override
    public ViewHolderOfertantes onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_ofertantes, null, false);

        return new ViewHolderOfertantes(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderOfertantes holder, int position) {
        holder.nombre.setText(ofertante.get(position).getNombre());
        holder.cedula.setText(String.valueOf(ofertante.get(position).getCedula()));
        holder.deposito.setText((String.valueOf(ofertante.get(position).getDeposito())));

    }

    @Override
    public int getItemCount() {
        return ofertante.size();
    }

    public class ViewHolderOfertantes extends RecyclerView.ViewHolder {

        TextView nombre, cedula, deposito;

        public ViewHolderOfertantes(@NonNull View itemView) {
            super(itemView);

            nombre = itemView.findViewById(R.id.idNombre);
            cedula = itemView.findViewById(R.id.idCedula);
            deposito = itemView.findViewById(R.id.idDeposito);
        }
    }
}
