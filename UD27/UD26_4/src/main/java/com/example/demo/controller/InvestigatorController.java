package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Investigator;
import com.example.demo.service.InvestigatorService;

@RestController
@RequestMapping("/api")
public class InvestigatorController {

	@Autowired
	InvestigatorService investigatorService;
	
	@GetMapping("/investigator")
	public List<Investigator> listInvestigators() {
		return investigatorService.listInvestigators();
	}
	
	@GetMapping("/investigator/{id}")
	public Investigator investigatorById(@PathVariable(name = "dni") String dni) {
		return investigatorService.investigatorById(dni);
	}
	
	@PostMapping("/investigator")
	public Investigator saveInvestigator(@RequestBody Investigator investigator) {
		return investigatorService.saveInvestigator(investigator);
	}
	
	@PutMapping("/investigator/{id}")
	public Investigator updateInvestigator(@PathVariable(name = "dni") String dni, @RequestBody Investigator investigator) {
		Investigator selectedInvestigator = new Investigator(dni, investigator.getName(), investigator.getFaculty());
		return investigatorService.updateInvestigator(selectedInvestigator);
	}
	
	@DeleteMapping("/investigator/{id}")
	public void deleteInvestigator(@PathVariable(name = "dni") String dni) {
		investigatorService.deleteInvestigator(dni);
	}
}
