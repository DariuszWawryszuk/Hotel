package com.hotels.hotelsmanagement.customer.model;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer extends BaseEntity{


    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "pesel")
    private String pesel;
    @Column(name = "sex")
    private String sex;
    @Column(name = "card_number")
    private String cardNumber;
    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Column(name = "identity_doc_number")
    private String identityDocNumber;
    @Column(name = "identity_doc_type")
    private String identityDocType;
    @Column(name = "email")
    private String email;

    public Customer() {
    }

    @Embedded
    Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdentityDocNumber() {
        return identityDocNumber;
    }

    public void setIdentityDocNumber(String identityDocNumber) {
        this.identityDocNumber = identityDocNumber;
    }

    public String getIdentityDocType() {
        return identityDocType;
    }

    public void setIdentityDocType(String identityDocType) {
        this.identityDocType = identityDocType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
