package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductDAO;
import com.example.demo.dto.Product;

@Service
public class ProductService {

	@Autowired
	ProductDAO productDAO;
	
	// CRUD
	public List<Product> listProducts() {
		return productDAO.findAll();
	}
	
	public Product saveProduct(Product product) {
		return productDAO.save(product);
	}
	
	public Product productById(Long id) {
		return productDAO.findById(id).get();
	}
	
	public Product updateProduct(Product product) {
		return productDAO.save(product);
	}
	
	public void deleteProduct(Long id) {
		productDAO.deleteById(id);
	}
}
