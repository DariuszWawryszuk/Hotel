package com.hotels.hotelsmanagement.services;

import com.hotels.hotelsmanagement.domain.Hotel;
import com.hotels.hotelsmanagement.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelService {

    @Autowired
    HotelRepository hotelRepository;

    public void createHotel(String name, String street, String possesionNo, String zipCode, String city){
        hotelRepository.createHotel(name, street, possesionNo, zipCode, city);
    }

    public List<Hotel> getHotels(){
        return new ArrayList<>(hotelRepository.getHotels());
    }

    public Hotel getHotel(int id){
        return hotelRepository.getHotel(id);
    }

    public Hotel getHotel(String name){
        return hotelRepository.getHotel(name);
    }

    public void updateHotel(Hotel hotel){
        hotelRepository.updateHotel(hotel);
    }

    public void removeHotel(int id){
        hotelRepository.removeHotel(id);
    }

}
