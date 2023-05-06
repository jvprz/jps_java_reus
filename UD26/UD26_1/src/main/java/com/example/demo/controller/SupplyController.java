package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Supply;
import com.example.demo.service.SupplyService;

@RestController
@RequestMapping("/api")
public class SupplyController {

	@Autowired
	SupplyService supplyService;
	
	@GetMapping("/supplies")
	public List<Supply> listSuministros() {
		return supplyService.listSupplies();
	}
	
	@GetMapping("/supplies/{id}")
	public Supply suministroById(@PathVariable(name = "id") Long id) {
		Supply supplyxID = new Supply();
		supplyxID = supplyService.supplyById(id);
		return supplyxID;
	}
	
	@PostMapping("/supplies")
	public Supply saveSuministro(@RequestBody Supply supply) {
		return supplyService.saveSupply(supply);
	}
	
	@PutMapping("/supplies/{id}")
	public Supply updateSuministro(@PathVariable(name = "id") Long id, @RequestBody Supply supply) {
		Supply selectedSupply = new Supply(id, supply.getPiece(), supply.getSupplier(), supply.getPrice());
		Supply updatedSupply = new Supply();
		updatedSupply = supplyService.updateSupply(selectedSupply);
		return updatedSupply;
	}
	
	@DeleteMapping("/supplies/{id}")
	public void deleteSupply(@PathVariable(name = "id") Long id) {
		supplyService.deleteSupply(id);
	}
}
