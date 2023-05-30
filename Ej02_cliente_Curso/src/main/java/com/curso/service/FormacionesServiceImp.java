package com.curso.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.model.Curso;
import com.curso.model.Formacion;

@Service
public class FormacionesServiceImp implements FormacionesService {

	@Autowired
	RestTemplate template;
	
	private String url = "http://localhost:8080/cursos";
	
	@Override
	public List<Curso> listaCursos() {
		Formacion form = new Formacion();
		Curso[] cursos=template.getForObject(url,Curso[].class);
		for(Curso cur: cursos) {
			if(cur.getDuracion()>=50) {
				form.setAsignaturas(10);
			}
			else {
				form.setAsignaturas(5);
			}
		}
		
		return Arrays.asList(template.getForObject(url, Curso[].class));
	}

	@Override
	public void altaCurso (Formacion form) {
		
		Curso curso = new Curso();
		curso.setDuracion(form.getAsignaturas()*10);
		curso.setCodCurso(curso.getCodCurso());
		curso.setNombre(form.getCurso());
		curso.setPrecio((int) form.getPrecio());
		
		List<Curso> listaCur = listaCursos();
		for(Curso curso2: listaCur) {
			if(curso2.getNombre().equals(curso.getNombre())) {
				return;
			}
		}
		template.postForLocation(url, curso);
		
	}
}
