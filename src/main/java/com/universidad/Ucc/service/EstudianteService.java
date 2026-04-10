package com.universidad.Ucc.service;

import org.springframework.stereotype.Service;

import com.universidad.Ucc.service.interfaces.Notificable;

@Service
public class EstudianteService implements Notificable {

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Notificación al estudiante: " + mensaje);
    }
}
