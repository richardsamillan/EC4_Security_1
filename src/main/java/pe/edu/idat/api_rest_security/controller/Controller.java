package pe.edu.idat.api_rest_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/home")
public class Controller {
    @GetMapping("/users")
    public String apiUser() {return "Esta es la api de usuarios";}
    @GetMapping("/admin")
    public String apiAdmin() {return "Esta es la api de administradores";}
    @GetMapping("/general")
    public String apiGeneral() {return "Esta es la api general para usuarios registrados";}

}
