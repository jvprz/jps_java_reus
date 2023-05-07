package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Sale;
import com.example.demo.service.SaleService;

@RestController
@RequestMapping("/api")
public class SaleController {

	@Autowired
	SaleService saleService;
	
	@GetMapping("/sales")
	public List<Sale> listSales() {
		return saleService.listSales();
	}
	
	@GetMapping("/sales/{id}")
	public Sale saleById(@PathVariable(name = "id") Long id) {
		return saleService.saleById(id);
	}
	
	@PostMapping("/sales")
	public Sale saveSale(@RequestBody Sale sale) {
		return saleService.saveSale(sale);
	}
	
	@PutMapping("/sales/{id}")
	public Sale updateSale(@PathVariable(name = "id")Long id, @RequestBody Sale sale) {
		Sale selectedSale = new Sale(id, sale.getCashier(), sale.getProduct(), sale.getcRegister());
		return saleService.updateSale(selectedSale);
	}
	
	@DeleteMapping("/sales/{id}")
	public void deleteSale(@PathVariable(name = "id") Long id) {
		saleService.deleteSale(id);
	}
}
