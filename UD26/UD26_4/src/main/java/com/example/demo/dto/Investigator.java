package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "investigadores")
public class Investigator {

	// Attributes
	@Id
	private String dni;
	@Column(name = "nombre")
	private String name;
	@ManyToOne
	@JoinColumn(name = "facultad")
	private Faculty faculty;
	@OneToMany
	@JoinColumn(name = "FK_investigador")
	private List<Booking> booking;
	
	// Constructors
	public Investigator() {}

	public Investigator(String dni, String name, Faculty faculty) {
		this.dni = dni;
		this.name = name;
		this.faculty = faculty;
	}

	// Getters
	public String getDni() {
		return dni;
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
	public void setDni(String dni) {
		this.dni = dni;
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
