package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Scientist;
import com.example.demo.service.ScientistService;

@RestController
@RequestMapping("/api")
public class ScientistController {
	
	@Autowired
	ScientistService scientistService;
	
	@GetMapping("/scientists")
	public List<Scientist> listScientists() {
		return scientistService.listScientists();
	}
	
	@GetMapping("/scientists/{dni}")
	public Scientist scientistById(@PathVariable(name = "DNI") String dni) {
		Scientist scientistxId = new Scientist();
		scientistxId = scientistService.scientistById(dni);
		return scientistxId;
	}
	
	@PostMapping("/scientists")
	public Scientist saveScientist(@RequestBody Scientist scientist) {
		return scientistService.saveScientist(scientist);
	}
	
	@PutMapping("/scientists/{DNI}")
	public Scientist updateScientist(@PathVariable(name = "DNI") String DNI, @RequestBody Scientist scientist) {
		Scientist selectedScientist = new Scientist(DNI, scientist.getNames());
		Scientist updatedScientist = new Scientist();
		updatedScientist = scientistService.updateScientist(selectedScientist);
		return updatedScientist;
	}
	
	@DeleteMapping("/scientists/{DNI}")
	public void deleteScientist(@PathVariable(name = "DNI") String DNI) {
		scientistService.deleteScientist(DNI);
	}
}
