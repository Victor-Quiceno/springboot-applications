package com.primerproyecto.spring.app1.springboot_applications.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primerproyecto.spring.app1.springboot_applications.models.Producto;
import com.primerproyecto.spring.app1.springboot_applications.models.dto.ProductoClienteDTO;
import com.primerproyecto.spring.app1.springboot_applications.models.dto.ProductoAdminDTO;

@RestController
@RequestMapping("/api")
public class ProductoController {

    @GetMapping("/productos/{id}")
    public ProductoClienteDTO obtenerProductoCliente(@PathVariable Long id) {

        Producto producto = obtenerProductoDummy(id);

        return new ProductoClienteDTO(
            producto.getId(),
            producto.getNombre(),
            producto.getCategoria(),
            producto.getPrecioPublico(),
            producto.isDisponible()
        );
    }

    @GetMapping("/admin/productos/{id}")
    public ProductoAdminDTO obtenerProductoAdmin(@PathVariable Long id) {

        Producto producto = obtenerProductoDummy(id);

        return new ProductoAdminDTO(
            producto.getId(),
            producto.getNombre(),
            producto.getCategoria(),
            producto.getPrecioCosto(),
            producto.getPrecioPublico(),
            producto.getPrecioPublico() - producto.getPrecioCosto(), // Esto es el margen de ganancia
            producto.getStockReal(),
            producto.isDisponible()
        );
    }

    private Producto obtenerProductoDummy(Long id) {

        switch (id.intValue()) {
            case 1:
                return new Producto (1L, "Laptop Gamer", "Electrónica", 800.00, 1200.00, 10, true);
            case 2:
                return new Producto (2L, "Mouse Inalámbrico", "Electrónica", 25.00, 50.00, 5, true);
        
            default:
                return new Producto (id, "Producto no encontrado", "Desconocida", 0.0, 0.0, 0, false);
        }
    }
    
}
