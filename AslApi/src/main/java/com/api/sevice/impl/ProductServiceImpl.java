package com.api.sevice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.Product;
import com.api.repository.ProductRepository;
import com.api.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired private ProductRepository productRepository;
	
	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public long updateProduct(Product Product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long deleteProduct(Product product) {
		return 0;
		
		
	}

	@Override
	public Product findProductByProductId(String productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

}
