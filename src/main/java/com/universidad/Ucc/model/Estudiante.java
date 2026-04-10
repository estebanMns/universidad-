package com.universidad.Ucc.model;

public class Estudiante {

    private String codigo;

    public Estudiante(){}

    public Estudiante(String codigo){
        this.codigo = codigo;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

}
