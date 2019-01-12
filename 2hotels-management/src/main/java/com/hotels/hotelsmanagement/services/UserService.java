package com.hotels.hotelsmanagement.services;

import com.hotels.hotelsmanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void createUser(String userName, String password){
        PasswordEncoder pe = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        userRepository.createUser(userName, pe.encode(password));
    }

    public void addRole(String userName, String roleName){
        userRepository.addRoleToUser(userName, roleName);
    }
}
