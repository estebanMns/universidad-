package com.universidad.Ucc.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.universidad.Ucc.model.Persona;
import com.universidad.Ucc.service.PersonaService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RestController
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/personas/nombre")
    public Persona getNombre(){
        return personaService.getNombre();
    }
    
    @GetMapping("/personas/correo")
    public Persona getCorreo(){
        return personaService.getCorreo();
    }

}
