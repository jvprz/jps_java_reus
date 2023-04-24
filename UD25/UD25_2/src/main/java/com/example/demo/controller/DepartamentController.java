package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Departament;
import com.example.demo.service.DepartamentService;

@RestController
@RequestMapping("/api")
public class DepartamentController {
	
	@Autowired
	DepartamentService departamentService;
	
	@GetMapping("/departamentos")
	public List<Departament> listDepartament() {
		return departamentService.listDepartament();
	}

	@GetMapping("/departamentos/{id}")
	public Departament listDepartamentById(@PathVariable(name="id") Long id) {
		return departamentService.DepartamentById(id);
	}
	
	@PutMapping("/departamentos/{id}")
	public Departament updateDepartament(@PathVariable(name="id") Long id, @RequestBody Departament departament) {
		Departament departamentSelected = new Departament();
		Departament departamentUpdated = new Departament();
		departamentSelected = departamentService.DepartamentById(id);
		departamentSelected.setName(departament.getName());
		departamentSelected.setBudget(departament.getBudget());
		departamentUpdated = departamentService.updateDepartament(departamentSelected);
		return departamentUpdated;
	}
	
	@DeleteMapping("/departamentos/{id}")
	public void deleteDepartament(@PathVariable(name="id") Long id) {
		departamentService.deleteDepartament(id);
	}
}
