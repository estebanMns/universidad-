package com.universidad.Ucc.model;

import org.springframework.beans.factory.annotation.Autowired;

import com.universidad.Ucc.controller.PersonaController;

public class Persona {

    @Autowired
    private PersonaController personaController;

    private String nombre;
    private String correo;

    public Persona(){}

    public Persona(String nombre, String correo){
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getCorreo(){
        return correo;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }
}
