package com.universidad.Ucc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.universidad.Ucc.model.Persona;

@Service
public class PersonaService {

    private List<Persona> personas = new ArrayList<>();

    public String getNombre(String correo) {
        return personas.stream()
                .filter(p -> p.getCorreo().equals(correo))
                .map(Persona::getNombre)
                .findFirst()
                .orElse("No encontrado");
    }

    public String getCorreo(String nombre) {
        return personas.stream()
                .filter(p -> p.getNombre().equals(nombre))
                .map(Persona::getCorreo)
                .findFirst()
                .orElse("No encontrado");
    }

    public void agregar(Persona persona) {
        personas.add(persona);
    }
}