package com.primerproyecto.spring.app1.springboot_applications.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.primerproyecto.spring.app1.springboot_applications.models.Empleados;

// Anotación que indica que esta clase es un controlador de Spring MVC
@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    public String info(Model model) {

        Empleados empleado1 = new Empleados("Juan", "Pérez", "Calle 1 #12", "Desarrollador",
                                            30, 5551234, 1);

        model.addAttribute("Empleado", empleado1);
        return "detalles_info";
    }

    @ModelAttribute("Empleados")
    public List<Empleados> ListaEmpleados(){

        return Arrays.asList(
            new Empleados("Ana", "Gómez", "Calle 2 #34", "Diseñadora", 28, 5555678, 2),
            new Empleados("Luis", "Martínez", "Calle 3 #56", "Analista", 35, 5558765, 3),
            new Empleados("María", "Rodríguez", "Calle 4 #78", "Contadora", 29, 5554321, 4)
        );
        
    }


}
