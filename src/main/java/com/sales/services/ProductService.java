package com.sales.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.models.Product;
import com.sales.repositories.ProductRepos;

@Service("ProductService")
public class ProductService {
	
	@Autowired
	private ProductRepos prodRepos;
	
	public Product save(Product prod){
		
		return prodRepos.save(prod);
	} // save an order
	
	public ArrayList<Product> getProducts(){
		return (ArrayList<Product>) prodRepos.findAll();
	} // returns all the products
}