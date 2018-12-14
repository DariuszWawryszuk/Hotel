package com.projekt.hotel.controllers;

import com.projekt.hotel.model.Customer;
import com.projekt.hotel.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CustomerControler {

    @Autowired
    CustomerService customerService;

    @PostMapping("/customer")
    Customer create(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @GetMapping("/customer")
    Iterable<Customer> read (){
        return customerService.findAll();
    }

    @PutMapping("/customer")
    Customer update (@RequestBody Customer customer){
        return  customerService.save(customer);
    }

    @DeleteMapping("/customer/{id}")
    void delete (@PathVariable int id){
        customerService.delete(id);
    }

    @GetMapping("/customer/{id}")
    Optional<Customer> findById(@PathVariable Integer id) {
        return customerService.findById(id);
    }

}

