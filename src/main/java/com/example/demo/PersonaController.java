package com.example.demo;

import java.util.Arrays;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonaController {
  @RequestMapping("/lista")
  public String lista(Model modelo) {
    
		Persona p1 = new Persona("Wasi", "Contreras", 34);
		Persona p2 = new Persona("El", "Patron", 40);
		Persona p3 = new Persona("Raichuy", "rayito", 15);
		Persona p4 = new Persona("Lucas", "pato", 50);
    
    List<Persona> personas= Arrays.asList(p1,p2,p3);
    modelo.addAttribute("personas", personas);
    return "lista";
    
  }
}