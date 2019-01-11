package com.hotels.hotelsmanagement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppStarter implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("App Started");
    }
}
