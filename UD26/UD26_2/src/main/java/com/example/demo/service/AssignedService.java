package com.example.demo.service;

import java.util.List;

import org.hibernate.id.Assigned;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AssignedDAO;

@Service
public class AssignedService {

	@Autowired
	AssignedDAO assignedDAO;
	
	// CRUD
	public List<Assigned> listAssigned() {
		return assignedDAO.findAll();
	}
	
	public Assigned saveAssigned(Assigned assigned) {
		return assignedDAO.save(assigned);
	}
	
	public Assigned assignedById(Long id) {
		return assignedDAO.findById(id).get();
	}
	
	public Assigned updateAssigned(Assigned assigned) {
		return assignedDAO.save(assigned);
	}
	
	public void deleteAssigend(Long id) {
		assignedDAO.deleteById(id);
	}
}
