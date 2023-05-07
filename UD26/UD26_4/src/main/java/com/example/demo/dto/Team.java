package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "equipos")
public class Team {

	// Attributes
	@Id
	private String id;
	@Column(name = "nombre")
	private String name;
	@ManyToOne
	@JoinColumn(name = "facultad")
	private Faculty faculty;
	@OneToMany
	@JoinColumn(name = "FK_equipo")
	private List<Booking> booking;
	
	// Constructors
	public Team() {}

	public Team(String id, String name, Faculty faculty) {
		this.id = id;
		this.name = name;
		this.faculty = faculty;
	}

	// Getters
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Booking")
	public List<Booking> getBooking() {
		return booking;
	}

	// Setters
	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}
}
