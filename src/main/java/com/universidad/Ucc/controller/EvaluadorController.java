package com.universidad.Ucc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.universidad.Ucc.service.EvaluadorService;

@Controller
@RestController
public class EvaluadorController {

    @Autowired
    private EvaluadorService evaluadorService;

}
