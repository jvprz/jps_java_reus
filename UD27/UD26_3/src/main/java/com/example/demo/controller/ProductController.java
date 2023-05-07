package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/products")
	public List<Product> listProducts() {
		return productService.listProducts();
	}
	
	@GetMapping("/products/{id}")
	public Product productById(@PathVariable(name = "id") Long id) {
		return productService.productById(id);
	}
	
	@PostMapping("/products")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	
	@PutMapping("/products/{id}")
	public Product updateProduct(@PathVariable(name = "id") Long id, @RequestBody Product product) {
		Product selectedProduct = new Product(id, product.getName(), product.getPrice());
		return productService.updateProduct(selectedProduct);
	}
	
	@DeleteMapping("/products/{id}")
	public void deleteProduct(@PathVariable(name = "id") Long id) {
		productService.deleteProduct(id);
	}
}
