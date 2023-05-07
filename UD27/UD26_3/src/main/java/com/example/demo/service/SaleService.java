package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.SaleDAO;
import com.example.demo.dto.Sale;

@Service
public class SaleService {

	@Autowired
	SaleDAO saleDAO;
	
	// CRUD
	public List<Sale> listSales() {
		return saleDAO.findAll();
	}
	
	public Sale saveSale(Sale sale) {
		return saleDAO.save(sale);
	}
	
	public Sale saleById(Long id) {
		return saleDAO.findById(id).get();
	}
	
	public Sale updateSale(Sale sale) {
		return saleDAO.save(sale);
	}
	
	public void deleteSale(Long id) {
		saleDAO.deleteById(id);
	}
}
