package com.primerproyecto.spring.app1.springboot_applications.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


// Anotación que indica que esta clase es un controlador de Spring MVC
@RestController // Con este controlador lo convertimos en un API REST
public class EjemploRestController {

    @GetMapping("/detalles_info2")

    public Map<String, Object> detalles_info2() {
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Titulo", "Servidor en linea");
        respuesta.put("Servidor", "Esto es un atributo del modelo");
        respuesta.put("IP", "192.168.1.100");
        return respuesta;
    }
}
