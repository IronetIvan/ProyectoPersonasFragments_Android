package com.example.proyectopersonas.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectopersonas.R;
import com.example.proyectopersonas.adaptadores.AdaptadorRecycler;
import com.example.proyectopersonas.utils.Persona;

import java.util.ArrayList;

public class FragmentPersonas extends Fragment {

    private RecyclerView recyclerPersonas;
    private AdaptadorRecycler adaptador;
    private ArrayList<Persona> listaPersonas;
    private View view;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Ivan", "Redondo", 1234, R.drawable.images));
        listaPersonas.add(new Persona("Ivan", "Redondo", 1234, R.drawable.images2));
        listaPersonas.add(new Persona("Ivan", "Redondo", 1234, R.drawable.images3));
        listaPersonas.add(new Persona("Ivan", "Redondo", 1234, R.drawable.images4));
        listaPersonas.add(new Persona("Ivan", "Redondo", 1234, R.drawable.images5));
        listaPersonas.add(new Persona("Ivan", "Redondo", 1234, R.drawable.images6));
        adaptador = new AdaptadorRecycler(listaPersonas, context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.layout_fragment_personas, container, false);
        recyclerPersonas = view.findViewById(R.id.recycler_personas);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        recyclerPersonas.setAdapter(adaptador);
        recyclerPersonas.setLayoutManager(new GridLayoutManager(getContext(), 2,RecyclerView.VERTICAL,false));

    }
}
