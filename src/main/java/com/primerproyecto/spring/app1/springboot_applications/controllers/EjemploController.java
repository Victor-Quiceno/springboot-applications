package com.primerproyecto.spring.app1.springboot_applications.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


// Anotación que indica que esta clase es un controlador de Spring MVC
@Controller
public class EjemploController {

    @GetMapping("/detalles_info")

    public String info(Model model) {
        model.addAttribute("Titulo", "Servidor en linea");
        model.addAttribute("Servidor", "Esto es un atributo del modelo");
        model.addAttribute("IP", "192.168.1.100");
        return "detalles_info";
    }
}
