package com.sales.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.sales.models.Customer;


// creates a repository for customers
@Repository
public interface CustomerRepos extends CrudRepository<Customer, Long> {
}
