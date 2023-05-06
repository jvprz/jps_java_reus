package com.example.demo.dto;

import jakarta.persistence.*;

@Entity
@Table(name = "salas")
public class Room {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre")
	private String name;
	@ManyToOne()
	@JoinColumn(name = "pelicula")
	private Film film;
	
	// Constructors
	public Room() {}
	
	public Room(Long id, String name, Film film) {
		this.id = id;
		this.name = name;
		this.film = film;
	}
	
	// Getters
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Film getFilm() {
		return film;
	}
	
	// Setters
	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFilm(Film film) {
		this.film = film;
	}
}
