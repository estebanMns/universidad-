package com.universidad.Ucc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.universidad.Ucc.service.PersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    private PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/nombre")
    public String getNombre(@RequestParam String correo) {
        return personaService.getNombre(correo);
    }

    @GetMapping("/correo")
    public String getCorreo(@RequestParam String nombre) {
        return personaService.getCorreo(nombre);
    }
}