package com.example.demo.dto;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name="fabricantes")
public class Fabricante {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="nombre")
	private String name;
	@OneToMany
	@JoinColumn(name="id")
	private List<Articulo> article;
	
	// Constructor
	public Fabricante() {}
	
	public Fabricante(String name) {
		this.name = name;
	}

	// Setters & Getters
	public String getName() {
		return name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Articulo> getArticle() {
		return article;
	}

	public void setArticle(List<Articulo> article) {
		this.article = article;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Fabricante [id=" + id + ", name=" + name + ", article=" + article + "]";
	}
}
