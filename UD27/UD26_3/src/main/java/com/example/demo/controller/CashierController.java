package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Cashier;
import com.example.demo.service.CashierService;

@RestController
@RequestMapping("/api")
public class CashierController {

	@Autowired
	CashierService cashierService;
	
	@GetMapping("/cashiers")
	public List<Cashier> listCashiers() {
		return cashierService.listCashiers();
	}
	
	@GetMapping("/cashiers/{id}")
	public Cashier cashierById(@PathVariable(name = "id") Long id) {
		return cashierService.cashierById(id);
	}
	
	@PostMapping("/cashiers")
	public Cashier saveCashier(@RequestBody Cashier cashier) {
		return cashierService.saveCashier(cashier);
	}
	
	@PutMapping("/cashiers/{id}")
	public Cashier updateCashier(@PathVariable(name = "id") Long id, @RequestBody Cashier cashier) {
		Cashier selectedCashier = new Cashier(id, cashier.getNames());
		return cashierService.updateCashier(selectedCashier);
	}
	
	@DeleteMapping("/cashiers/{id}")
	public void deleteCashier(@PathVariable(name = "id") Long id) {
		cashierService.deleteCashier(id);
	}
}
