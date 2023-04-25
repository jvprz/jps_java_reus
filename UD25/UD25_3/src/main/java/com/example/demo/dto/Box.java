package com.example.demo.dto;

import jakarta.persistence.*;

@Entity
@Table(name="cajas")
public class Box {
	
	// Attributes
	@Id
	@Column(name="numReferencia")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long number;
	@Column(name="contenido")
	private String content;
	@Column(name="valor")
	private int value;
	@ManyToOne
	@JoinColumn(name="almacen")
	private Store store;
	
	// Constructors
	public Box() {}
	
	public Box(String content, int value, Store store) {
		this.content = content;
		this.value = value;
		this.store = store;
	}

	// Getters & Setters
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Long getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "Box [number=" + number + ", content=" + content + ", value=" + value + ", store=" + store + "]";
	}
}
