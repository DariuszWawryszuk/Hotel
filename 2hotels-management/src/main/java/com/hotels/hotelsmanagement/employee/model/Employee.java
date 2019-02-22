package com.hotels.hotelsmanagement.employee.model;

import javax.persistence.*;
import javax.validation.constraints.Email;


@Table(name = "employees")
@Entity
public class Employee {

    @Id
    @Column(name = "employee_code")
    private Integer employeeCode;

    @Column(name = "first_name")
    private String fistName;

    @Column(name = "last_name")
    private String lastName;

    @Email
    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private int phoneNumber;

    @ManyToOne
    @JoinColumn(name = "role")
    private Role role;

    @Column(name = "active")
    private boolean active;


    public Employee() {}

    public Integer getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(Integer employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @PrePersist
    private void preInsertSetActive() {
        this.active=true;
    }
}
