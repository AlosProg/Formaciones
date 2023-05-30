package com.curso.service;

import java.util.List;

import com.curso.model.Curso;
import com.curso.model.Formacion;

public interface FormacionesService {

	List<Curso> listaCursos();
	
	void altaCurso(Formacion form);
}
