package com.curso.model;

public class Formacion {
	
	private String curso;
	private int asignaturas;
	private double precio;
	
	public Formacion(String curso, int asignaturas, double precio) {
		this.curso = curso;
		this.asignaturas = asignaturas;
		this.precio = precio;
	}

	public Formacion() {
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(int asignaturas) {
		this.asignaturas = asignaturas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	

}
