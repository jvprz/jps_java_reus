package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/empleados")
	public List<Employee> listEmployee() {
		return employeeService.listEmployee();
	}
	
	@PostMapping("/empleados")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
	@GetMapping("/empleados/{id}")
	public Employee employeeById(@PathVariable(name="id") Long id) {
		return employeeService.employeeById(id);
	}
	
	@PutMapping("/empleados/{id}")
	public Employee updateEmployee(@PathVariable(name="id") Long id, @RequestBody Employee employee) {
		Employee employeeSelected = new Employee();
		Employee employeeUpdated = new Employee();
		employeeSelected = employeeService.employeeById(id);
		employeeSelected.setDni(employee.getDni());
		employeeSelected.setName(employee.getName());
		employeeSelected.setLastName(employee.getLastName());
		employeeUpdated = employeeService.updateEmployee(employeeSelected);
		return employeeUpdated;
	}
	
	@DeleteMapping("/empleados/{id}")
	public void deleteEmployee(@PathVariable(name="id") Long id) {
		employeeService.delteEmployee(id);
	}
}
