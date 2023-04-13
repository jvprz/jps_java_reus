package com.example.demo.dto;

import jakarta.persistence.*;

@Entity
@Table(name="empleados")
public class Empleados {
	
	// Attributes of "empleados".
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="trabajo")
	private String trabajo;
	
	// Constructors
	public Empleados() {		
	}
	
	/**
	 * @param nombre
	 * @param trabajo
	 */
	public Empleados(String nombre, String trabajo) {
		this.nombre = nombre;
		this.trabajo = trabajo;
	}

	// Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	public Long getId() {
		return id;
	}

	// ToString method.
	@Override
	public String toString() {
		return "Empleados [id=" + id + ", nombre=" + nombre + ", trabajo=" + trabajo + "]";
	}	
}
