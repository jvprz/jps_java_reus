package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Supplier;
import com.example.demo.service.SupplierService;

@RestController
@RequestMapping("/api")
public class SupplierController {
	
	@Autowired
	SupplierService supplierService;
	
	@GetMapping("/suppliers")
	public List<Supplier> listProveedores() {
		return supplierService.listSuppliers();
	}

	@GetMapping("/suppliers/{id}")
	public Supplier supplierById(@PathVariable(name = "id") String id) {
		Supplier supplierxID = new Supplier();
		supplierxID = supplierService.supplierById(id);
		return supplierxID;
	}
	
	@PostMapping("/suppliers")
	public Supplier saveSupplier(@RequestBody Supplier supplier) {
		return supplierService.saveSupplier(supplier);
	}
	
	@PutMapping("/suppliers/{id}")
	public Supplier updateSupplier(@PathVariable(name = "id") String id, @RequestBody Supplier supplier) {
		Supplier selectedSupplier = new Supplier(id, supplier.getName());
		Supplier updatedSupplier = new Supplier();
		updatedSupplier = supplierService.updateSupplier(selectedSupplier);
		return updatedSupplier;
	}
	
	@DeleteMapping("/suppliers/{id}")
	public void deleteSupplier(@PathVariable(name = "id") String id) {
		supplierService.deleteSupplier(id);
	}
}
