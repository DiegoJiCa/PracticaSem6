package com.practica01.controller;
import com.practica01.domain.Estado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EstadoController {
    
    @GetMapping("/")
    public String inicio(Model model){
        var saludo="Saludos desde el backend";
        model.addAttribute("mensaje", saludo);
        
        Estado estado = new Estado("Chile", "Santiago", 19000000, "Sí" );
        model.addAttribute("estado", estado);
        
        return "index";
    }
    
}        
