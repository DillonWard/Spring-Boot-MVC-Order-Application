package com.sales.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sales.models.Product;


//creates a repository for products
@Repository
public interface ProductRepos extends CrudRepository<Product, Long> {
}