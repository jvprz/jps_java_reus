package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Faculty;
import com.example.demo.service.FacultyService;

@RestController
@RequestMapping("/api")
public class FacultyController {

	@Autowired
	FacultyService facultyService;
	
	@GetMapping("/faculty")
	public List<Faculty> listFaculties() {
		return facultyService.listFaculties();
	}
	
	@GetMapping("/faculty/{id}")
	public Faculty facultyById(@PathVariable(name = "id") Long id) {
		return facultyService.facultyById(id);
	}
	
	@PostMapping("/faculty")
	public Faculty saveFaculty(@RequestBody Faculty faculty) {
		return facultyService.saveFaculty(faculty);
	}
	
	@PutMapping("/faculty/{id}")
	public Faculty updateFaculty(@PathVariable(name = "id") Long id, @RequestBody Faculty faculty) {
		Faculty selectedFaculty = new Faculty(id, faculty.getName());
		return facultyService.updateFaculty(selectedFaculty);
	}
	
	@DeleteMapping("/faculty/{id}")
	public void deleteFaculty(@PathVariable(name = "id") Long id) {
		facultyService.deteleFaculty(id);
	}
}
