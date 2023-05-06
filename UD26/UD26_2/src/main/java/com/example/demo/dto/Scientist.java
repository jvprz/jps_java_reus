package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "cientificos")
public class Scientist {

	// Attributes
	@Id
	private String dni;
	@Column(name = "nombre_apellidos")
	private String names;
	@OneToMany
	@JoinColumn(name = "FK_cientifico")
	private List<Assigned> assigned;
	
	// Constructors
	public Scientist() {}

	public Scientist(String dni, String names) {
		this.dni = dni;
		this.names = names;
	}

	// Getters
	public String getDni() {
		return dni;
	}

	public String getNames() {
		return names;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Assigned")
	public List<Assigned> getAssigned() {
		return assigned;
	}

	// Setters
	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public void setAssigned(List<Assigned> assigned) {
		this.assigned = assigned;
	}
}