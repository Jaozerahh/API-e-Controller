package com.example.Barbearia.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarqueSeuHoraioController {
        @GetMapping("/marcarhorario")
        public String marcarhoraio() {
            return "Marque seu horario";
        }
}
