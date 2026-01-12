package com.primerproyecto.spring.app1.springboot_applications.models.dto;

public class ProductoAdminDTO {

    private Long id;
    private String nombre, categoria;
    private double precioCosto, precioPublico, margenGanancia;
    private int stockReal;
    private boolean disponible;

    public ProductoAdminDTO() {
    }

    public ProductoAdminDTO(Long id, String nombre, String categoria, double precioCosto, double precioPublico,
            double margenGanancia, int stockReal, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precioCosto = precioCosto;
        this.precioPublico = precioPublico;
        this.margenGanancia = margenGanancia;
        this.stockReal = stockReal;
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

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public double getPrecioPublico() {
        return precioPublico;
    }

    public void setPrecioPublico(double precioPublico) {
        this.precioPublico = precioPublico;
    }

    public double getMargenGanancia() {
        return margenGanancia;
    }

    public void setMargenGanancia(double margenGanancia) {
        this.margenGanancia = margenGanancia;
    }

    public int getStockReal() {
        return stockReal;
    }

    public void setStockReal(int stockReal) {
        this.stockReal = stockReal;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}
