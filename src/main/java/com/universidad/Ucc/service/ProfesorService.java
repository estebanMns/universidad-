package com.universidad.Ucc.service;

import com.universidad.Ucc.service.interfaces.Autenticable;
import com.universidad.Ucc.service.interfaces.Evaluador;
import org.springframework.stereotype.Service;

@Service
public class ProfesorService implements Autenticable, Evaluador {

    @Override
    public boolean login(String usuario, String password) {
        // Lógica de autenticación real iría aquí
        System.out.println("Autenticando profesor: " + usuario);
        return usuario.equals("admin") && password.equals("1234");
    }

    @Override
    public double evaluar(String codigoEstudiante) {
        System.out.println("Evaluando estudiante con código: " + codigoEstudiante);
        return 4.5; // Nota de ejemplo
    }
}
