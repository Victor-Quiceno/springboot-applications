package com.primerproyecto.spring.app1.springboot_applications.models.dto;

public class ProductoClienteDTO {
    private Long id;
    private String nombre, categoria;
    private double precio;
    private boolean disponible;

    public ProductoClienteDTO() {
    }

    public ProductoClienteDTO(Long id, String nombre, String categoria, double precio, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.disponible = disponible;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}