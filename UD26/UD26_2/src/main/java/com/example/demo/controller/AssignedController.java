package com.example.demo.controller;

import java.util.List;

import org.hibernate.id.Assigned;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.service.AssignedService;

@RestController
@RequestMapping("/api")
public class AssignedController {

	@Autowired
	AssignedService assignedService;
	
	@GetMapping("/assigned/{id}")
	public List<Assigned> listAssigned() {
		return assignedService.listAssigned();
	}
	
	@GetMapping("/assigned/{id}")
	public Assigned assignedById(@PathVariable(name = "id") Long id) {
		Assigned assignedxId = new Assigned();
		assignedxId = assignedService.assignedById(id);
		return assignedxId;
	}
	
	@PostMapping("/assigned")
	public Assigned saveAssigned(@RequestBody Assigned assigned) {
		return assignedService.saveAssigned(assigned);
	}
	
	@PutMapping("/assigned/{id}")
	public Assigned updateAssigned(@PathVariable(name = "id") Long id, @RequestBody Assigned assigned) {
		Assigned selectedAssigned = new Assigned(id, assigned.getScientist(), assigned.getProject());
		Assigned updatedAssigned = new Assigned();
		updatedAssigned = assignedService.updateAssigned(selectedAssigned);
		return updatedAssigned;
	}
	
	@DeleteMapping("/assigned/{id}")
	public void deleteAssigned(@PathVariable(name = "id") Long id) {
		assignedService.deleteAssigend(id);
	}
}