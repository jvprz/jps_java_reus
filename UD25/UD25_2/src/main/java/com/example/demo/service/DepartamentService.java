package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDepartamentDAO;
import com.example.demo.dto.Departament;

@Service
public class DepartamentService {
	
	@Autowired
	IDepartamentDAO iDepartamentDAO;
	
	public List<Departament> listDepartament() {
		return iDepartamentDAO.findAll();
	}
	
	public Departament saveDepartament(Departament departament) {
		return iDepartamentDAO.save(departament);
	}
	
	public Departament updateDepartament(Departament departament) {
		return iDepartamentDAO.save(departament);
	}
	
	public Departament DepartamentById(Long id) {
		return iDepartamentDAO.findById(id).get();
	}
	
	public void deleteDepartament(Long id) {
		iDepartamentDAO.deleteById(id);
	}
}
