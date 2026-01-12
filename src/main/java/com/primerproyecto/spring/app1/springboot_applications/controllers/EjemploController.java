package com.primerproyecto.spring.app1.springboot_applications.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.primerproyecto.spring.app1.springboot_applications.models.Empleados;

// Anotación que indica que esta clase es un controlador de Spring MVC
@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    public String info(Model model) {

        Empleados empleado1 = new Empleados("Juan", "Pérez", "Calle Falsa 123", "Desarrollador", 30, 5551234, 1);

        model.addAttribute("Empleado", empleado1);
        return "detalles_info";
    }
}
