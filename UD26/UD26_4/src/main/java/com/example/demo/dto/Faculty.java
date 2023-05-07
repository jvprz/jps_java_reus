package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "facultades")
public class Faculty {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre")
	private String name;
	@OneToMany
	@JoinColumn(name = "FK_facultad_equipo")
	private List<Team> team;	
	@OneToMany
	@JoinColumn(name = "FK_facultad_investigador")
	private List<Investigator> investigator;
	
	// Constructors
	public Faculty() {}

	public Faculty(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	// Getters
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Team")
	public List<Team> getTeam() {
		return team;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Investigator")
	public List<Investigator> getInvestigator() {
		return investigator;
	}

	// Setters
	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTeam(List<Team> team) {
		this.team = team;
	}

	public void setInvestigator(List<Investigator> investigator) {
		this.investigator = investigator;
	}
}
