package com.projekt.hotel;


import com.projekt.hotel.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Starter implements CommandLineRunner {

    @Autowired
    CustomerRepository customerRepository;


    public void run(String... strings) throws Exception{

        customerRepository.createCustomer("Ada", "Nowak");

    }
}

