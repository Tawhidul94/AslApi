package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.entity.Product;
import com.api.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired private ProductService productService;
	
	
	@PostMapping("/save")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
		
	}
	
	@GetMapping("/show")
	public List<Product> getalldata(){
		return productService.getAllProduct();
	}

}
