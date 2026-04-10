package com.universidad.Ucc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.universidad.Ucc.service.NotificacionService;

@Controller
@RestController
public class NotificacionController {

    @Autowired
    private NotificacionService estudianteService;

    @GetMapping 
    public String enviarNotificacion(@RequestBody String mensaje){
        return NotificacionService.enviarNotificacion(mensaje);

    }

}
