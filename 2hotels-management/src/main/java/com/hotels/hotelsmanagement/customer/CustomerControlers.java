package com.hotels.hotelsmanagement.customer;

import com.hotels.hotelsmanagement.customer.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/customer")
@CrossOrigin
public class CustomerControlers {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    List<Customer> allCustomers (){
        return customerService.findAll();
    }

    @GetMapping("/{id}")
    Optional<Customer> findById (@PathVariable Long id){
        return customerService.findById(id);
    }

    @GetMapping("/search")
    Iterable<Customer> findAll (@RequestParam(value = "firstName", required = false) String firstName,
                                @RequestParam(value = "lastName", required = false) String lastName,
                                @RequestParam(value = "pesel", required = false) String pesel){

        return customerService.search(firstName, lastName, pesel);

    }
    @PostMapping("/create")
    Customer createCustomer(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @PutMapping("/update")
    Customer update(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @DeleteMapping("/delete/{id}")
    void delete(@PathVariable Long id){
        customerService.delete(id);
    }
}
