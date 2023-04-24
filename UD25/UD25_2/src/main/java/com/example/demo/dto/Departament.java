package com.example.demo.dto;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name="departamentos")
public class Departament {
	
	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="nombre")
	private String name;
	@Column(name="presupuesto")
	private int budget;
	@OneToMany
	@JoinColumn(name="id")
	private List<Employee> employee;
	
	// Constructors
	public Departament() {}
	
	public Departament(String name, int budget) {
		this.name = name;
		this.budget = budget;
	}

	// Setters & Getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Departament [id=" + id + ", name=" + name + ", budget=" + budget + ", employee=" + employee + "]";
	}
}
