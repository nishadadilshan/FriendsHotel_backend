package com.resturantapi.resturantapi.controller;


import com.resturantapi.resturantapi.entity.Customer;
import com.resturantapi.resturantapi.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/add")
    public Customer addNewCustomer(@RequestBody Customer newCustomer){
        Customer user = new Customer();
        user.setName(newCustomer.getName());
        user.setEmail(newCustomer.getEmail());
        customerRepository.save(user);
        return  user;
    }
}
