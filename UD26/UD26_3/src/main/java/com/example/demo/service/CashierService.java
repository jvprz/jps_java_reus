package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CashierDAO;
import com.example.demo.dto.Cashier;

@Service
public class CashierService {

	@Autowired
	CashierDAO cashierDAO;
	
	// CRUD
	public List<Cashier> listCashiers() {
		return cashierDAO.findAll();
	}
	
	public Cashier saveCashier(Cashier cashier) {
		return cashierDAO.save(cashier);
	}
	
	public Cashier cashierById(Long id) {
		return cashierDAO.findById(id).get();
	}
	
	public Cashier updateCashier(Cashier cashier) {
		return cashierDAO.save(cashier);
	}
	
	public void deleteCashier(Long id) {
		cashierDAO.deleteById(id);
	}
}
