package com.hotels.hotelsmanagement.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    private String street;
    private String possesionNo;
    private String zipCode;
    private String city;

    private String status;

    public static final String HOTEL_STATUS_ACTIVE = "A";
    public static final String HOTEL_STATUS_REMOVED = "R";

    public Hotel(){

    }

    public Hotel(String name, String street, String possesionNo, String zipCode, String city) {
        this.name = name;
        this.street = street;
        this.possesionNo = possesionNo;
        this.zipCode = zipCode;
        this.city = city;
        this.status = Hotel.HOTEL_STATUS_ACTIVE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPossesionNo() {
        return possesionNo;
    }

    public void setPossesionNo(String possesionNo) {
        this.possesionNo = possesionNo;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", possesionNo='" + possesionNo + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
