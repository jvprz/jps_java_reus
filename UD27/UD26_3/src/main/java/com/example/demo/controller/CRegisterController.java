package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.CRegister;
import com.example.demo.service.CRegisterService;

@RestController
@RequestMapping("/api")
public class CRegisterController {

	@Autowired
	CRegisterService cRegisterService;
	
	@GetMapping("/register")
	public List<CRegister> listCRegisters() {
		return cRegisterService.listCRegisters();
	}
	
	@GetMapping("/register/{id}")
	public CRegister cRegisterById(@PathVariable(name = "id") Long id) {
		return cRegisterService.cRegisterById(id);
	}
	
	@PostMapping("/register")
	public CRegister saveCRegister(@RequestBody CRegister cRegister) {
		return cRegisterService.saveCRegister(cRegister);
	}
	
	@PutMapping("/register/{id}")
	public CRegister updateCRegister(@PathVariable(name = "id") Long id, @RequestBody CRegister cRegister) {
		CRegister selectedCRegister = new CRegister(id, cRegister.getFloor());
		return cRegisterService.updateCRegister(selectedCRegister);
	}
	
	@DeleteMapping("/register/{id}")
	public void deleteCRegister(@PathVariable(name = "id") Long id) {
		cRegisterService.deleteCRegister(id);
	}
}
