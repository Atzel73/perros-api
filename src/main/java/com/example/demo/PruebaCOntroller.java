package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/pruebita")
public class PruebaCOntroller {

	@GetMapping("/prueba-ruta")
	public String controllerPrueba() {
		return "prueba";
	}
	
}
