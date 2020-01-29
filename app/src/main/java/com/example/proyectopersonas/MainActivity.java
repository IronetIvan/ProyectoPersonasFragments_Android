package com.example.proyectopersonas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.proyectopersonas.fragments.FragmentPersonas;

public class MainActivity extends AppCompatActivity {
    FrameLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        cargaInicial();

    }

    private void cargaInicial() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.sitio_fragments, new FragmentPersonas(), "personas");
        ft.addToBackStack(null);
        ft.commit();
    }

    private void instancias() {
        layout = findViewById(R.id.sitio_fragments);
    }
}
