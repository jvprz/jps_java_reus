package com.example.demo.dto;

import java.util.List;

import org.hibernate.id.Assigned;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;


@Entity
@Table(name = "proyectos")
public class Project {

	// Attributes
	@Id
	private String id;
	@Column(name = "nombre")
	private String name;
	@Column(name = "horas")
	private int hours;
	@OneToMany
	@JoinColumn(name = "FK_proyecto")
	private List<Assigned> assigned;
	
	// Constructors
	public Project() {}
	
	public Project(String id, String name, int hours) {
		this.id = id;
		this.name = name;
		this.hours = hours;
	}

	// Getters
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getHours() {
		return hours;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Assigned")
	public List<Assigned> getAssigned() {
		return assigned;
	}

	// Setters
	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public void setAssigned(List<Assigned> assigned) {
		this.assigned = assigned;
	}
}