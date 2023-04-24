package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.dao.IFabricanteDAO;
import com.example.demo.dto.Fabricante;

public class FabricanteService {

	@Autowired
	IFabricanteDAO iFabricantesDAO;
	
	public List<Fabricante> listMaker() {
		return iFabricantesDAO.findAll();
	}
	
	public Fabricante saveMaker(Fabricante maker) {
		return iFabricantesDAO.save(maker);
	}
	
	public Fabricante makerById(Long id) {
		return iFabricantesDAO.findById(id).get();
	}
	
	public Fabricante updateMaker(Fabricante maker) {
		return iFabricantesDAO.save(maker);
	}
	
	public void deleteMaker(Long id) {
		iFabricantesDAO.deleteById(id);
	}
}
