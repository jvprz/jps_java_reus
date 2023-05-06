package com.example.demo.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "peliculas")
public class Film {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="nombre")
	private String name;
	@Column(name="edad_minima")
	private int age;
	@OneToMany
	@JoinColumn(name="FK_pelicula")
	private List<Room> rooms;

	// Constructors
	public Film() {}
	
	public Film(Long id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// Getters
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Room")
	public List<Room> getRooms() {
		return rooms;
	}
	
	// Setters
	public void setId(Long id) {
		this.id = id;
	}

	public void setNombre(String name) {
		this.name = name;
	}

	public void setEdad_minima(int age) {
		this.age = age;
	}

	public void setSalas(List<Room> rooms) {
		this.rooms = rooms;
	}
}
