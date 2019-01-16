package com.hotels.hotelsmanagement.customer.controllers;

import com.hotels.hotelsmanagement.customer.model.Customer;
import com.hotels.hotelsmanagement.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/customer")
public class CustomerControlers {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    List<Customer> allCustomers (){
        return customerService.findAll();
    }

    @GetMapping("/customer/{id}")
    Optional<Customer> findById (@PathVariable Long id){
        return customerService.findById(id);
    }

    @GetMapping("/customer/search")
    Iterable<Customer> findAll (@RequestParam(value = "firstName", required = false) String firstName,
                                @RequestParam(value = "lastName", required = false) String lastName,
                                @RequestParam(value = "pesel", required = false) String pesel){

        return customerService.search(firstName, lastName, pesel);

    }
    @PostMapping("/create")
    Customer createCustomer(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @PutMapping("/customer")
    Customer update(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @DeleteMapping("/customer/{id}")
    void delete(@PathVariable Long id){
        customerService.delete(id);
    }
}
