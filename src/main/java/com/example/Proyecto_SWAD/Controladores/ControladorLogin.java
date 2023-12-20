
package com.example.Proyecto_SWAD.Controladores;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorLogin {

    @GetMapping("/login")
    public String login() {
        return "login"; //login.html
    }
    @GetMapping("/acceso-denegado")
    public String AccesoDenegado() {
        return "access-denied"; //login.html
    }    

}

