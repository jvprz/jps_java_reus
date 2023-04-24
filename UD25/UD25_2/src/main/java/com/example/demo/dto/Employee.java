package com.example.demo.dto;

import jakarta.persistence.*;

@Entity
@Table(name="empleados")
public class Employee {
	
	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="dni")
	private String dni;
	@Column(name="nombre")
	private String name;
	@Column(name="apellidos")
	private String lastName;
	@ManyToOne
	@JoinColumn(name="departamento")
	private Departament departament;

	// Contructors
	public Employee() {}
	
	public Employee(String dni, String name, String lastName, Departament departament) {
		this.dni = dni;
		this.name = name;
		this.lastName = lastName;
		this.departament = departament;
	}

	// Getters & Setters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", dni=" + dni + ", name=" + name + ", lastName=" + lastName + ", departament="
				+ departament + "]";
	}
}
