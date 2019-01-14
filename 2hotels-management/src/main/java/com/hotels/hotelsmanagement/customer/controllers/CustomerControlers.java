package com.hotels.hotelsmanagement.customer.controllers;

import com.hotels.hotelsmanagement.customer.modelDTO.CustomerDTO;
import com.hotels.hotelsmanagement.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomerControlers {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    List<CustomerDTO> allCustomers (){
        return customerService.fildAll();
    }

}
