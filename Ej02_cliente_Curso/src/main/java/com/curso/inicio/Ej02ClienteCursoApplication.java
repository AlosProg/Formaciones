package com.curso.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.curso.controller","com.curso.service"})
public class Ej02ClienteCursoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ej02ClienteCursoApplication.class, args);
	}

}
