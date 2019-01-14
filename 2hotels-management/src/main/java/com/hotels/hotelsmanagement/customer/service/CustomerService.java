package com.hotels.hotelsmanagement.customer.service;

import com.hotels.hotelsmanagement.customer.modelDTO.CustomerDTO;
import com.hotels.hotelsmanagement.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    public List<CustomerDTO> fildAll() {return customerRepository.findAll();
    }
}

