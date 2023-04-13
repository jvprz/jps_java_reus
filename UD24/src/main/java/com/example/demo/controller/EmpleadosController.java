package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Empleados;
import com.example.demo.service.IEmpleadosServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadosController {

	@Autowired
	IEmpleadosServiceImpl empleadosServiceImpl;
	
	@GetMapping("/empleados")
	public List<Empleados> listEmpleados() {
		return empleadosServiceImpl.listEmpleados();
	}
	
	@GetMapping("/empleados/nombre/{nombre}")
	public List<Empleados> listEmpleadoXName(@PathVariable(name="nombre") String nombre) {
		return empleadosServiceImpl.listEmpleadosName(nombre);
	}
	
	@PostMapping("/empleados")
	public Empleados saveEmpleado(@RequestBody Empleados empleados) {
		return empleadosServiceImpl.saveEmpleados(empleados);
	}
	
	@GetMapping("/empleados/{id}")
	public Empleados empleadosXId(@PathVariable(name="id") Long id) {
		Empleados empleados_xId = new Empleados();
		empleados_xId = empleadosServiceImpl.empleadosXId(id);
		System.out.println("Empleado xID: " + empleados_xId);
		return empleados_xId;		
	}
	
	@PutMapping("/empleados/{id}")
	public Empleados updateEmpleados(@PathVariable(name="id") Long id, @RequestBody Empleados empleados) {
		Empleados empleado_seleccionado = new Empleados();
		Empleados empleado_actualizado = new Empleados();
		
		empleado_seleccionado = empleadosServiceImpl.empleadosXId(id);
		
		empleado_seleccionado.setNombre(empleados.getNombre());
		empleado_seleccionado.setTrabajo(empleados.getTrabajo());
		
		empleado_actualizado = empleadosServiceImpl.updateEmpleados(empleado_seleccionado);
		System.out.println("El empleado actualizado es " + empleado_actualizado);
		
		return empleado_actualizado;
	}
	
	@DeleteMapping("/empleados/{id}")
	public void deteleEmpleados(@PathVariable(name="id") Long id) {
		empleadosServiceImpl.deleteEmpleados(id);
	}
}
