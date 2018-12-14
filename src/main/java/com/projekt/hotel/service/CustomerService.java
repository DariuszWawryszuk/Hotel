package com.projekt.hotel.service;

import com.projekt.hotel.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface CustomerService extends CrudRepository<Customer, Integer> {

    Optional<Customer> findById(Integer id);
}

