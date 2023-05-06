package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import com.example.demo.dao.ScientistDAO;
import com.example.demo.dto.Scientist;

@Service
public class ScientistService {

	@Autowired
	ScientistDAO scientistDAO;
	
	// CRUD
	public List<Scientist> listScientists() {
		return scientistDAO.findAll();
	}
	
	public Scientist saveScientist(Scientist scientist) {
		return scientistDAO.save(scientist);
	}
	
	public Scientist scientistById(String id) {
		return scientistDAO.findById(id).get();
	}
	
	public Scientist updateScientist(Scientist scientist) {
		return scientistDAO.save(scientist);
	}
	
	public void deleteScientist(String id) {
		scientistDAO.deleteById(id);
	}
}
