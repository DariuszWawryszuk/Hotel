package com.hotels.hotelsmanagement.customer.repository;

import com.hotels.hotelsmanagement.customer.modelDTO.CustomerDTO;

import java.util.List;

public interface CustomerRepository  {


    List<CustomerDTO> findAll();
}
