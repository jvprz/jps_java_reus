package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.dto.*;
import com.example.demo.service.ArticuloService;

@RestController
@RequestMapping("/api")
public class ArticuloController {
	
	@Autowired
	ArticuloService articuloService;
	
	@GetMapping("/articulos")
	public List<Articulo> listArticle() {
		return articuloService.listArticles();
	}
	
	@PostMapping("/articulos")
	public Articulo saveArticle(@RequestBody Articulo article) {
		return articuloService.saveArticle(article);
	}
	
	@GetMapping("/articulos/fabricante/{maker}")
	public List<Articulo> listArticleMaker(@PathVariable(name="id") Long id) {
		Fabricante maker = new Fabricante();
		maker.setId(id);
		return articuloService.listArticleMaker(maker);
	}
	
	@GetMapping("/articulos/{id}")
	public Articulo articleById(@PathVariable(name="id") Long id, @RequestBody Articulo article) {
		Articulo articleById = new Articulo();
		articleById = articuloService.articleById(id);
		return articleById;
	}
	
	@PutMapping("/articulos/{id}")
	public Articulo updateArticle(@PathVariable(name="id") Long id, @RequestBody Articulo article) {
		Articulo articleSelected = new Articulo();
		Articulo articleUpdated = new Articulo();
		articleSelected = articuloService.articleById(id);
		articleSelected.setName(article.getName());
		articleUpdated = articuloService.updateArticle(articleSelected);
		return articleUpdated;
	}
	
	@DeleteMapping("/articulos/{id}")
	public void deleteArticle(@PathVariable(name="id") Long id) {
		articuloService.deleteArticle(id);
	}
}
