package com.hotels.hotelsmanagement.customer.repository;

import com.hotels.hotelsmanagement.customer.model.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public abstract class CustomerRepositoryImpl implements CustomerRepository {

    @PersistenceContext
    private EntityManager em;

            public void delete(Long id){
                Customer customer = em.find(Customer.class, id);

                if(customer != null){
                    customer.setActive(false);
                    em.persist(customer);
                }

            }
}
