package com.primerproyecto.spring.app1.springboot_applications.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primerproyecto.spring.app1.springboot_applications.models.dto.TareasDTO;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/tareas")
public class FiltrarController {

    @GetMapping("/filtrar")
    public List<TareasDTO> filtrarTareas(@RequestParam String estado,
            @RequestParam(defaultValue = "") String prioridad,
            @RequestParam(defaultValue = "0") int pagina,
            @RequestParam(defaultValue = "10") int tamanio,
            @RequestParam(defaultValue = "fecha") String orden) {

        System.out.println("[Estado: " + estado + ", \nPrioridad: " + prioridad + ", \nPágina: " + pagina
                + ", \nTamaño: " + tamanio + ", \nOrden: " + orden + "]");

        return Arrays.asList(new TareasDTO(1L, "Aprender Spring Boot", "completada", "alta"),
                new TareasDTO(2L, "Hacer ejercicio", "pendiente", "media"),
                new TareasDTO(3L, "Leer un libro", "en progreso", "baja"),
                new TareasDTO(4L, "Comprar alimentos", "pendiente", "alta"),
                new TareasDTO(5L, "Escribir código", "completada", "media"));
    }

}
