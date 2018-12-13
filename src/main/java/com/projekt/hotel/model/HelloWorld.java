package com.projekt.hotel.model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/hello") // wskazanie pod jakim adresem dostępna jest metoda
    public String hello() { // sygnatura metody
        return "Hello World! :)"; // zwracana wartość przez przeglądarkę
    }
}
