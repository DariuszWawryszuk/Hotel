package com.hotels.hotelsmanagement.customer.repository;

import com.hotels.hotelsmanagement.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Iterable<Customer> findByFirstNameAndLastName(String firstName, String lastName);

    Iterable<Customer> findByPesel(String pesel);

    Iterable<Customer> findByFirstName(String firstName);

    Iterable<Customer> findByLastName(String lastName);

    void delete(Long id);
}

