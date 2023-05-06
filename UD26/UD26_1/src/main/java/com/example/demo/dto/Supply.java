package com.example.demo.dto;

import jakarta.persistence.*;

@Entity
@Table(name = "suministra")
public class Supply {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "pieza")
	private Piece piece;
	@ManyToOne
	@JoinColumn(name = "proveedor")
	private Supplier supplier;
	@Column(name = "precio")
	private int price;
	
	// Constructors
	public Supply() {}
	
	public Supply(Long id, Piece piece, Supplier supplier, int price) {
		this.id = id;
		this.piece = piece;
		this.supplier = supplier;
		this.price = price;
	}

	// Getters
	public Long getId() {
		return id;
	}

	public Piece getPiece() {
		return piece;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public int getPrice() {
		return price;
	}

	// Setters
	public void setId(Long id) {
		this.id = id;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
