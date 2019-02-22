package com.hotels.hotelsmanagement.employee;
import com.hotels.hotelsmanagement.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

    Iterable<Employee> findByFirstNameAndLastName(String firstName, String lastName);

    Iterable<Employee> findByFirstName(String firstName);

    Iterable<Employee> findByLastName(String lastName);

    @Transactional
    @Modifying
    @Query("UPDATE Employee e SET e.active = false WHERE e.employeeCode=:employeeCode")
    void delete(@Param("employeeCode") Integer employeeCode);
}
