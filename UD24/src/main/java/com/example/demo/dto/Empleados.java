package com.example.demo.dto;

import jakarta.persistence.*;

@Entity
@Table(name="empleados")
public class Empleados {
	
	// Attributes of "empleados".
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="trabajo")
	@Enumerated(EnumType.STRING)
	private Trabajos trabajo;
	@Column(name="salario")
	private int salario;
	
	// Base salaries
	private static final int SALARIO_PROGRAMADOR = 5000;
	private static final int SALARIO_DISENADOR = 6000;
	private static final int SALARIO_GERENTE = 8000;
	private static final int SALARIO_VENDEDOR = 4000;
	
	// Constructors
	public Empleados() {		
	}
	
	/**
	 * @param nombre
	 * @param trabajo
	 */
	public Empleados(String nombre, Trabajos trabajo) {
		this.nombre = nombre;
		this.trabajo = trabajo;
	}

	// Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Trabajos getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(Trabajos trabajo) {
		this.trabajo = trabajo;
	}

	public Long getId() {
		return id;
	}
	
	public int getSalarioBase() {
        switch (trabajo) {
            case PROGRAMADOR:
                return SALARIO_PROGRAMADOR;
            case DISEÑADOR:
                return SALARIO_DISENADOR;
            case GERENTE:
                return SALARIO_GERENTE;
            case VENDEDOR:
                return SALARIO_VENDEDOR;
            default:
                return 0;
        }
    }
	
	public void setSalario(int salario) {
		this.salario = salario;
	}
	

	public static int getSalarioProgramador() {
		return SALARIO_PROGRAMADOR;
	}

	public static int getSalarioDisenador() {
		return SALARIO_DISENADOR;
	}

	public static int getSalarioGerente() {
		return SALARIO_GERENTE;
	}

	public static int getSalarioVendedor() {
		return SALARIO_VENDEDOR;
	}

	// ToString method.
	@Override
	public String toString() {
		return "Empleados [id=" + id + ", nombre=" + nombre + ", trabajo=" + trabajo + "]";
	}	
}
