package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.SupplierDAO;
import com.example.demo.dto.Supplier;

@Service
public class SupplierService {

	@Autowired
	SupplierDAO suppierDAO;

	// CRUD functions
	public List<Supplier> listSuppliers() {
		return suppierDAO.findAll();
	}

	public Supplier saveSupplier(Supplier supplier) {
		return suppierDAO.save(supplier);
	}

	public Supplier supplierById(String id) {
		return suppierDAO.findById(id).get();
	}

	public Supplier updateSupplier(Supplier supplier) {
		return suppierDAO.save(supplier);
	}

	public void deleteSupplier(String id) {
		suppierDAO.deleteById(id);
	}
}
