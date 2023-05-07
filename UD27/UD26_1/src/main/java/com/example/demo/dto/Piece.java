package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "piezas")
public class Piece {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre")
	private String name;
	@OneToMany
	@JoinColumn(name = "FK_pieza")
	private List<Supply> supply;
	
	// Constructors
	public Piece() {}
	
	public Piece(Long id, String name) {
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
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Supply")
	public List<Supply> getSupply() {
		return supply;
	}

	// Setters
	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSupply(List<Supply> supply) {
		this.supply = supply;
	}
}
