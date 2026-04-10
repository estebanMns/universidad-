package com.universidad.Ucc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.universidad.Ucc.service.ProfesorService;

@RestController
@RequestMapping("/profesor")
public class ProfesorController {

    private ProfesorService loginService;

    public ProfesorController(ProfesorService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public boolean login(@RequestParam String usuario,
                         @RequestParam String password) {
        return loginService.login(usuario, password);
    }

    @GetMapping("/evaluar")
    public double evaluar(@RequestParam String codigoEstudiante) {
        return loginService.evaluar(codigoEstudiante);
    }
}