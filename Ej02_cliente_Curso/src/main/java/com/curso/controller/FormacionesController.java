package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Formacion;
import com.curso.model.Curso;
import com.curso.service.FormacionesService;
import com.curso.service.FormacionesServiceImp;

@RestController
public class FormacionesController {

	@Autowired
	FormacionesServiceImp service;
	
	//http://localhost:9090/formacion/
	@PostMapping(value="formacion/{curso}/{asignaturas}/{precio}")
	public void nuevoCurso(
			@PathVariable ("curso") String curso,
			@PathVariable ("asignaturas") int asignaturas,
			@PathVariable ("precio") double precio
			){
		Formacion form = new Formacion (curso, asignaturas, precio);
		service.altaCurso(form);
	}
}
