package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CRegisterDAO;
import com.example.demo.dto.CRegister;

@Service
public class CRegisterService {

	@Autowired
	CRegisterDAO cRegisterDAO;
	
	// CRUD
	public List<CRegister> listCRegisters() {
		return cRegisterDAO.findAll();
	}
	
	public CRegister saveCRegister(CRegister cRegister) {
		return cRegisterDAO.save(cRegister);
	}
	
	public CRegister cRegisterById(Long id) {
		return cRegisterDAO.findById(id).get();
	}
	
	public CRegister updateCRegister(CRegister cRegister) {
		return cRegisterDAO.save(cRegister);
	}
	
	public void deleteCRegister(Long id) {
		cRegisterDAO.deleteById(id);
	}
}
