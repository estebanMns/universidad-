package com.universidad.Ucc.model;

public class Profesor {

    private String especialidad;

    public Profesor(){}

    public Profesor(String especialidad){
        this.especialidad = especialidad;
    }

    public String getEspecialidad(){
        return especialidad;
    }

    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }

}
