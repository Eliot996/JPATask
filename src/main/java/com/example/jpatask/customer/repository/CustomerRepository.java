package com.example.jpatask.customer.repository;

import com.example.jpatask.customer.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerCrudRepository extends CrudRepository<Customer, Long> {

}
