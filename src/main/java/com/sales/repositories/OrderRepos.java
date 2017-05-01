package com.sales.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sales.models.Order;


//creates a repository for orders
@Repository
public interface OrderRepos extends CrudRepository<Order, Long> {	
}