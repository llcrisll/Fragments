package com.example.cristinalopez.fragments.fragments;


import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.cristinalopez.fragments.DetalleActivity;
import com.example.cristinalopez.fragments.R;
import com.example.cristinalopez.fragments.model.Amigo;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListaFragment extends Fragment {


    public ListaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_lista, container, false);
        View view = inflater.inflate(R.layout.fragment_lista, container, false);

        final ListView lstAmigos = (ListView) view.findViewById(R.id.lstAmigos);
        lstAmigos.setAdapter(new ArrayAdapter(getContext(),
                android.R.layout.simple_list_item_1,setUpListAmigosDummy()));

        lstAmigos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Amigo amigo = (Amigo) lstAmigos.getAdapter().getItem(position);
                if(getResources().getConfiguration().orientation==1){
                    Intent i = new Intent(getContext(), DetalleActivity.class);
                    i.putExtra(getString(R.string.amigo_key),amigo);
                    startActivity(i);
                }else if (getResources().getConfiguration().orientation==2){
                    DetalleFragment detalleFragment = (DetalleFragment) getFragmentManager().findFragmentById(R.id.frgDetalle);
                    TextView tvNombre = (TextView) detalleFragment.getView().findViewById(R.id.tvNombre);
                    tvNombre.setText(amigo.getNombre());
                    TextView tvPhone = (TextView) detalleFragment.getView().findViewById(R.id.tvPhone);
                    tvPhone.setText(amigo.getTelefono());
                    TextView tvTwitter = (TextView) detalleFragment.getView().findViewById(R.id.tvTwitter);
                    tvTwitter.setText(amigo.getTwitter());
                }
            }

            //1 portrait
            //2 landscape
        });
        return view;
    }

    public Amigo[] setUpListAmigosDummy(){

        Amigo[] amigos = {
                new Amigo("José Saramago", "@saramago", "5577229933"),
                new Amigo("Julio Cortazar", "@cortazar", "5577339933"),
                new Amigo("Guy Maupasant", "@maupassant", "5577229935")
        };
        return amigos;
    }
}
