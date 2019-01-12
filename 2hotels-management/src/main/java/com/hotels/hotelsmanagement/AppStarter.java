package com.hotels.hotelsmanagement;

import com.hotels.hotelsmanagement.domain.Hotel;
import com.hotels.hotelsmanagement.services.HotelService;
import com.hotels.hotelsmanagement.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppStarter implements CommandLineRunner {

    @Autowired
    UserService userService;

    @Autowired
    HotelService hotelService;

    @Override
    public void run(String... args) throws Exception {
        userService.createUser("admin", "pass");

        userService.addRole("admin", "ADMIN");
        userService.addRole("admin", "RECEPTIONIST");

        hotelService.createHotel("Hotel", "Krótka", "2A", "32-434", "Zakopane");
        /*
        System.out.println(hotelService.getHotels().size());
        Hotel hotel = hotelService.getHotel("Hotel");
        System.out.println(hotel);
        hotelService.removeHotel(hotel.getId());
        */

        System.out.println("App Started");
    }
}
