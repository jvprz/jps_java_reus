package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name="articulos")
public class Articulo {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="nombre")
	private String name;
	@Column(name="precio")
	private int price;
	@ManyToOne
	@JoinColumn(name="fabricante")
	private Fabricante maker;
	
	// Constructors
	public Articulo() {}
	
	public Articulo(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// Setters & Getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fabricantes")
	public Fabricante getMaker() {
		return maker;
	}

	public void setMaker(Fabricante maker) {
		this.maker = maker;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Articulo [id=" + id + ", name=" + name + ", price=" + price + ", maker=" + maker + "]";
	}
}
