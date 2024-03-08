package com.example.Barbearia.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicioContoller {
    @GetMapping("/")
    public String Inicio() {
        return "Bem vindo";
    }
}
