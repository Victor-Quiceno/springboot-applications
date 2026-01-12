package com.primerproyecto.spring.app1.springboot_applications.models.dto;

public class ClaseDTO {
    private String titulo, usuario;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public ClaseDTO(String titulo, String usuario) {
        this.titulo = titulo;
        this.usuario = usuario;
    }

    public ClaseDTO() {
    }

    

}
