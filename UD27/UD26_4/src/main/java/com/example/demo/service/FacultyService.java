package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.FacultyDAO;
import com.example.demo.dto.Faculty;

@Service
public class FacultyService {

	@Autowired
	FacultyDAO facultyDAO;
	
	// CRUD
	public List<Faculty> listFaculties() {
		return facultyDAO.findAll();
	}
	
	public Faculty saveFaculty(Faculty faculty) {
		return facultyDAO.save(faculty);
	}
	
	public Faculty facultyById(Long id) {
		return facultyDAO.findById(id).get();
	}
	
	public Faculty updateFaculty(Faculty faculty) {
		return facultyDAO.save(faculty);
	}
	
	public void deteleFaculty(Long id) {
		facultyDAO.deleteById(id);
	}
}
