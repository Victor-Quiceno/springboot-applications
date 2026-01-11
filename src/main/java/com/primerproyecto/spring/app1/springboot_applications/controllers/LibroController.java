package com.primerproyecto.spring.app1.springboot_applications.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primerproyecto.spring.app1.springboot_applications.model.Libro;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RequestMapping("/api")
@RestController
public class LibroController {

    @GetMapping("/libros")
    public List<Libro> obtenerLibros() {

        return List.of(
                new Libro(1L, "Cien Años de Soledad", "Gabriel García Márquez", 1967, true),
                new Libro(2L, "Don Quijote de la Mancha", "Miguel de Cervantes", 1605, false),
                new Libro(3L, "Rebelión en la Granja", "George Orwell", 1945, true),
                new Libro(4L, "El Principito", "Antoine de Saint-Exupéry", 1943, true));
    }

}
