package com.hotels.hotelsmanagement.customer;

import com.hotels.hotelsmanagement.customer.model.Customer;
import com.hotels.hotelsmanagement.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    public List<Customer> findAll() {return customerRepository.findAll(); }

    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    public Iterable<Customer> search(String firstName, String lastName, String pesel) {

        if(firstName != null && lastName != null )
            return customerRepository.findByFirstNameAndLastName(firstName, lastName);
        else if(firstName != null)
            return customerRepository.findByFirstName(firstName);
        else if (lastName != null)
            return customerRepository.findByLastName(lastName);
        else if (pesel != null)
            return customerRepository.findByPesel(pesel);
        else
            return customerRepository.findAll();

    }

    public void delete(Long id) {
        customerRepository.delete(id);
    }
}




