package com.primerproyecto.spring.app1.springboot_applications.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primerproyecto.spring.app1.springboot_applications.models.Tarea;

import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")
public class TareaController {

    @PostMapping("/tareas")
    public ResponseEntity<Tarea> crearTarea(@RequestBody Tarea tarea) {

        System.out.println("Tarea recibida: " + tarea.getTitulo() + ", \nDescripcion: "
                + tarea.getDescripcion() + ", \nPrioridad: " + tarea.getPrioridad());

                Random random = new Random();
                tarea.setId(100L + random.nextInt(900));
        return ResponseEntity.status(HttpStatus.CREATED).body(tarea);
    }

}
