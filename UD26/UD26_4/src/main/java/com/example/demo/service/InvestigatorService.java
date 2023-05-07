package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.InvestigatorDAO;
import com.example.demo.dto.Investigator;

@Service
public class InvestigatorService {

	@Autowired
	InvestigatorDAO investigatorDAO;
	
	// CRUD
	public List<Investigator> listInvestigators() {
		return investigatorDAO.findAll();
	}
	
	public Investigator saveInvestigator(Investigator investigator) {
		return investigatorDAO.save(investigator);
	}
	
	public Investigator investigatorById(String dni) {
		return investigatorDAO.findById(dni).get();
	}
	
	public Investigator updateInvestigator(Investigator investigator) {
		return investigatorDAO.save(investigator);
	}
	
	public void deleteInvestigator(String dni) {
		investigatorDAO.deleteById(dni);
	}
}
