package com.universidad.Ucc.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.universidad.Ucc.service.AdministrativoService;

@RestController
@RequestMapping("/administrativo")
public class AdministrativoController {

    private AdministrativoService probarService;

    public AdministrativoController(AdministrativoService probarService) {
        this.probarService = probarService;
    }

    @PostMapping("/aprobar")
    public String probarSolicitud(@RequestParam String codigoSolicitud) {
        probarService.aprobarSolicitud(codigoSolicitud);
        return "Solicitud " + codigoSolicitud + " procesada.";
    }

    @PostMapping("/notificar")
    public String notificar(@RequestParam String mensaje) {
        probarService.enviarNotificacion(mensaje);
        return "Notificación enviada.";
    }
}