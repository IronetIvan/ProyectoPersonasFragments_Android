package com.example.proyectopersonas.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectopersonas.R;
import com.example.proyectopersonas.utils.Persona;

import java.util.ArrayList;

public class AdaptadorRecycler extends RecyclerView.Adapter<AdaptadorRecycler.MiHolder> {
    private ArrayList<Persona> listaPersonas;
    private Context contexto;
    private OnRecyclerListener listener;

    public AdaptadorRecycler(ArrayList<Persona> listaPersonas, Context contexto) {
        this.listaPersonas = listaPersonas;
        this.contexto = contexto;

        try{
            listener = (OnRecyclerListener) contexto;
        }catch (ClassCastException e){

        }
    }

    @NonNull
    @Override
    public MiHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(contexto).inflate(R.layout.itemrecycler,parent, false);
        return new MiHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MiHolder holder, int position) {
        final Persona persona = listaPersonas.get(position);
        holder.getImagen().setImageResource(persona.getImagen());
        holder.getBoton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onPersonaSelected(persona);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listaPersonas.size();
    }

    public interface OnRecyclerListener{
        void onPersonaSelected(Persona persona);
    }

    class MiHolder extends RecyclerView.ViewHolder{

        private ImageView imagen;
        private Button boton;


        public MiHolder(@NonNull View itemView) {
            super(itemView);
            imagen = itemView.findViewById(R.id.imagenItem);
            boton = itemView.findViewById((R.id.nombreItem));
        }

        public ImageView getImagen() {
            return imagen;
        }

        public void setImagen(ImageView imagen) {
            this.imagen = imagen;
        }

        public Button getBoton() {
            return boton;
        }

        public void setBoton(Button boton) {
            this.boton = boton;
        }
    }
}
