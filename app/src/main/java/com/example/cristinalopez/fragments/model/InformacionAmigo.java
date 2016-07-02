package com.example.cristinalopez.fragments.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cristina.lopez on 25-Jun-16.
 */
public class InformacionAmigo {

    List<Amigo> amigos = new ArrayList<Amigo>();

    public InformacionAmigo(){
        amigos = new ArrayList<Amigo>();
        amigos.add(new Amigo("José Saramago", "@saramago", "5577229933"));
        amigos.add(new Amigo("Julio Cortazar", "@cortazar", "5577339933"));
        amigos.add(new Amigo("Herman Hesse", "@hesse", "5577229934"));
        amigos.add(new Amigo("Guy Maupasant", "@maupassant", "5577229935"));

    }

}
