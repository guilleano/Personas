package com.example.android.personas;

import java.util.ArrayList;

/**
 * Created by android on 19/09/2017.
 */

public class Datos {
    private static ArrayList<Persona> persona=new ArrayList<>();


    public static void guardar(Persona p){
        persona.add(p);

    }

    public static ArrayList<Persona> obtener(){
        return persona;
    }

}
