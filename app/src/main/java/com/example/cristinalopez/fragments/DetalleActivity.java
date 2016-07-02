package com.example.cristinalopez.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.cristinalopez.fragments.model.Amigo;

import org.w3c.dom.Text;

public class DetalleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        Amigo amigo = (Amigo) getIntent().getExtras().getSerializable(getString(R.string.amigo_key));
        TextView tvNombre = (TextView) findViewById(R.id.tvNombre);
        TextView tvTwitter = (TextView) findViewById(R.id.tvTwitter);
        TextView tvPhone = (TextView) findViewById(R.id.tvPhone);
        tvNombre.setText(amigo.getNombre());
        tvPhone.setText(amigo.getTelefono());
        tvTwitter.setText(amigo.getTwitter());
        //falta
        /*Bundle parametros = getIntent().getExtras();
        TextView tvNombre = (TextView) findViewById(R.id.tvNombre);

        if(parametros!=null){
            tvNombre.setText(parametros.getString(getString(R.string.amigo_key)));
        }*/
    }
}
