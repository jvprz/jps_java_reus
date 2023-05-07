package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "proveedores")
public class Supplier {

	// Attributes
	@Id
	private String id;
	@Column(name = "nombre")
	private String name;
	@OneToMany
	@JoinColumn(name = "FK_proveedor")
	private List<Supply> suministro;

	// Constructors
	public Supplier() {}

	public Supplier(String id, String name) {
		this.id = id;
		this.name = name;
	}

	// Getters
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Supply")
	public List<Supply> getSuministro() {
		return suministro;
	}

	// Setters
	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSuministro(List<Supply> suministro) {
		this.suministro = suministro;
	}
}
