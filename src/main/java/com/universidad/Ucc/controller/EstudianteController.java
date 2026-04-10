package com.universidad.Ucc.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.universidad.Ucc.service.EstudianteService;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {

    private EstudianteService notificacionService;

    public EstudianteController(EstudianteService notificacionService) {
        this.notificacionService = notificacionService;
    }

    @PostMapping("/notificar")
    public String enviarNotificacion(@RequestParam String mensaje) {
        notificacionService.enviarNotificacion(mensaje);
        return "Notificación enviada al estudiante.";
    }
}
