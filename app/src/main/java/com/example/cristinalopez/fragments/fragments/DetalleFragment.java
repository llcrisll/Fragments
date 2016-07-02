package com.example.cristinalopez.fragments.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cristinalopez.fragments.R;
import com.example.cristinalopez.fragments.model.Amigo;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetalleFragment extends Fragment {


    public DetalleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        /*El intent lo manda hacia el activity pero lo debe cachar el fragment*/
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detalle, container, false);
        /*View view = inflater.inflate(R.layout.fragment_detalle, container, false);
        TextView tvTwitter = (TextView) view.findViewById(R.id.tvTwitter);
        TextView tvPhone = (TextView) view.findViewById(R.id.tvPhone);
        TextView tvNombre = (TextView) view.findViewById(R.id.tvNombre);
        if (getActivity().getIntent().getExtras()!=null && getArguments()!= null){
            /*Amigo amigo = (Amigo) getArguments().getSerializable(getString(R.string.amigo_key));
            tvTwitter.setText(amigo.getTwitter());
            tvPhone.setText(amigo.getTelefono());
            tvNombre.setText(amigo.getNombre());*//*
            Bundle parametros = getActivity().getIntent().getExtras();
            String nombre = parametros.getString(getString(R.string.amigo_key));
            tvNombre.setText(nombre);
        }
        return view;*/
    }

}
