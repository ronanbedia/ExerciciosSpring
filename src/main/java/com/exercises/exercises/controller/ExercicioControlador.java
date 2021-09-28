package com.exercises.exercises.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio1")
public class ExercicioControlador {
	
	@GetMapping("/habilidades")
	public String habilidadesMentalidades() {
		return "Hello World! Para essa atividade precisei focar muito "
				+ "na mentalidade de crescimento e principalmente na persistencia!";
		
	}
	
	@GetMapping("/melhorias")
	public String habilidadesParaMelhorar() {
		return "É necessário que eu foque na gestão de tempo e proatividade!";
	}

}
