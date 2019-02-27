package com.hotels.hotelsmanagement.employee;

import com.hotels.hotelsmanagement.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }

    public Iterable<Employee> serch(Integer employeeCode, String fistName, String lastName){

    }
}
