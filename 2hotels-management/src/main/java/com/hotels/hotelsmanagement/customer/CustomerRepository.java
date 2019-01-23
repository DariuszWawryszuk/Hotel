package com.hotels.hotelsmanagement.customer;

import com.hotels.hotelsmanagement.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Iterable<Customer> findByFirstNameAndLastName(String firstName, String lastName);

    Iterable<Customer> findByPesel(String pesel);

    Iterable<Customer> findByFirstName(String firstName);

    Iterable<Customer> findByLastName(String lastName);

    @Transactional
    @Modifying
    @Query("UPDATE Customer c SET c.active = false WHERE c.id=:id")
    void delete(@Param("id") Long id);
}

