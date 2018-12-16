package com.projekt.hotel.repository;

import com.projekt.hotel.model.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class CustomerRepository {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void createCustomer(String firstName, String lastName) {
        Customer customer = new Customer(firstName, lastName);
        em.persist(customer);

    }
}
