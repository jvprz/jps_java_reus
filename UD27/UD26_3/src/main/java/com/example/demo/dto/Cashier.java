package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "cajeros")
public class Cashier {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre_apellidos")
	private String names;
	@OneToMany
	@JoinColumn(name = "FK_cajero")
	private List<Sale> sale;

	// Constructors
	public Cashier() {}

	public Cashier(Long id, String names) {
		this.id = id;
		this.names = names;
	}

	// Getters
	public Long getId() {
		return id;
	}

	public String getNames() {
		return names;
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

	public void setNames(String names) {
		this.names = names;
	}

	public void setSale(List<Sale> sale) {
		this.sale = sale;
	}
}
