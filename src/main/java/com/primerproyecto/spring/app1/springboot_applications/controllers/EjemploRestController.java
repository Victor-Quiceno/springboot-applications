package com.primerproyecto.spring.app1.springboot_applications.controllers;

// import java.util.HashMap;
// import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// import com.primerproyecto.spring.app1.springboot_applications.models.Empleados;
import com.primerproyecto.spring.app1.springboot_applications.models.dto.ClaseDTO;

// Anotación que indica que esta clase es un controlador de Spring MVC
@RestController // Con este controlador lo convertimos en un API REST
@RequestMapping("/api")
public class EjemploRestController {

    @GetMapping("/detalles_info2")

    public ClaseDTO detalles_info2() {

        // Empleados empleado1 = new Empleados("Juan", "Pérez", "Calle Falsa 123", "Desarrollador", 30, 5551234, 1);

        // Map<String, Object> respuesta = new HashMap<>();
        // respuesta.put("Empleado", empleado1);

        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("Administrador");
        usuario1.setUsuario("Informaticonfig");

        return usuario1;
    }
}
