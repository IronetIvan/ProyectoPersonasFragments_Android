package com.example.proyectopersonas.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectopersonas.R;
import com.example.proyectopersonas.utils.Persona;

import java.util.ArrayList;

public class AdaptadorRecycler extends RecyclerView.Adapter<AdaptadorRecycler.MiHolder> {
    ArrayList<Persona> listaPersonas;
    Context contexto;

    public AdaptadorRecycler(ArrayList<Persona> listaPersonas, Context contexto) {
        this.listaPersonas = listaPersonas;
        this.contexto = contexto;
    }

    @NonNull
    @Override
    public MiHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(contexto).inflate(R.layout.itemrecycler,parent, false);
        return new MiHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MiHolder holder, int position) {
        
    }

    @Override
    public int getItemCount() {
        return listaPersonas.size();
    }

    class MiHolder extends RecyclerView.ViewHolder{

        public MiHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
