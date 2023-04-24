package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEmployeeDAO;
import com.example.demo.dto.Employee;

@Service
public class EmployeeService {

	@Autowired
	IEmployeeDAO iEmployeeDAO;
	
	public List<Employee> listEmployee() {
		return iEmployeeDAO.findAll();
	}
	
	public Employee saveEmployee(Employee employee) {
		return iEmployeeDAO.save(employee);
	}
	
	public Employee employeeById(Long id) {
		return iEmployeeDAO.findById(id).get();
	}
	
	public Employee updateEmployee(Employee employee) {
		return iEmployeeDAO.save(employee);
	}
	
	public void delteEmployee(Long id) {
		iEmployeeDAO.deleteById(id);
	}
}
