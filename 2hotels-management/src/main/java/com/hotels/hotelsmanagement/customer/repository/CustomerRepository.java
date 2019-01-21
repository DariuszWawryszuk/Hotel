package com.hotels.hotelsmanagement.customer.repository;

import com.hotels.hotelsmanagement.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Iterable<Customer> findByFirstNameAndLastName(String firstName, String lastName);

    Iterable<Customer> findByPesel(String pesel);

    Iterable<Customer> findByFirstName(String firstName);

    Iterable<Customer> findByLastName(String lastName);
    
    @Transactional
    @Modifying
    @Query("update Customer c set c.active = false where c.id = ?1")
    void delete(Long id);
}

