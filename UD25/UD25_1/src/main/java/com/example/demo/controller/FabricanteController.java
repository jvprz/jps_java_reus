package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.dto.Fabricante;
import com.example.demo.service.FabricanteService;

@RestController
@RequestMapping("/api")
public class FabricanteController {

	@Autowired
	FabricanteService fabricanteService;
	
	@GetMapping("/fabricantes")
	public List<Fabricante> listMaker() {
		return fabricanteService.listMaker();
	}
	
	@PostMapping("/fabricantes")
	public Fabricante saveMaker(@PathVariable(name="id") Long id, @RequestBody Fabricante maker) {
		return fabricanteService.saveMaker(maker);
	}
	
	@GetMapping("/fabricantes/{id}")
	public Fabricante makerById(@PathVariable(name="id") Long id, @RequestBody Fabricante maker) {
		Fabricante makerById = new Fabricante();
		makerById = fabricanteService.makerById(id);
		return makerById;
	}
	
	@PutMapping("/fabricantes/{id}")
	public Fabricante updateMaker(@PathVariable(name="id") Long id, @RequestBody Fabricante maker) {
		Fabricante makerSelected = new Fabricante();
		Fabricante makerUpdated = new Fabricante();
		makerSelected = fabricanteService.makerById(id);
		makerSelected.setName(maker.getName());
		makerUpdated = fabricanteService.updateMaker(makerSelected);
		return makerUpdated;
	}
	
	@DeleteMapping("/fabricantes/{id}")
	public void deleteMaker(@PathVariable(name="id") Long id) {
		fabricanteService.deleteMaker(id);
	}
}
