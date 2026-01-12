package com.primerproyecto.spring.app1.springboot_applications.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primerproyecto.spring.app1.springboot_applications.models.Persona;
import com.primerproyecto.spring.app1.springboot_applications.models.dto.PersonaAdminDTO;
import com.primerproyecto.spring.app1.springboot_applications.models.dto.PersonaUsuarioDTO;

@RestController
@RequestMapping("/api")
public class PersonaRestController {

    @GetMapping("/personas/{id}")
    public PersonaUsuarioDTO obtenerPersona(@PathVariable Long id) {

        Persona persona = obtenerPersonaDummy(id);

        return new PersonaUsuarioDTO(persona.getId(),
                persona.getNombre(),
                persona.getApellido());

    }

    @GetMapping("/admin/personas/{id}")
    public PersonaAdminDTO obtenerPersonaAdmin(@PathVariable Long id) {

        Persona persona = obtenerPersonaDummy(id);

        return new PersonaAdminDTO(persona.getId(),
                persona.getCc(),
                persona.getNombre(),
                persona.getApellido(),
                persona.getDireccion(),
                persona.getTelefono(),
                persona.isActivo());
    }

    private Persona obtenerPersonaDummy(Long id) {
        switch (id.intValue()) {
            case 1:
                return new Persona(1L, 12345678, "Juan", "Pérez", "Calle Falsa 123", "555-1234", true);
            case 2:
                return new Persona(2L, 87654321, "María", "Gómez", "Avenida Siempre Viva 742", "555-5678", false);
            case 3:
                return new Persona(3L, 11223344, "Carlos", "López", "Boulevard Central 456", "555-8765", true);
            default:
                return new Persona(id, 0, "Desconocido", "Desconocido", "Desconocida", "N/A", false);
        }
    }

}
