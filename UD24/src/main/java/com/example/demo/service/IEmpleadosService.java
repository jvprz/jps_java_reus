package com.example.demo.service;

import java.util.List;
import com.example.demo.dto.Empleados;

public interface IEmpleadosService {

	// CRUD
	public List<Empleados> listEmpleados(); 					// List all
	
	public Empleados saveEmpleados(Empleados empleados);		// CREATE
	
	public Empleados empleadosXId(Long id);						// Data from one id
	
	public List<Empleados> listEmpleadosName(String nombre);	// Data form one name
	
	public Empleados updateEmpleados(Empleados empleados);		// UPDATE
	
	public void deleteEmpleados(Long id);						// DELETE
}
