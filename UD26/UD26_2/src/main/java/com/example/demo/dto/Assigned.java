package com.example.demo.dto;

import jakarta.persistence.*;

@Entity
@Table(name = "asignado_a")
public class Assigned {
	
	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "cientifico")
	private Scientist scientist;
	@ManyToOne
	@JoinColumn(name = "proyecto")
	private Project project;
	
	// Constructors
	public Assigned() {}
	
	public Assigned(Long id, Scientist scientist, Project project) {
		this.id = id;
		this.scientist = scientist;
		this.project = project;
	}

	// Getters
	public Long getId() {
		return id;
	}

	public Scientist getScientist() {
		return scientist;
	}

	public Project getProject() {
		return project;
	}

	// Setters
	public void setId(Long id) {
		this.id = id;
	}

	public void setScientist(Scientist scientist) {
		this.scientist = scientist;
	}

	public void setProject(Project project) {
		this.project = project;
	}
}


