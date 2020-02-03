package com.example.proyectopersonas.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.proyectopersonas.R;
import com.example.proyectopersonas.utils.Persona;

import java.io.Serializable;

public class FragmentDetalle extends Fragment {

    public static FragmentDetalle newInstance(Persona persona) {

        Bundle bundle = new Bundle();

        FragmentDetalle fragment = new FragmentDetalle();
        fragment.setArguments(bundle);
        bundle.putSerializable("persona", (Serializable) persona);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {

        super.onAttach(context);
        Persona persona = (Persona) this.getArguments().get("persona");
    }

    //Arrancar el fragment detalle

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragmentdetalle,container,false);
        return v;
    }
}
