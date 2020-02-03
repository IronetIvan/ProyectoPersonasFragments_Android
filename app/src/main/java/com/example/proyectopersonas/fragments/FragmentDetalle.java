package com.example.proyectopersonas.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.proyectopersonas.R;
import com.example.proyectopersonas.utils.Persona;

import java.io.Serializable;

public class FragmentDetalle extends Fragment {
    private ImageView imagen;
    private TextView nombre, apellido, telefono;
    static String TAG_ARG1 = "persona";
    private Persona persona;

    public static FragmentDetalle newInstance(Persona persona) {

        Bundle bundle = new Bundle();

        FragmentDetalle fragmentDetalle = new FragmentDetalle();
        fragmentDetalle.setArguments(bundle);
        bundle.putSerializable("persona", (Serializable) persona);
        return fragmentDetalle;
    }

    @Override
    public void onAttach(Context context) {

        super.onAttach(context);
        if (this.getArguments() != null) {
            persona = (Persona) this.getArguments().get(TAG_ARG1);
        }

        //Arrancar el fragment detalle


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragmentdetalle, container, false);
        imagen = v.findViewById(R.id.imagenItem);
        nombre = v.findViewById(R.id.nombreItem);
        apellido = v.findViewById(R.id.apellidoDetalle);
        telefono = v.findViewById(R.id.menu_llamar);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        imagen.setImageResource(persona.getImagen());
        nombre.setText(persona.getNombre());
        apellido.setText(persona.getApellido());
    }
}
