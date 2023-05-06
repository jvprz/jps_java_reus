package com.example.demo.dto;

import jakarta.persistence.*;

@Entity
@Table(name = "ventas")
public class Sale {
	
	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "cajero")
	private Cashier cashier;
	@ManyToOne
	@JoinColumn(name = "producto")
	private Product product;
	@ManyToOne
	@JoinColumn(name = "maquina_registradora")
	private CRegister cRegister;
	
	// Constructors
	public Sale() {}

	public Sale(Long id, Cashier cashier, Product product, CRegister cRegister) {
		this.id = id;
		this.cashier = cashier;
		this.product = product;
		this.cRegister = cRegister;
	}
	
	// Setters & Getters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cashier getCashier() {
		return cashier;
	}

	public void setCashier(Cashier cashier) {
		this.cashier = cashier;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public CRegister getcRegister() {
		return cRegister;
	}

	public void setcRegister(CRegister cRegister) {
		this.cRegister = cRegister;
	}
}
