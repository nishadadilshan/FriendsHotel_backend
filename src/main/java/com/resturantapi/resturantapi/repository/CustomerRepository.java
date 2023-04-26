package com.resturantapi.resturantapi.repository;

import com.resturantapi.resturantapi.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer , Integer> {
}
