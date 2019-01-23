package com.hotels.hotelsmanagement.repository;

import com.hotels.hotelsmanagement.customer.model.Customer;
import com.hotels.hotelsmanagement.customer.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerRepositoryTests {

    @Autowired
    CustomerService customerService;

    @Test
    public void customerRepositoryTestCreate(){
        int customerCount = customerService.findAll().size();

        Customer customer = new Customer();
        customer.setFirstName("Adam");
        customer.setLastName("Nowak");
        customerService.save(customer);

        assertEquals("Dodanie Klienta", customerService.findAll().size(), customerCount + 1);
    }

    @Test
    public void customerRepositoryTestDelete(){
        Long id = customerService.findAll().get(0).getId();
        customerService.delete(id);
        assertEquals("Usuwanie Klienta", customerService.findById(id).get().getActive(), false);
    }
}
