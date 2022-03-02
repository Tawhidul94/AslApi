package com.api.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.api.entity.Product;

@Component
public interface ProductService {
	
	public Product saveProduct(Product product);
	
	public long updateProduct(Product Product);
	
	public long deleteProduct(Product product);
	
	public Product findProductByProductId(String productId);
	
	public List<Product> getAllProduct();

}
