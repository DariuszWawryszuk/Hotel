package com.hotels.hotelsmanagement.customer.repository;

import com.hotels.hotelsmanagement.customer.modelDTO.CustomerDTO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<CustomerDTO> findAll() {
        return null;
    }

}
