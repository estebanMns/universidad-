package com.universidad.Ucc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.universidad.Ucc.service.AprobarService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RestController
public class AprobarController {

    @Autowired
    private AprobarService aprobarService;

    @GetMapping("")
    public String AprobarSolicitud(@RequestBody String solicitud){
        return aprobarService.aprobarSolicitud(solicitud);
    }
}
