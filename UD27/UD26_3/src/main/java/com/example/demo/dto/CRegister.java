package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "maquinas_registradoras")
public class CRegister {
	
	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "piso")
	private int floor;
	@OneToMany
	@JoinColumn(name = "FK_maquina_registradora")
	private List<Sale> sale;

	// Constructors
	public CRegister() {}
	
	public CRegister(Long id, int floor) {
		this.id = id;
		this.floor = floor;
	}

	// Getters
	public Long getId() {
		return id;
	}

	public int getFloor() {
		return floor;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Sale")
	public List<Sale> getSale() {
		return sale;
	}

	// Setters
	public void setId(Long id) {
		this.id = id;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public void setSale(List<Sale> sale) {
		this.sale = sale;
	}
}
