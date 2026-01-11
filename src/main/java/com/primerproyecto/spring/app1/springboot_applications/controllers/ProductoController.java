package com.primerproyecto.spring.app1.springboot_applications.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primerproyecto.spring.app1.springboot_applications.model.Producto;

@RestController
@RequestMapping("/api")
public class ProductoController {

    @GetMapping("/productos")
    public List<Producto> obtenerProductos() {
        return Arrays.asList(
                new Producto(1L, "Laptop", 1200.0),
                new Producto(2L, "Mouse", 25.0),
                new Producto(3L, "Teclado", 50.0));
    }
}
